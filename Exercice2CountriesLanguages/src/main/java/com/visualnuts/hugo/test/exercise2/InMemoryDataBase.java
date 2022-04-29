package com.visualnuts.hugo.test.exercise2;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class InMemoryDataBase {
	private static InMemoryDataBase instance;
	private List<Country> countriesDataStore;
	
	public static InMemoryDataBase getInstance() {
		if(instance == null) {
			synchronized(InMemoryDataBase.class){  
			     if (instance == null){  
			        	instance = new InMemoryDataBase();  
			      } 
			}
		}
		return instance;
	}
	
	public InMemoryDataBase() {
		Gson gson = new Gson();
		Type countryListType = new TypeToken<List<Country>>(){}.getType();
		countriesDataStore = gson.fromJson(dataString, countryListType);
	}
	
	public List<Country> getAll() {
		return countriesDataStore;
	}
	
	public Country getByCode(String code) {
		return countriesDataStore.stream()
				.filter(c -> c.getCountry().equalsIgnoreCase(code))
				.findFirst().get();
	}
	
	public Set<String> getAllLanguages(){
		Set<String> languages = new HashSet<String>();
		for(Country country: countriesDataStore) {
			languages.addAll(country.getLanguages());
		}
		return languages;
	}
	
	private static String dataString = "[\n"
			+ "    {\n"
			+ "        \"country\": \"US\",\n"
			+ "        \"languages\": [\"en\"]\n"
			+ "    },\n"
			+ "    {\n"
			+ "        \"country\": \"BE\",\n"
			+ "        \"languages\": [\"nl\",\"fr\",\"de\"\n"
			+ "        ]\n"
			+ "    },\n"
			+ "    {\n"
			+ "        \"country\": \"NL\",\n"
			+ "        \"languages\": [\"nl\",\"fy\"]\n"
			+ "    },\n"
			+ "    {\n"
			+ "        \"country\": \"DE\",\n"
			+ "        \"languages\": [\"de\"]\n"
			+ "    },\n"
			+ "    {\n"
			+ "        \"country\": \"ES\",\n"
			+ "        \"languages\": [\"es\"]\n"
			+ "    }\n"
			+ "]";
}

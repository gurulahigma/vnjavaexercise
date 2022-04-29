package com.visualnuts.hugo.test.exercise2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class CountryRepositoryImpl implements CountryRepository{
	private InMemoryDataBase database = InMemoryDataBase.getInstance();
	
	public int countAll() {
		return database.getAll().size();
	}

	public String countryWithMustOfficialLanguages(String language) {
		String countryCode = "";
		int highLanguageQuant = 0;
		List<Country> countries = database.getAll();
		for(Country country: countries) {
			if(country.speaks(language)&&highLanguageQuant<country.getLanguages().size()) {
				highLanguageQuant = country.getLanguages().size();
				countryCode = country.getCountry();
			}
		}
		return countryCode;
	}

	public int countAllLanguages(String... countries) {
		Set<String> languages = new HashSet<String>();
		for(String countryCode: countries) {
			Country country = database.getByCode(countryCode);
			languages.addAll(country.getLanguages());
		}
		return languages.size();
	}

	public String countryWithHighestNumberLanguages() {
		String countryCode = "";
		int highLanguageQuant = 0;
		List<Country> countries = database.getAll();
		for(Country country: countries) {
			if(highLanguageQuant<country.getLanguages().size()) {
				highLanguageQuant = country.getLanguages().size();
				countryCode = country.getCountry();
			}
		}
		return countryCode;
	}

	public String theMustCommonLanguages() {
		Set<String> existingLanguages = database.getAllLanguages();
		String mustCommonLanguage = "";
		int countSpoken = 0;
		
		for(String language: existingLanguages) {
			if(countSpoken < countCountryWhoSpeak(language)) {
				countSpoken = countCountryWhoSpeak(language);
				mustCommonLanguage = language;
			}
		}
		
		return mustCommonLanguage;
	}
	
	private int countCountryWhoSpeak(String language) {
		List<Country> countries = database.getAll();
		int countSpoken = 0;
		for(Country country: countries) {
			if(country.speaks(language)) {
				countSpoken++;
			}
		}
		return countSpoken;
	}

}

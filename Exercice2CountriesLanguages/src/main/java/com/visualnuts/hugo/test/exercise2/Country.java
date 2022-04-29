package com.visualnuts.hugo.test.exercise2;

import java.util.Set;

public class Country {
	private String country;
	private Set<String> languages;
	
	public Country() {
	}

	public Country(String country, Set<String> languages) {
		this.country = country;
		this.languages = languages;
	}
	
	public boolean speaks(String language) {
		return languages.contains(language);
	}
	
	public String getCountry() {
		return country;
	}
	public Set<String> getLanguages() {
		return languages;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setLanguages(Set<String> languages) {
		this.languages = languages;
	}
}

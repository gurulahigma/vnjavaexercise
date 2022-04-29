package com.visualnuts.hugo.test.exercise2;

public interface CountryRepository {
	int countAll();
	String countryWithMustOfficialLanguages(String language);
	int countAllLanguages(String... countries);
	String countryWithHighestNumberLanguages();
	String theMustCommonLanguages();
}

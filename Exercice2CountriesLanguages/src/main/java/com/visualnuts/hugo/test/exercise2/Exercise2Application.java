package com.visualnuts.hugo.test.exercise2;

public class Exercise2Application {
	
	public static void main(String[] args) {
		CountryRepository countryRepository = new CountryRepositoryImpl();
		
		System.out.println("Number of World countries : " + countryRepository.countAll());
		System.out.println("The country with the most official language who speak German is: " + countryRepository.countryWithMustOfficialLanguages("de"));	
		System.out.println("Quantity of official languages spoken in US, BE, NL, DE, ES : " + countryRepository.countAllLanguages("US", "BE", "NL", "DE", "ES"));
		System.out.println("The country with the the highest number of official languages is: " + countryRepository.countryWithHighestNumberLanguages());
		System.out.println("The most common official language(s), of all countries is : " + countryRepository.theMustCommonLanguages());
		
	}
}

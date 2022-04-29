# VisualNuts Java Exercises
# Project Description
## Introduction
This project is the solution to the VisualNuts, Java Tech skill interview;

So we have 2 (two) Java maven project
1. Exercise1PrintNumber: is the solution to the Exercise 1, the number printing exercise 
2. Exercise2CountriesLanguages: is the solution to the Exercise 2. 

## Evolutions Exercise 1
I loosly coupled the print() function by putting this the interface,
So any other functionality ou adjustment has to implements the interface instead of modifying an existing code.
Secondly once the PrintNumbers is instanced you can't modify it state (attribuite) because this are finals, to prevent accidentas modifications.

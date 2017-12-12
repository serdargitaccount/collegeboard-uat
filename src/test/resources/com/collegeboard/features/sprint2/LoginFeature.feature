@Regresssion @Login
Feature: Login Feature

Scenario Outline: the user tries to login with valid and invalid credentials
	Given the user enters the "<username>" and the "<password>"
	

Examples:

|username    		|  password 		| 
|abcdefg			   	| 1234567		|
|clepogrencisi		| abcdefg		|
| abcdef				| Clepsifresi3	|
| 					|	efgh			|
|abcdefgh			| 				|
|					| 				|








	





# **_MineSweeper API_** 

**Student Name:** Ciaran Whyte </br>
**Student ID:** G00254624 </br>
**Course:** Software Development </br>
**Current Year:** 4th Year </br>
**Module:** Mobile Application Development </br>
**Lecturer:** Martin Kenirons </br>

## **_Introduction_**
This is a Minesweeper API used as part of the Minesweeper game i have created. It used JAX-RS and the Jersey framework. The API itself is
very simple and consists of just GET and POST endpoints for both submitting and retrieving high score data. 

## **_Database_**
The database being used being the API is an SQL database with nine tables. One to hold the highscores of each type of game that can be
played on the application. These tables have three fields. Id(int), username(varchar), userscore(int).

## **_The URL's_**
Here is a quick breakdown of the two different URL's

URL| Method | Description
----- | ------ | -------------
Domain/Minesweeper/webapi/scores/{:key} | GET | This retrieves high scores from the API's database and sends them back. The table being read from depends on the key provided.
Domain/Minesweeper/webapi/scores/{:key} | POST | This sends high scores to the API's database when the user wins and submits a score. The table being inserted into depends on the key provided.

## **_References_**
I learned JAX-RS some time ago but the tutorials i used to first learn it are below, they contain everything i used and more:
1. [JAX-RS] (https://www.youtube.com/watch?v=xkKcdK1u95s&list=PLqq-6Pq4lTTZh5U8RbdXq0WaYvZBz2rbn)

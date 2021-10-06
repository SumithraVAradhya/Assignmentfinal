## UI final assignment.

## File Structure

## To run the test suite(default browser is chrome)
`mvn clean test`

## Main 
---> Flights.java

     The url of the flights in cleartrip.com is automated.

     The arrival and departure dates are automated.

---> Hotels.java

     The url of the hotels in cleartrip.com is automated.

     A city is searched.

---> SignIn.java

     Using the email and password the user account signed in.

## To set up the Browser 

    Change the property name Browser in the data.properties file
    Browser can be changed from Chrome/Firefox


## To run SignInTest
   
    test/java/SignInTest
    For invalid credentials the error message is asserted.

## To run FlightTest

    test/java/FlightTest
    A flight price is searched and asserted. 

## To run HotelTest

    test/java/HotelTest
    A hotel price is searched and asserted. 

## To run BaseTest

    test/java/BaseTest
    The values of corresponding cities and dates for flights and hotels are sent
    BaseTest performs the operations of all the three test classes i.e FlightTest, HotelTest and SignInTest class.





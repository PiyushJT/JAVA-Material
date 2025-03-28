/*

You are going to predict rain in today’s exam.
Ask user to enter Temperature (in Celsius) , Humidity (in percentag), and Wind Speed(km/h)
Throw an  Exception : RainException() :
    if temperature is >=25 , Humidity is > = 70 and Wind Speed > = 15
& Handle it to notify user that “Please keep Umbrella with you”
Otherwise
    Throw LessRainException() : & Handle it to notify user that “Less Possibility of Rain You Can Enjoy Your Day”
Note: Both must be Unchecked Exceptions

*/

import java.util.Scanner;

class Program108 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Temp (in C): ");
        float temp = sc.nextFloat();

        System.out.println("Enter Humidity (in %): ");
        float humidity = sc.nextFloat();

        System.out.println("Enter Wind speed (in Km/h): ");
        float windSpeed = sc.nextFloat();


        if (temp >= 25 && humidity >= 70 && windSpeed >= 15) {
            try {
                throw new RainException();
            }
            catch (RainException e) {
                System.out.println("Please keep Umbrella with you");
            }
        }
        else {
            try {
                throw new LessRainException();
            }
            catch (LessRainException e) {
                System.out.println("Less Possibility of Rain You Can Enjoy Your Day");
            }
        }


    }

}

class RainException extends RuntimeException {

    RainException(){
        super("It may rain today");
    }
}

class LessRainException extends RuntimeException {

    LessRainException(){
        super("It may not rain today");
    }
}


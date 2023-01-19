import java.util.Scanner;

public class WeatherproofClothing {
    public static void main(String[] args) {
        //Prompt user to give details about the weather - input required = description (i.e. "sunny", "rainy", etc.)
        // and average temp in degrees Celsius (i.e. 8,18,28,etc.)
        System.out.println("What are the weather conditions today? Please provide one of the following descriptions: Sunny, Rainy, Windy, Snowy AND provide the average temperature in degrees Celsius (e.g. 15");

        //collect user input
        Scanner input = new Scanner(System.in);
        String weatherDescription = input.nextLine();
        int averageTemp = input.nextInt();

        // if it is sunny or temp >12, print 'It sounds nice and warm today, wear a light jumper'
        // if it is sunny but the temp is <12, print 'It's nice but still cold, you should wear a jacket'
        // if it is rainy/windy/snowy and temp <12, print 'It doesn't sound very nice today, wear a waterproof winter coat'
        // if it is rainy/windy and temp >12, print 'Although it is warm you should wear a raincoat'
        // if temp >20, print 'It's T-shirt weather, hooray!'
        // otherwise, print 'Error'

        if((weatherDescription.equals("Sunny")) && (averageTemp >= 12)) {
            System.out.println("It sounds nice and warm today, wear a light jumper");
        } else if (weatherDescription.equals("Sunny") && (averageTemp < 12)) {
            System.out.println("It's nice but still cold, you should wear a jacket");
        } else if ((weatherDescription.equals("Rainy") || weatherDescription.equals("Windy") || weatherDescription.equals("Snowy")) && (averageTemp < 12)) {
            System.out.println("It doesn't sound very nice today, wear a waterproof winter coat");
        } else if ((weatherDescription.equals("Rainy") || weatherDescription.equals("Windy") && (averageTemp >= 12))) {
            System.out.println("Although it's warm you should wear a raincoat");
        } else if (averageTemp >= 20) {
            System.out.println("It's T-shirt weather, hooray!");
        } else {
            System.out.println("Error");
        }


    }
}

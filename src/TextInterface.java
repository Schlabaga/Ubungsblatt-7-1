import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;

public class TextInterface {


    public static void main(String[] args) {
         List<ConversionStrategy> strategies = List.of(
            new CelsiusToFahrenheitStrategy(),
            new FahrenheitToCelsiusStrategy(),
            new KilometerToMileStrategy(),
            new MileToKilometerStrategy(),
            new CelciusToKelvinStrategy(),
            new KelvinToCelciusStrategy());

        while (true) {

            int value = 0;
            int choice = 0;
            int acc = 0;

            System.out.println("\n\nChoose an option: \n");

            for(ConversionStrategy conversionStrategy : strategies){
                acc +=1;
                System.out.println(acc + ". " + conversionStrategy.getDescription());
            }

            System.out.println("\n");
            Scanner scanner = new Scanner(System.in);

            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Stopping...");
                break;
            }

            System.out.println( "Enter the value to be converted: (Enter any non numerical key to stop process) \n");
            try {
                value = scanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Stopping...");
                break;
            }

            float result1 = 0;



            switch (choice) {
                case 1:
                    ConversionStrategy celsiusToFahrenheit = new CelsiusToFahrenheitStrategy();
                    result1 = celsiusToFahrenheit.convert(value);
                    System.out.println( value  + " °C in Fahrenheit: " + result1 +" F");
                    break;
                case 2:
                    ConversionStrategy fahrenheitToCelcius = new FahrenheitToCelsiusStrategy();
                    result1 = fahrenheitToCelcius.convert(value);
                    System.out.println(value + " °F in Celcius: " + result1);
                    break;

                case 3:
                    ConversionStrategy kilometerToMileStrategy = new KilometerToMileStrategy();
                    result1 = kilometerToMileStrategy.convert(value);
                    System.out.println(value + " Kilometers in Miles: " + result1);
                    break;

                case 4:
                    ConversionStrategy mileToKilometerStrategy = new MileToKilometerStrategy();
                    result1 = mileToKilometerStrategy.convert(value);
                    System.out.println(value + " Miles in Kilometers: " + result1);
                    break;

                case 5:
                    ConversionStrategy celciusToKelvinStrategy= new CelciusToKelvinStrategy();
                    result1 = celciusToKelvinStrategy.convert(value);
                    System.out.println(value + " Celcius in Kelvin: " + result1);
                    break;

                case 6:
                    ConversionStrategy kelvinToCelciusStrategy = new KelvinToCelciusStrategy();
                    result1 = kelvinToCelciusStrategy.convert(value);
                    System.out.println(value + " Kelvin in Celcius: " + result1);
                    break;

            }
        }
    }
}

public class ConverterTestDrive {

    public static void main(String[] args) {

        // Test der Umrechnung Celsius → Fahrenheit
        System.out.println("Test der Umrechnung Celsius -> Fahrenheit:");
        ConversionStrategy celsiusToFahrenheit = new CelsiusToFahrenheitStrategy();
        float result1 = celsiusToFahrenheit.convert(0);  // 0°C → 32°F
        System.out.println("0°C in Fahrenheit: " + result1);  // Sollte 32.0 anzeigen

        float result2 = celsiusToFahrenheit.convert(100);  // 100°C → 212°F
        System.out.println("100°C in Fahrenheit: " + result2);  // Sollte 212.0 anzeigen

        // Test der Umrechnung Fahrenheit → Celsius
        System.out.println("\nTest der Umrechnung Fahrenheit -> Celsius:");
        ConversionStrategy fahrenheitToCelsius = new FahrenheitToCelsiusStrategy();
        float result3 = fahrenheitToCelsius.convert(32);  // 32°F → 0°C
        System.out.println("32°F in Celsius: " + result3);  // Sollte 0.0 anzeigen

        float result4 = fahrenheitToCelsius.convert(212);  // 212°F → 100°C
        System.out.println("212°F in Celsius: " + result4);  // Sollte 100.0 anzeigen

        // Test der Umrechnung Kilometer → Meilen
        System.out.println("\nTest der Umrechnung Kilometer -> Meilen:");
        ConversionStrategy kmToMiles = new KilometerToMileStrategy();
        float result5 = kmToMiles.convert(1);  // 1 km → 0.621371 Meilen
        System.out.println("1 km in Meilen: " + result5);  // Sollte 0.621371 anzeigen

        // Test der Umrechnung Meilen → Kilometer
        System.out.println("\nTest der Umrechnung Meilen -> Kilometer:");
        ConversionStrategy milesToKm = new MileToKilometerStrategy();
        float result6 = milesToKm.convert(1);  // 1 Meile → 1.60934 km
        System.out.println("1 Meile in Kilometer: " + result6);  // Sollte 1.60934 anzeigen
    }
}

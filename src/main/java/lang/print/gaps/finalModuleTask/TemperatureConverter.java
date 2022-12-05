package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double celsius = temperatureCelsius;
        double fahrenheit = 0;
        fahrenheit = (celsius * 1.8)+32;
        System.out.println(fahrenheit);
    }
}

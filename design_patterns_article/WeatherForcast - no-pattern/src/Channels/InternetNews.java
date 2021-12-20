package Channels;

import WeatherForcast.WeatherForcast;

public class InternetNews {
    public void updateWeatherStatus(WeatherForcast weatherForcast) {
        System.out.println("Internet - najnowsza prognoza pogody: temperatura: " +
                weatherForcast.getTemperature() + "stopni, " +
                "ciśnienie: " + weatherForcast.getPressure() + " hPa");
    }
}

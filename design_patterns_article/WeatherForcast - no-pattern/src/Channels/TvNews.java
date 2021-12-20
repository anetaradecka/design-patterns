package Channels;

import WeatherForcast.WeatherForcast;

public class TvNews {

    public void updateWeatherStatus(WeatherForcast weatherForcast) {
        System.out.println("Telewizja - najnowsza prognoza pogody: temperatura: " +
                weatherForcast.getTemperature() + "stopni, " +
                "ciśnienie: " + weatherForcast.getPressure() + " hPa");
    }
}

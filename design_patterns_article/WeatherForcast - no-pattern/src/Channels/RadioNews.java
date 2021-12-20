package Channels;

import WeatherForcast.WeatherForcast;

public class RadioNews {

    public void updateWeatherStatus(WeatherForcast weatherForcast) {
        System.out.println("Radio - najnowsza prognoza pogody: temperatura: " +
                weatherForcast.getTemperature() + "stopni, " +
                "ciśnienie: " + weatherForcast.getPressure() + " hPa");
    }
}

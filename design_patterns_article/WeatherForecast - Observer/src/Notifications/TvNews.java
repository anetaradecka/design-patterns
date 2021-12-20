package Notifications;

import WeatherForcast.WeatherForcast;

public class TvNews implements Observer{
    @Override
    public void update(WeatherForcast weatherForcast) {
        System.out.println("Telewizja - nowa prognoza pogody: temperatura: " +
                weatherForcast.getTemperature() + "stopni, " +
                "ciśnienie: " + weatherForcast.getPressure() + " hPa");
    }
}

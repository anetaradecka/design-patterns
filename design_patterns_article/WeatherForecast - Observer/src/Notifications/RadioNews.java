package Notifications;

import WeatherForcast.WeatherForcast;

public class RadioNews implements Observer{
    @Override
    public void update(WeatherForcast weatherForcast) {
        System.out.println("Radio - nowa prognoza pogody: temperatura: " +
                weatherForcast.getTemperature() + "stopni, " +
                "ciśnienie: " + weatherForcast.getPressure() + " hPa");
    }
}


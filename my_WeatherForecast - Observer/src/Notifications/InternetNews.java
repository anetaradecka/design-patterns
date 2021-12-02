package Notifications;

import WeatherForcast.WeatherForcast;

public class InternetNews implements Observer {
    @Override
    public void update(WeatherForcast weatherForcast) {
        System.out.println("Internet - nowa prognoza pogody: temperatura: " +
                weatherForcast.getTemperature() + "stopni, " +
                "ciśnienie: " + weatherForcast.getPressure() + " hPa");
    }
}


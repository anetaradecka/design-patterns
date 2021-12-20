package Notifications;

import WeatherForcast.WeatherForcast;

public interface Observer {

    void update(WeatherForcast weatherForcast);
}


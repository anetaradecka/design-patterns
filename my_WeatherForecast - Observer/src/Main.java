import Notifications.InternetNews;
import Notifications.RadioNews;
import Notifications.TvNews;
import WeatherForcast.WeatherForcast;

public class Main {
    public static void main(String[] args) {

        WeatherForcast weatherForcast = new WeatherForcast(25, 1002);

        TvNews tvNews = new TvNews();
        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();

        weatherForcast.registerObserver(tvNews);
        weatherForcast.registerObserver(radioNews);
        weatherForcast.registerObserver(internetNews);

        weatherForcast.notifyObservers();

        System.out.println("Nowa prognoza pogody: ");

        weatherForcast.unregisterObserver(tvNews);
        System.out.println();
        weatherForcast.updateWeatherForcast(30, 960);
    }
}
import Channels.InternetNews;
import Channels.RadioNews;
import Channels.TvNews;
import WeatherForcast.WeatherForcast;

public class Main {

    public static void main(String[] args) {
        WeatherForcast weatherForcast = new WeatherForcast(25, 1050);

        InternetNews internetNews = new InternetNews();
        RadioNews radioNews = new RadioNews();
        TvNews tvNews = new TvNews();

        internetNews.updateWeatherStatus(weatherForcast);
        radioNews.updateWeatherStatus(weatherForcast);
        tvNews.updateWeatherStatus(weatherForcast);
    }
}

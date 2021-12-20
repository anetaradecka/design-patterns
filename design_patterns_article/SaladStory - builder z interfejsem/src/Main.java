import SaladStory.GreekSalad;
import SaladStory.Salad;
import SaladStory.SaladDirector;

public class Main {
    public static void main(String[] args) {
        GreekSalad greekSalad = new GreekSalad();
        SaladDirector greekSaladDirector = new SaladDirector((greekSalad));
        greekSaladDirector.prepareSalad();

        Salad salad = greekSaladDirector.getSalad();

        System.out.println(salad);
    }
}

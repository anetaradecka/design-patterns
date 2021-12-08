import chef.Chef;
import chef.eggCooker.HardBoiledEggCooker;
import chef.eggCooker.SoftBoiledEggCooker;

public class Main {
    public static void main(String[] args) {

        Chef chef = new Chef("Gordon Gessler");
        chef.setEggCoker(new HardBoiledEggCooker());
        chef.cook();

        chef.setEggCoker(new SoftBoiledEggCooker());
        chef.cook();

    }
}

package chef;

import chef.eggCooker.EggCooker;

public class Chef {
    private String name;
    private EggCooker eggCoker;

    public Chef(String name) {
        this.name = name;
    }
    public void cook() {
        this.eggCoker.cookEgg();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EggCooker getEggCoker() {
        return eggCoker;
    }

    public void setEggCoker(EggCooker eggCoker) {
        this.eggCoker = eggCoker;
    }
}

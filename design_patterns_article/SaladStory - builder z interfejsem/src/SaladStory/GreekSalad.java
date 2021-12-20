package SaladStory;

public class GreekSalad implements SaladMaker {
    private Salad salad;

    public GreekSalad() {
        this.salad = new Salad();
    }

    @Override
    public void addLettuce() {
        this.salad.setLettuce("lettuce");
    }

    @Override
    public void addTomatoes() {
        this.salad.setTomatoes("tomatoes");
    }

    @Override
    public void addOlives() {
        this.salad.setOlives("olives");
    }

    @Override
    public void addChicken() {
        this.salad.setChicken("chicken");
    }

    @Override
    public void addTuna() {
        this.salad.setTuna("tuna");
    }

    @Override
    public void addEggs() {
        this.salad.setEggs("eggs");
    }

    @Override
    public void addOnion() {
        this.salad.setOnion("onion");
    }

    @Override
    public void addMango() {
        this.salad.setMango("mango");
    }

    @Override
    public void addCucumber() {
        this.salad.setCucumber("cucumber");
    }

    @Override
    public void addAvocado() {
        this.salad.setAvocado("avocado");
    }

    @Override
    public void addBacon() {
        this.salad.setBacon("bacon");
    }

    @Override
    public void addCroutons() {
        this.salad.setCroutons("croutons");
    }

    @Override
    public void addCheese() {
        this.salad.setCheese("cheese");
    }

    @Override
    public Salad getSalad() {
        return salad;
    }
}

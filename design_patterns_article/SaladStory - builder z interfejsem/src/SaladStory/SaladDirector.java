package SaladStory;

public class SaladDirector {
    private SaladMaker saladMaker;

    public SaladDirector(SaladMaker saladMaker) {
        this.saladMaker = saladMaker;
    }

    public void prepareSalad() {
        saladMaker.addLettuce();
        saladMaker.addBacon();
        saladMaker.addAvocado();
        saladMaker.addCheese();
        saladMaker.addChicken();
        saladMaker.addCucumber();
        saladMaker.addMango();
        saladMaker.addEggs();
        saladMaker.addOnion();
        saladMaker.addTuna();
        saladMaker.addCroutons();
    }

    public Salad getSalad() {
        return this.saladMaker.getSalad();
    }
}

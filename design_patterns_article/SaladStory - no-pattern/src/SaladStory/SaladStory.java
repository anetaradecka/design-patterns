
package SaladStory;

public class SaladStory {
    private String lettuce;
    private String tomatoes;
    private String olives;
    private String chicken;
    private String tuna;
    private String eggs;
    private String onion;
    private String mango;
    private String cucumber;
    private String avocado;
    private String bacon;
    private String croutons;
    private String cheese;

    //Greek salad constructor
    public SaladStory(String lettuce, String tomatoes, String olives, String onion, String cucumber, String cheese) {
        this.lettuce = lettuce;
        this.tomatoes = tomatoes;
        this.olives = olives;
        this.onion = onion;
        this.cucumber = cucumber;
        this.cheese = cheese;
    }

    //Caesar salad constructor
    public SaladStory(String lettuce, String tomatoes, String chicken, String eggs, String bacon, String croutons) {
        this.lettuce = lettuce;
        this.tomatoes = tomatoes;
        this.chicken = chicken;
        this.eggs = eggs;
        this.bacon = bacon;
        this.croutons = croutons;
    }

    //Nicoise salad constructor
    public SaladStory(String lettuce, String tomatoes, String olives, String tuna, String eggs, String avocado) {
        this.lettuce = lettuce;
        this.tomatoes = tomatoes;
        this.olives = olives;
        this.tuna = tuna;
        this.eggs = eggs;
        this.avocado = avocado;
    }

    //Mango Chicken salad constructor
    public SaladStory(String lettuce, String chicken, String onion, String mango, String cucumber) {
        this.lettuce = lettuce;
        this.chicken = chicken;
        this.onion = onion;
        this.mango = mango;
        this.cucumber = cucumber;
    }

    public String getLettuce() {
        return lettuce;
    }

    public void setLettuce(String lettuce) {
        this.lettuce = lettuce;
    }

    public String getTomatoes() {
        return tomatoes;
    }

    public void setTomatoes(String tomatoes) {
        this.tomatoes = tomatoes;
    }

    public String getOlives() {
        return olives;
    }

    public void setOlives(String olives) {
        this.olives = olives;
    }

    public String getChicken() {
        return chicken;
    }

    public void setChicken(String chicken) {
        this.chicken = chicken;
    }

    public String getTuna() {
        return tuna;
    }

    public void setTuna(String tuna) {
        this.tuna = tuna;
    }

    public String getEggs() {
        return eggs;
    }

    public void setEggs(String eggs) {
        this.eggs = eggs;
    }

    public String getOnion() {
        return onion;
    }

    public void setOnion(String onion) {
        this.onion = onion;
    }

    public String getMango() {
        return mango;
    }

    public void setMango(String mango) {
        this.mango = mango;
    }

    public String getCucumber() {
        return cucumber;
    }

    public void setCucumber(String cucumber) {
        this.cucumber = cucumber;
    }

    public String getAvocado() {
        return avocado;
    }

    public void setAvocado(String avocado) {
        this.avocado = avocado;
    }

    public String getBacon() {
        return bacon;
    }

    public void setBacon(String bacon) {
        this.bacon = bacon;
    }

    public String getCroutons() {
        return croutons;
    }

    public void setCroutons(String croutons) {
        this.croutons = croutons;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    @Override
    public String toString() {
        return "SaladStory{" +
                "lettuce='" + lettuce + '\'' +
                ", tomatoes='" + tomatoes + '\'' +
                ", olives='" + olives + '\'' +
                ", chicken='" + chicken + '\'' +
                ", tuna='" + tuna + '\'' +
                ", eggs='" + eggs + '\'' +
                ", onion='" + onion + '\'' +
                ", mango='" + mango + '\'' +
                ", cucumber='" + cucumber + '\'' +
                ", avocado='" + avocado + '\'' +
                ", bacon='" + bacon + '\'' +
                ", croutons='" + croutons + '\'' +
                ", cheese='" + cheese + '\'' +
                '}';
    }
}


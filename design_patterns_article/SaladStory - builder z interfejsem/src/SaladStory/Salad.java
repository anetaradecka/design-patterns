package SaladStory;

public class Salad {
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
        return "SaladStory.Salad{" +
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

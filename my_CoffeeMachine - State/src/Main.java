public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(new NoCoinState());

        coffeeMachine.insertTheCoin();
        coffeeMachine.pushTheButton();
        coffeeMachine.takeTheCup();
    }
}

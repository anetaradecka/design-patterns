public class CoffeeMachine {

    State state;

    public CoffeeMachine(State state) {
        state = new NoCoinState();
    }

    public void insertTheCoin() {

        state.insertTheCoin(this);

    }

    public void pushTheButton() {
        state.pushTheButton(this);
    }

    public void takeTheCup() {
        state.takeTheCup(this);
    }

    public void returnTheCoin() {
        state.returnTheCoin(this);
    }

}

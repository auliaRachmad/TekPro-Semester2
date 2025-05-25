public class Memento implements IMemento {
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    @Override
    public String getState() {
        return state;
    }
}
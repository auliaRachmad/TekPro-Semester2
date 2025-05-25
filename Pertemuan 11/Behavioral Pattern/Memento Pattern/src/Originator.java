public class Originator implements IOriginator {
    private String state;

    @Override
    public void setState(String state) {
        this.state = state;
        System.out.println("State diubah ke: " + this.state);
    }

    @Override
    public IMemento saveStateToMemento() {
        System.out.println("Menyimpan state: " + state);
        return new Memento(state);
    }

    @Override
    public void getStateFromMemento(IMemento memento) {
        this.state = memento.getState();
        System.out.println("State dikembalikan ke: " + state);
    }
}
public interface IOriginator {
    void setState(String state);
    IMemento saveStateToMemento();
    void getStateFromMemento(IMemento memento);
}
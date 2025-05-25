public class MementoDemo {
    public static void main(String[] args) {
        IOriginator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State 1");
        originator.setState("State 2");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State 3");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State 4");

        originator.getStateFromMemento(caretaker.get(0));
    }
}
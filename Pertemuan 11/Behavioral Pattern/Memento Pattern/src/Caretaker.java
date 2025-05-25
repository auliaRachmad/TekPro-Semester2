import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<IMemento> mementoList = new ArrayList<>();

    public void add(IMemento memento) {
        mementoList.add(memento);
    }

    public IMemento get(int index) {
        return mementoList.get(index);
    }
}
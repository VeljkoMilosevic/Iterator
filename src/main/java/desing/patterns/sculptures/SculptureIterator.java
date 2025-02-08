package desing.patterns.sculptures;

import desing.patterns.iterator.Iterator;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class SculptureIterator implements Iterator<AbstractMap.SimpleEntry<Sculpture, Period>> {

    private final Map<Sculpture, Period> sculptures;
    private final List<Sculpture> sculpturesList;
    private int index;

    public SculptureIterator(Map<Sculpture, Period> sculptures) {
        this.sculptures = sculptures;
        sculpturesList = sculptures.keySet().stream().toList();
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < sculptures.size();
    }

    @Override
    public AbstractMap.SimpleEntry<Sculpture, Period> getNext() {
        if (hasNext()) {
            final Sculpture sculpture = sculpturesList.get(index++);
            return new AbstractMap.SimpleEntry<>(sculpture,
                    sculptures.get(sculpture));
        }
        throw new NoSuchElementException("No more sculptures to " +
                "iterate" +
                " over!");
    }
}

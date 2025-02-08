package desing.patterns.sculptures;

import desing.patterns.iterator.Iterator;

import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SculptureDepartment {

    private final Map<Sculpture, Period> sculptures;

    public SculptureDepartment() {
        sculptures = new LinkedHashMap<>();
    }

    public void addSculpture(Sculpture sculpture, Period period) {
        sculptures.put(sculpture, period);
    }

    public Iterator<AbstractMap.SimpleEntry<Sculpture, Period>> getIterator() {
        return new SculptureIterator(sculptures);
    }

}

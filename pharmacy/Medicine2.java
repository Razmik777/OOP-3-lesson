package pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medicine2 implements Iterable<MedicineComponent> {

    private List<MedicineComponent> components;
    private int index;

    public Medicine2() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public Medicine2 addComponent(MedicineComponent component) {
        components.add(component);
        return this;
    }

    @Override
    public Iterator<MedicineComponent> iterator() {
        return new Iterator<MedicineComponent>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public MedicineComponent next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public String toString() {
        return "Medicine: " + components.toString();
    }
   
}

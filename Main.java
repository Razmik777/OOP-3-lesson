import pharmacy.Medicine;
import pharmacy.Medicine2;
import pharmacy.MedicineComponent;
import pharmacy.impl.Asitromin;
import pharmacy.impl.Penicilin;
import pharmacy.impl.Vetbicit;
import pharmacy.impl.Water;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<MedicineComponent> medList = new ArrayList<>();

        MedicineComponent asitromin = new Asitromin("Asitromin", 50, 100);
        MedicineComponent penicilin = new Penicilin("Penicilin", 30, 50);
        MedicineComponent vetbicit = new Vetbicit("Vetbicit", 40, 150);
        MedicineComponent water = new Water("Water", 15, 0);

        Medicine medicine = new Medicine();
        medicine.addComponent(asitromin).addComponent(penicilin).addComponent(vetbicit).addComponent(water);

        Collections.sort(medicine.components, Comparator.comparingInt(value -> value.getPower()));
        System.out.println(medicine);
        
        Medicine2 medicine1 = new Medicine2();
        medicine1.addComponent(asitromin).addComponent(penicilin).addComponent(vetbicit);

        // for (MedicineComponent component : medicine1) {
        // System.out.println(component);
        // }

        // Iterator<MedicineComponent> med = medicine1;
        // while (medicine1.hasNext()) {
        // System.out.println(med.next());
        // }

        // for (MedicineComponent component : medicine1) {
        // System.out.println(component);
        // }

        medList.add(vetbicit);
        medList.add(asitromin);
        medList.add(penicilin);
        medList.add(water);

        // System.out.println(medList);

        Collections.sort(medList, (comp1, comp2) -> (int) (comp1.getWeight() - comp2.getWeight()));
        Collections.sort(medList, Comparator.reverseOrder());

        System.out.println(medList);
    }
}

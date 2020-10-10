package org.abstractCharges.elementsStructuraux;

import org.abstractCharges.ChargesFactory;

public class PorteursMixtes1 extends Porteurs {
    ChargesFactory typesCharges;
    public PorteursMixtes1(ChargesFactory typesCharges){
        this.typesCharges = typesCharges;
    }
    public void chargesAppliquees(){
        System.out.println("Porteurs mixtes type 1");
        typesCharges.createChargesHorizontales();
        typesCharges.createChargesVerticales();
    }
}

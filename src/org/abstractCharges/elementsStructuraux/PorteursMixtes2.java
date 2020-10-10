package org.abstractCharges.elementsStructuraux;

import org.abstractCharges.ChargesFactory;

public class PorteursMixtes2 extends Porteurs{
    ChargesFactory typesCharges;
    public PorteursMixtes2(ChargesFactory typesCharges){
        this.typesCharges = typesCharges;
    }

    public void chargesAppliquees(){
        System.out.println("Porteurs mixtes type 2");
        typesCharges.createChargesVerticales();
        typesCharges.createChargesHorizontales();
    }
}

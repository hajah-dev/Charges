package org.abstractCharges.elementsStructuraux;

import org.abstractCharges.ChargesFactory;

public class PorteursHorizontaux extends Porteurs {
    ChargesFactory typesCharges;
    public PorteursHorizontaux (ChargesFactory typesCharges){
        this.typesCharges = typesCharges;
    }
    public void chargesAppliquees(){
        System.out.println("Porteurs Horizontaux");
        typesCharges.createChargesHorizontales();
    }
}

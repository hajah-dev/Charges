package org.abstractCharges.elementsStructuraux;

import org.abstractCharges.ChargesFactory;

public class PorteursVerticaux extends Porteurs{
    ChargesFactory typeCharges;
    public PorteursVerticaux(ChargesFactory typeCharges){
        this.typeCharges = typeCharges;
    }

    public void chargesAppliquees(){
        System.out.println("Porteurs verticaux");
        typeCharges.createChargesVerticales();
    }
}

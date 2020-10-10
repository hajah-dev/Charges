package org.abstractCharges;

import org.abstractCharges.types.ChargesHorizontales;
import org.abstractCharges.types.ChargesVerticales;
import org.abstractCharges.types.PoidsPropre;
import org.abstractCharges.types.PousseeDesTerres;

public class ChargesMixtes1 extends ChargesFactory{
    public ChargesVerticales createChargesVerticales(){
        return new PoidsPropre();
    }
    public ChargesHorizontales createChargesHorizontales(){
        return new PousseeDesTerres();
    }
}

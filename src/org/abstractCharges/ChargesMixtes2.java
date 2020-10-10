package org.abstractCharges;

import org.abstractCharges.types.*;

public class ChargesMixtes2 extends ChargesFactory{
    public ChargesVerticales createChargesVerticales(){
        return new PoidsPropre();
    }
    public ChargesVerticales createChargesVerticales2(){
        return new ChargesExploitation();
    }

    public ChargesHorizontales createChargesHorizontales(){
        return new ChargesdusAuxVents();
    }
    public ChargesHorizontales createChargesHorizontales2(){
        return new ChargesdusAuxSeismes();
    }
}

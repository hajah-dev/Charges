package org.abstractCharges;

import org.abstractCharges.types.ChargesExploitation;
import org.abstractCharges.types.ChargesHorizontales;
import org.abstractCharges.types.ChargesVerticales;
import org.abstractCharges.types.PoidsPropre;

public class FlexionSimple extends ChargesFactory {
    public ChargesVerticales createChargesVerticales(){
        return new PoidsPropre();
    }
    public ChargesVerticales createChargesVerticales2(){
        return new ChargesExploitation();
    }
    public ChargesHorizontales createChargesHorizontales(){
        return null;
    }
}

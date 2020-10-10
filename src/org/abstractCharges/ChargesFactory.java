package org.abstractCharges;

import org.abstractCharges.types.ChargesHorizontales;
import org.abstractCharges.types.ChargesVerticales;

public abstract class ChargesFactory {
    public abstract ChargesVerticales createChargesVerticales();
    public abstract ChargesHorizontales createChargesHorizontales();
}

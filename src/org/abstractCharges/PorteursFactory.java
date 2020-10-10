package org.abstractCharges;

import org.abstractCharges.elementsStructuraux.Porteurs;

public abstract class PorteursFactory {
    public abstract Porteurs createPorteurs(String type);
}

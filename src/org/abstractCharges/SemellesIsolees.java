package org.abstractCharges;

import org.abstractCharges.elementsStructuraux.*;

public class SemellesIsolees extends PorteursFactory{
    public Porteurs createPorteurs(String type){
        Porteurs porteurs;
        ChargesFactory typesCharges = new ChargesMixtes2();
        switch (type.toLowerCase()){
            case "horizontaux":
                porteurs = new PorteursHorizontaux(typesCharges);
                break;
            case "verticaux":
                porteurs = new PorteursVerticaux(typesCharges);
                break;
            case "mixtes1":
                porteurs = new PorteursMixtes1(typesCharges);
                break;
            case "mixtes2":
                porteurs = new PorteursMixtes2(typesCharges);
                break;
            default: throw new IllegalArgumentException("Porteurs introuvable");
        }
        porteurs.chargesAppliquees();
        porteurs.roles("Murs de soutenement -> Support charges verticales et poussée des terres");
        return porteurs;
    }
}

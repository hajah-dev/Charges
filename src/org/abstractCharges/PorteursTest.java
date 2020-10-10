package org.abstractCharges;

public class PorteursTest {
    public static void main(String[] args) {
            System.out.println("Starting test");
            PorteursFactory poteaux = new Poteaux();
            poteaux.createPorteurs("verticaux");
            System.out.println("***");
            PorteursFactory poutres = new Poutres();
            poutres.createPorteurs("horizontaux");
            System.out.println("***");
            PorteursFactory soutenements = new Soutenement();
            soutenements.createPorteurs("mixtes1");
            System.out.println("***");
            PorteursFactory semelles = new SemellesIsolees();
            semelles.createPorteurs("mixtes2");
            System.out.println("End");

    }
}

package cz.czechitas.lekce5;

import cz.czechitas.lekce5.model.Adresa;
import cz.czechitas.lekce5.model.Osoba;

/**
 * Hlaví třída pro lekci 5.
 */
public class HlavniProgram {

    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String... args) {

        Adresa adresa = new Adresa();
        adresa.setUlice("Moje ulice");
        adresa.setCastObce("Haje");
        adresa.setObec("Praha");
        adresa.setPsc("14800");

        Osoba lenka = new Osoba();
        lenka.setJmeno("Lenka");
        lenka.setPrijmeni("Erbenova");
        lenka.setPracovniEmail("mojePrace@moje-prace.cz");
        lenka.setRodneCislo("115811/1111");
        lenka.setAdresa(adresa);

        System.out.println(adresa); //no need to put here toString(), automatically called;
        System.out.println(lenka);

        System.out.println("Slavnostně přísahám, že jsem připraven ke každé špatnosti.");
    }

}

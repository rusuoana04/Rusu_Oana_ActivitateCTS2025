package cts.rusu.oana.g1118.main;

import cts.rusu.oana.g1118.prototype.Rezervare;

public class Main {
    public static void main(String[] args)
    {
        Rezervare rezervare1= new Rezervare("nume1", 2, "12345678");
        Rezervare rezervare2= (Rezervare) rezervare1.copy();

        System.out.println("Rezervare1: "+rezervare1);
        System.out.println("Rezervare2: "+rezervare2);

    }
}
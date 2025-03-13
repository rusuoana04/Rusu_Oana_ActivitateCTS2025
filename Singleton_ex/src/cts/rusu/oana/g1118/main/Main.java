package cts.rusu.oana.g1118.main;

import cts.rusu.oana.g1118.pattern.singleton.Agentie;

public class Main {
    public static void main(String[] args)
    {
        //chiar daca crem un obiect nou in main ne afiseaza tot obiectul creat in clasa care nu poate fi mofificat
        Agentie a1= Agentie.getInstance("Agentie2", 20000, 45);
        System.out.println(a1);
        System.out.println("Nume "+a1.getNume());
    }
}
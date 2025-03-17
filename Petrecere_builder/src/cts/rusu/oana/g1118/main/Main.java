package cts.rusu.oana.g1118.main;

import cts.rusu.oana.g1118.pattern.builder.Petrecere;
import cts.rusu.oana.g1118.pattern.builder.PetrecereBuilder;

public class Main {
    public static void main(String[] args)
    {
        PetrecereBuilder builder= new PetrecereBuilder();
        Petrecere p1= builder.setAreArtificii(true)
                .setNrPersoane(20)
                .setAreTort(true).build();

        System.out.println(p1);
    }
}
package cts.rusu.oana.g1118.main;

import cts.rusu.oana.g1118.builder.Spital;
import cts.rusu.oana.g1118.builder.SpitalBuilder;

public class Main {
    public static void main(String[] args)
    {
         SpitalBuilder spital= new SpitalBuilder();

        Spital s1= spital.setPatRabatabil(true).setMicDejunInclus(true).setPapuciCamera(false).setHalatInterior(false).build();
        System.out.println(s1);
    }
}
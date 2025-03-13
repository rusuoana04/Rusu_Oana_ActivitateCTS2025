package cts.rusu.oana.g1118.main;

import cts.rusu.oana.g1118.pattern.builder.PachetTransport;
import cts.rusu.oana.g1118.pattern.builder.PachetTransportBuilder;

public class Main {
    public static void main(String[] args)
    {
        PachetTransport pachetTransport = new PachetTransportBuilder()
                .setHasWifi(true).setFumator(true).setHasTV(true).build();


        System.out.println(pachetTransport.toString());
    }
}
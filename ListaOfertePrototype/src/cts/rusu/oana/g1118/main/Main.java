package cts.rusu.oana.g1118.main;

import cts.rusu.oana.g1118.prototype.ListaOferte;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {

        List<String> listaoferte1= new ArrayList<>();
        listaoferte1.add("oferta1");
        listaoferte1.add("oferta2");
        listaoferte1.add("oferta3");

        ListaOferte lista1= new ListaOferte();
        lista1.setOferte(listaoferte1);

        System.out.println("Lista1 originala: "+ lista1);

        ListaOferte lista2= (ListaOferte) lista1.copy();

        System.out.println("Lista2 copiata: "+ lista2);

    }
}
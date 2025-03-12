package ro.ase.acs.main;

import ro.ase.acs.classes.Angajat;

public class Main {
    public static void main(String[] args) {

        String[] denumireproiect= new String[]{"denumire1, den2"};

        Angajat a1 =new Angajat ("ion", "ion", 20, 85, 2, denumireproiect, "student", 1000);
        System.out.println(a1);

      a1.finantare();
    }
}
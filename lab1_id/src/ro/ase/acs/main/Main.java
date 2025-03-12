package ro.ase.acs.main;

import ro.ase.acs.classes.Angajat;
import ro.ase.acs.classes.Elev;

public class Main {
    public static void main(String[] args) {

        String[] denumireproiect= new String[]{"denumire1, den2"};

        Angajat a1 =new Angajat ("ion", "ion", 20, 85, 2, denumireproiect, "student", 1000);
        System.out.println(a1);

      a1.finantare();
        a1.status();

      Elev e1= new Elev("Ionescu ", "Gigel", 13, 65, 1, denumireproiect, 7, "Gigel Giorgel");
        System.out.println(e1);
        e1.finantare();
        e1.status();


    }


}
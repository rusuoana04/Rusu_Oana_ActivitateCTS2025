package ro.ase.acs.main;

import ro.ase.acs.classes.Angajat;
import ro.ase.acs.classes.Elev;
import ro.ase.acs.classes.Student;

public class Main {
    public static void main(String[] args) {

        String[] denumireproiect= new String[]{"denumire1, den2"};

        Angajat a1 =new Angajat ("Ion", "Ion", 20, 85, 2, denumireproiect, "IT", 10000);
        System.out.println("\n");
        System.out.println(a1);

      a1.finantare();
        a1.status();
        System.out.println("\n");

      Elev e1= new Elev("Ionescu ", "Gigel", 13, 65, 1, denumireproiect, 7, "Gigel Giorgel");
        System.out.println(e1);
        e1.finantare();
        e1.status();
        System.out.println("\n");

        Student s1=new Student("Alexandrescu", "Alex", 20, 95, 5, denumireproiect, "ASE", 1);
        System.out.println(s1);
        s1.finantare();
        s1.status();
        System.out.println("\n");

    }


}
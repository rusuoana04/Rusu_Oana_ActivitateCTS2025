package ro.ase.acs.classes;

import java.util.Arrays;

public class Elev extends Aplicant{

    private int clasa;
    private String tutore;

    public Elev() {
       super();
    }

    public Elev(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
        super(nume, prenume, varsta, punctaj, nr_proiecte, denumireProiect);
        this.clasa = clasa;
        this.tutore = tutore;
    }

    public int getClasa() {
        return clasa;
    }

    public String getTutore() {
        return tutore;
    }

    public void setClasa(int clasa) {
        this.clasa = clasa;
    }

    public void setTutore(String tutore) {
        this.tutore = tutore;
    }

    @Override
    public String toString() {
        return "Elev{" +
                "clasa=" + clasa +
                ", tutore='" + tutore + '\'' +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", punctaj=" + punctaj +
                ", nr_proiecte=" + nr_proiecte +
                ", denumireProiect=" + Arrays.toString(denumireProiect) +
                '}';
    }

    public int finantare() {
        int s=30;
        System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste "+s+" Euro/zi in proiect.");
        return s;
    }

    @Override
    public void status() {
        super.status();
    }
}

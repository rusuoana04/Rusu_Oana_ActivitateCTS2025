package ro.ase.acs.classes;

import java.util.Arrays;

public class Angajat extends Aplicant
{

    private String ocupatie;
    private int salariu;

    public Angajat()
    {
        super();
    }

    public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String ocupatie, int salariu) {
        super(nume, prenume, varsta, punctaj, nr_proiecte, denumireProiect);
        this.ocupatie = ocupatie;
        this.salariu = salariu;
    }

    public String getOcupatie() {
        return ocupatie;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "ocupatie='" + ocupatie + '\'' +
                ", salariu=" + salariu +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", punctaj=" + punctaj +
                ", nr_proiecte=" + nr_proiecte +
                ", denumireProiect=" + Arrays.toString(denumireProiect) +
                '}';
    }

    public int finantare()
    {
        int s=10;
        System.out.println("Angajatul "+ getNume()+ " "+getPrenume()+ " primeste " +s+ " Euro/zi in proiect");
        return s;
    }
}

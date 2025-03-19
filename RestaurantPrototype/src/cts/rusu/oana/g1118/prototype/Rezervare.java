package cts.rusu.oana.g1118.prototype;

public class Rezervare implements IRezervare
{
    private String nume;
    private int nrPersoane;
    private String numarTelefon;

    public Rezervare()
    {

    }

    public Rezervare(String nume, int nrPersoane, String numarTelefon)
    {
        super();
        this.nume = nume;
        this.nrPersoane = nrPersoane;
        this.numarTelefon = numarTelefon;
    }

    @Override
    public IRezervare copy()
    {
        Rezervare copie= new Rezervare();
        copie.nume=this.nume;
        copie.nrPersoane=this.nrPersoane;
        copie.numarTelefon=this.numarTelefon;
        return copie;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "nume='" + nume + '\'' +
                ", nrPersoane=" + nrPersoane +
                ", numarTelefon='" + numarTelefon + '\'' +
                '}';
    }
}

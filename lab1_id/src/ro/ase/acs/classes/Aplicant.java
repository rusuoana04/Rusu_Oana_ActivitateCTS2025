package ro.ase.acs.classes;

public class Aplicant

{
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    protected int nr_proiecte;
    protected String[] denumireProiect;


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getPunctaj() {
        return punctaj;
    }

    public int getNr_proiecte() {
        return nr_proiecte;
    }

    public String[] getDenumireProiect() {
        return denumireProiect;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setPunctaj(int punctaj) {
        this.punctaj = punctaj;
    }

    public void setNr_proiecte(int nr_proiecte) {
        this.nr_proiecte = nr_proiecte;
    }

    public void setDenumireProiect(String[] denumireProiect) {
        this.denumireProiect = denumireProiect;
    }

    public void status()
    {
        if(punctaj>80)
        {
            System.out.println("Aplicantul "+nume+" "+prenume+" a fost acceptat");
        }
            else
            {
                System.out.println("Aplicantul "+nume+" "+prenume+" nu a fost acceptat");
            }

    }

    public Aplicant()
    {
        super();
    }

    public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
        super();

        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.punctaj = punctaj;
        this.nr_proiecte = nr_proiecte;
        this.denumireProiect = denumireProiect;
    }


}



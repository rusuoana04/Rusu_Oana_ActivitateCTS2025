package ro.ase.acs.classes;

import java.util.Arrays;

public class Student extends Aplicant
{
    protected  String facultate;
    protected int an_studii;

    public Student()
    {
        super();
    }

    public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int an_studii) {
        super(nume, prenume, varsta, punctaj, nr_proiecte, denumireProiect);
        this.facultate = facultate;
        this.an_studii = an_studii;
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public int getAn_studii() {
        return an_studii;
    }

    public void setAn_studii(int an_studii) {
        this.an_studii = an_studii;
    }

    @Override
    public String toString() {
        return "Student{" +
                "facultate='" + facultate + '\'' +
                ", an_studii=" + an_studii +
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
        int s=20;
        System.out.println("Studentul "+ getNume()+ " "+ getPrenume()+ "primeste " +s+ " Euro/zi in proiect");
        return  s;
    }
}

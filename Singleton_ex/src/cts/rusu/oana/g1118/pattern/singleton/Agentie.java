package cts.rusu.oana.g1118.pattern.singleton;

public class Agentie
{
    private String nume;
    private float capital;
    private int numarAngajati;

    private static final Agentie instance = new Agentie();

    public Agentie()
    {
        this.nume= "Transfero";
        this.capital=10000;
        this.numarAngajati=50;

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    //practic tre sa adaug metoda asta
   public static Agentie getInstance(String nume, float capital, int numarAngajati)
   {
       return instance;
   }

    @Override
    public String toString() {
        return "Agentie= {" +
                "nume= '" + nume + '\'' +
                ", capital= " + capital +
                ", numarAngajati= " + numarAngajati +
                '}';
    }
}

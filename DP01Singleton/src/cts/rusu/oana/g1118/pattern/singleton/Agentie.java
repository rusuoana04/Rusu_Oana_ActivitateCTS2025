package cts.rusu.oana.g1118.pattern.singleton;

public class Agentie
{
    private String numeAgentie;
    private float capital;
    private int numarAngajati;

    private static final Agentie instanta= new Agentie();

    public Agentie()
    {
        this.numeAgentie="AgeTur";
        this.capital=1000;
        this.numarAngajati=5;

    }

    public Agentie(String numeAgentie, float capital, int numarAngajati) {
        this.numeAgentie = numeAgentie;
        this.capital = capital;
        this.numarAngajati = numarAngajati;
    }

    public String getNumeAgentie() {
        return numeAgentie;
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
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

    public  static Agentie getInstance(String  nume, float capital, int numarAngajati)
    {
        return  instanta;

    }

    @Override
    public String toString() {
        return "Agentie{" +
                "numeAgentie='" + numeAgentie + '\'' +
                ", capital=" + capital +
                ", numarAngajati=" + numarAngajati +
                '}';
    }
}

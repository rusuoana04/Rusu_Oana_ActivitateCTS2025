package cts.rusu.oana.g1118.builder;

public abstract class IProdus
{
    private  String nume;

    public IProdus(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

public  abstract void afiseazaDetalii();
}

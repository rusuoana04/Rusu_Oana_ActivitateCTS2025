import java.util.ArrayList;
import java.util.List;

public class Jucator implements IJucator{

    private String numeJucator;
    private String tip;
    private List<String> listaAntrenamente;

    private static List<String> listaMedicamenteInterzise = new ArrayList<>(List.of("Substanta A", "Substanta B", "Substanta C"));





    public Jucator(String numeJucator, String tip, List<String> listaAntrenamente) {
        this.numeJucator = numeJucator;
        this.tip = tip;
        this.listaAntrenamente = new ArrayList<>(listaAntrenamente);
    }

    @Override
    public IJucator clone() {
        return new Jucator(this.numeJucator, this.tip, this.listaAntrenamente);

    }

    @Override
    public String toString() {
        return "Jucator{" +
                "numeJucator='" + numeJucator + '\'' +
                ", tip='" + tip + '\'' +
                ", listaAntrenamente=" + listaAntrenamente ;
    }


    public  void adaugaAntrenament(String antrenament) {
        listaAntrenamente.add(antrenament);
    }

    public void afiseazaAntrenamente()
    {
        System.out.println("Nume: "+numeJucator+" Tip jucator:"+tip+ " Antrenamente: "+ listaAntrenamente );

    }


    public static void adaugaMedicamentInterzis(String medicament) {
        listaMedicamenteInterzise.add(medicament);
    }

    public void afiseazaMedicamente()
    {
        System.out.println("Nume: "+numeJucator+" Tip jucator:"+tip+ "Medicamente interzise:"+ listaMedicamenteInterzise );

    }

    public void verificaDoping()
    {
        System.out.println("Jucatorul: " + numeJucator+ " a fost testat de doping");

    }





}

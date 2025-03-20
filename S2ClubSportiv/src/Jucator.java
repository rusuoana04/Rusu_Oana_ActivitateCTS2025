import java.util.ArrayList;
import java.util.List;

public class Jucator implements IJucator{

    private String numeJucator;
    private String tip;
    private List<String> listaAntrenamente;

    private  List<String> listaMedicamenteInterzise = new ArrayList<>();





    public Jucator(String numeJucator, String tip, List<String> listaAntrenamente) {
        this.numeJucator = numeJucator;
        this.tip = tip;
        this.listaAntrenamente = new ArrayList<>(listaAntrenamente);
        this.listaMedicamenteInterzise= new ArrayList<>(listaMedicamenteInterzise);
    }

    @Override
    public IJucator clone() {
       Jucator copy= new Jucator(this.numeJucator, this.tip, this.listaAntrenamente);
       copy.listaMedicamenteInterzise= new ArrayList<>(this.listaMedicamenteInterzise);
       return  copy;

    }

    @Override
    public String toString() {
        return "Jucator{" +
                "numeJucator='" + numeJucator + '\'' +
                ", tip='" + tip + '\'' +
                ", listaAntrenamente=" + listaAntrenamente + '\'' +
                ", listaMedicamenteInterzise= [ " +listaMedicamenteInterzise+ " ]";
    }


    public  void adaugaAntrenament(String antrenament) {
        listaAntrenamente.add(antrenament);
    }

    public void afiseazaAntrenamente()
    {
        System.out.println("Nume: "+numeJucator+" Tip jucator:"+tip+ " Antrenamente: "+ listaAntrenamente );

    }


    public  void adaugaMedicamentInterzis(String medicament) {
        listaMedicamenteInterzise.add(medicament);
    }

    public void afiseazaMedicamente()
    {
        System.out.println("Nume: "+numeJucator+" Tip jucator:"+tip+ "Medicamente interzise:"+ listaMedicamenteInterzise );

    }

    public void verificaDoping()
    {
        System.out.println("Jucatorul: " + numeJucator+ " a fost testat de doping");
        if(!listaMedicamenteInterzise.isEmpty())
        {
            System.out.println("Jucatorul e pozitiv");
        }
        else
        {
            System.out.println("Jucatorul e negativ");
        }

    }





}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<String> antrenamente=new ArrayList<>();
        antrenamente.add("viteza");
        antrenamente.add("forta");
        antrenamente.add("incalzire");

        List<String> medicamente= new ArrayList<>();
        medicamente.add("SubstantaA");
        medicamente.add("SubstantaB");



        Jucator jucator1= new Jucator("Popescu Ion", "portar", antrenamente);


        System.out.println("Jucator original: " + jucator1);


        Jucator jucator2= (Jucator) jucator1.clone();
        System.out.println("Jucator clonat: " + jucator2);

        jucator2.adaugaAntrenament("brate");
        System.out.println(" Afisatre lista actualizata antrenamente Jucatorul 2 : ");
        jucator2.afiseazaAntrenamente();

        jucator2.adaugaMedicamentInterzis(String.valueOf(medicamente));
        System.out.println(" Afisatre lista actualizata medicamente Jucatorul 2 : ");
        jucator2.afiseazaMedicamente();

        System.out.println(" Afisare rezultare testare jucatori medicamente interzise");
        jucator2.verificaDoping();
        jucator1.verificaDoping();

    }
}
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



        Jucator jucator1= new Jucator("Popescu Ion", "portar", antrenamente);


        System.out.println("Jucator original: " + jucator1);


        Jucator jucator2= (Jucator) jucator1.clone();
        System.out.println("Jucator clonat: " + jucator2);


    }
}
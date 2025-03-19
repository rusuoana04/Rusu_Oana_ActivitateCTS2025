public class Main {
    public static void main(String[] args)
    {
       Cerc cerc1=new Cerc("rosu", 10);
       Cerc c2=cerc1.clone();

        System.out.println("Cerc1: "+ cerc1);

       System.out.println("Cerc2: "+c2);

    }
}
public class Cerc extends   Forma{

    private int raza;

    public Cerc(String culoare, int raza) {
        super(culoare);
        this.raza = raza;
    }



    @Override
    public Cerc clone() {
        return new Cerc(this.culoare, this.raza);
    }

//    public  void afisare()
//    {
//        System.out.println("culoare cerc: "+culoare+ ", raza: "+ raza);
//    }


    @Override
    public String toString() {
        return "Cerc{" +
                "raza=" + raza +
                ", culoare='" + culoare + '\'' +
                '}';
    }
}

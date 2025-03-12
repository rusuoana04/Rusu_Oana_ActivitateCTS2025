package cts.rusu.oana.g1118.builder;

public final class Eticheta implements IEticheta
{

    private final String informatii;

    public  Eticheta(String informatii)
    {
        this.informatii= informatii ==null || informatii.isBlank() ? "Informatii implicite " : informatii;
    }


    @Override
    public String getInformatii() {
        return informatii;
    }

    @Override
    public void setInformatii(String informatii)
    {
        throw  new UnsupportedOperationException("Eticheta finala si nu permite modificare");
    }


}

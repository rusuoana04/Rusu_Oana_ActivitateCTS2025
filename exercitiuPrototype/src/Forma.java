public abstract class Forma implements IPrototype
{
    protected String culoare;

    public Forma(String culoare)
    {
        this.culoare=culoare;
    }

    public void setCuloare(String culoare)
    {
        this.culoare=culoare;
    }

    public String getCuloare() {
        return culoare;
    }

    @Override
    public abstract Forma clone();
}

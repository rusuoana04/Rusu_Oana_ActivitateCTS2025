package cts.rusu.oana.g1118.builder;

public class SpitalBuilder implements Builder
{
private Spital spital;

public SpitalBuilder()
{
    spital= new Spital(false, false, false, false);
}

    @Override
    public Spital build() {
        return spital;
    }

    public SpitalBuilder setPatRabatabil(boolean patRabatabil) {
        this.spital.setPatRabatabil(patRabatabil);
        return  this;
    }

    public SpitalBuilder setMicDejunInclus(boolean micDejunInclus) {
        this.spital.setMicDejunInclus(micDejunInclus);
        return  this;
    }

    public SpitalBuilder setPapuciCamera(boolean papuciCamera) {
        this.spital.setPapuciCamera(papuciCamera);
        return  this;
    }

    public SpitalBuilder setHalatInterior(boolean halatInterior) {
        this.spital.setPapuciCamera(halatInterior);
        return  this;
    }



}


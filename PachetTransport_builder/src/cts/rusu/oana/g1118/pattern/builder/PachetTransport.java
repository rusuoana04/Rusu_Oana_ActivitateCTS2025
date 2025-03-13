package cts.rusu.oana.g1118.pattern.builder;

public class PachetTransport
{
    private boolean hasWifi;
    private boolean hasAnimale;
    private boolean isFumator;
    private boolean hasAC;
    private boolean hasTV;

    public PachetTransport(boolean hasWifi, boolean hasAnimale, boolean isFumator, boolean hasAC, boolean hasTV) {

        this.hasWifi = hasWifi;
        this.hasAnimale = hasAnimale;
        this.isFumator = isFumator;
        this.hasAC = hasAC;
        this.hasTV = hasTV;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public boolean isHasAnimale() {
        return hasAnimale;
    }

    public void setHasAnimale(boolean hasAnimale) {
        this.hasAnimale = hasAnimale;
    }

    public boolean isFumator() {
        return isFumator;
    }

    public void setFumator(boolean fumator) {
        isFumator = fumator;
    }

    public boolean isHasAC() {
        return hasAC;
    }

    public void setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
    }

    public boolean isHasTV() {
        return hasTV;
    }

    public void setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
    }

    @Override
    public String toString() {
        return "PachetTransport{" +
                "hasWifi=" + hasWifi +
                ", hasAnimale=" + hasAnimale +
                ", isFumator=" + isFumator +
                ", hasAC=" + hasAC +
                ", hasTV=" + hasTV +
                '}';
    }
}

package cts.rusu.oana.g1118.pattern.builder;

public class PachetTransportBuilder implements Builder
{
    private PachetTransport pachetTransport;

    public PachetTransportBuilder() {
        super();
        pachetTransport= new PachetTransport(false, false, false, false, false);
    }



    @Override
    public PachetTransport build() {
        return pachetTransport;
    }

   public PachetTransportBuilder setHasWifi(boolean hasWifi)
   {
       this.pachetTransport.setHasWifi( hasWifi);
       return  this;
   }

   public PachetTransportBuilder setHasAnimale(boolean hasAnimale)
   {
       this.pachetTransport.setHasAnimale(hasAnimale);
       return this;
   }

   public PachetTransportBuilder setFumator(boolean isFumator)
   {
       this.pachetTransport.setFumator(isFumator);
       return  this;
   }

   public PachetTransportBuilder setHasAC(boolean hasAC)
   {
       this.pachetTransport.setHasAC(hasAC);
       return  this;
   }

   public  PachetTransportBuilder setHasTV(boolean hasTV)
   {
       this.pachetTransport.setHasTV(hasTV);
       return  this;
   }




}

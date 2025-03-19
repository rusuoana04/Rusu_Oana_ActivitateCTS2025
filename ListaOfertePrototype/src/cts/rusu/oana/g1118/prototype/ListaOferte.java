package cts.rusu.oana.g1118.prototype;


import java.util.ArrayList;
import java.util.List;

public class ListaOferte implements IListaOferte{

    private List<String> oferte;

    public List<String> getOferte() {
        return oferte;
    }

    public void setOferte(List<String> oferte) {
        this.oferte = oferte;
    }

    public ListaOferte()
    {
        oferte=new ArrayList<String>();
    }


    @Override
    public IListaOferte copy() {
       ListaOferte copie= new ListaOferte();
       copie.oferte=new ArrayList<>(this.oferte);
       return copie;
    }

    @Override
    public String toString() {
        return "ListaOferte{" +
                "oferte=" + oferte +
                '}';
    }
}

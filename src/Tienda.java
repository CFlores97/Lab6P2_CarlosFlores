
import java.util.ArrayList;


public class Tienda {
    ArrayList<Consola> consolas = new ArrayList<>();

    public Tienda() {
    }

    public ArrayList<Consola> getConsolas() {
        return consolas;
    }

    public void setConsolas(ArrayList<Consola> consolas) {
        this.consolas = consolas;
    }

    @Override
    public String toString() {
        return getConsolas().toString();
    }
    
    
}

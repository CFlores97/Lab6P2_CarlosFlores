
import java.util.ArrayList;


public class Estacionaria extends Consola{
    private int numControles, almacenamiento;
    private String tipoConexion;

    public Estacionaria() {
        super();
    }

    public Estacionaria(int numControles, int almacenamiento, String tipoConexion, String identificacion, String fabricante, String modelo, int añosUso, double precio) {
        super(identificacion, fabricante, modelo, añosUso, precio);
        this.numControles = numControles;
        this.almacenamiento = almacenamiento;
        this.tipoConexion = tipoConexion;
    }

    public int getNumControles() {
        return numControles;
    }

    public void setNumControles(int numControles) {
        this.numControles = numControles;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public ArrayList<Juego> getJuegosDisp() {
        return juegosDisp;
    }

    public void setJuegosDisp(ArrayList<Juego> juegosDisp) {
        this.juegosDisp = juegosDisp;
    }

    @Override
    public String toString() {
        return "Estacionaria{" + "numControles=" + numControles + ", almacenamiento=" + almacenamiento + ", tipoConexion=" + tipoConexion + '}';
    }
    
    
    
}

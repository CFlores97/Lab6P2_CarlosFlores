
import java.util.ArrayList;


public class Portatil extends  Consola{
    private String pantalla;
    private int bateria;
    private boolean hasEstuche;

    public Portatil() {
        super();
    }

    public Portatil(String pantalla, int bateria, boolean hasEstuche, String identificacion, String fabricante, String modelo, int añosUso, double precio) {
        super(identificacion, fabricante, modelo, añosUso, precio);
        this.pantalla = pantalla;
        this.bateria = bateria;
        this.hasEstuche = hasEstuche;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public boolean isHasEstuche() {
        return hasEstuche;
    }

    public void setHasEstuche(boolean hasEstuche) {
        this.hasEstuche = hasEstuche;
    }

    public ArrayList<Juego> getJuegosDisp() {
        return juegosDisp;
    }

    public void setJuegosDisp(ArrayList<Juego> juegosDisp) {
        this.juegosDisp = juegosDisp;
    }

    @Override
    public String toString() {
        return "Estacionaria{" + "pantalla=" + pantalla + ", bateria=" + bateria + ", hasEstuche=" + hasEstuche + '}';
    }
    
    
    
    
}

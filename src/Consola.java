
import java.util.ArrayList;


public class Consola {
    private String identificacion, fabricante, modelo;
    private int añosUso;
    private double precio;
    
    ArrayList<Juego> juegosDisp = new ArrayList<>();

    public Consola() {
    }

    public Consola(String identificacion, String fabricante, String modelo, int añosUso, double precio) {
        this.identificacion = identificacion;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.añosUso = añosUso;
        this.precio = precio;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñosUso() {
        return añosUso;
    }

    public void setAñosUso(int añosUso) {
        this.añosUso = añosUso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Juego> getJuegosDisp() {
        return juegosDisp;
    }

    public void setJuegosDisp(ArrayList<Juego> juegosDisp) {
        this.juegosDisp = juegosDisp;
    }

    @Override
    public String toString() {
        return "Consola{" + "identificacion=" + identificacion + ", fabricante=" + fabricante + ", modelo=" + modelo + ", a\u00f1osUso=" + añosUso + ", precio=" + precio + ", juegosDisp=" + juegosDisp + '}';
    }
    
    
    
    
}

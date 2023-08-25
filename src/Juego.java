
import java.util.Date;


public class Juego {
    private String nombre, descripcion, estado;
    private Date fechaLanz;
    private double precio; 
    private boolean isRentable, isAgregado;
    private int cantDisp;

    public Juego() {
    }

    public Juego(String nombre, String descripcion, String estado, Date fechaLanz, double precio, boolean isRentable, boolean isAgregado, int cantDisp) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fechaLanz = fechaLanz;
        this.precio = precio;
        this.isRentable = isRentable;
        this.isAgregado = isAgregado;
        this.cantDisp = cantDisp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaLanz() {
        return fechaLanz;
    }

    public void setFechaLanz(Date fechaLanz) {
        this.fechaLanz = fechaLanz;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isIsRentable() {
        return isRentable;
    }

    public void setIsRentable(boolean isRentable) {
        this.isRentable = isRentable;
    }

    public boolean isIsAgregado() {
        return isAgregado;
    }

    public void setIsAgregado(boolean isAgregado) {
        this.isAgregado = isAgregado;
    }

    public int getCantDisp() {
        return cantDisp;
    }

    public void setCantDisp(int cantDisp) {
        this.cantDisp = cantDisp;
    }

    @Override
    public String toString() {
        return "Juego{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", estado=" + estado + ", fechaLanz=" + fechaLanz + ", precio=" + precio + ", isRentable=" + isRentable + ", isAgregado=" + isAgregado + ", cantDisp=" + cantDisp + '}';
    }
    
    
}

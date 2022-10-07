import javax.swing.*;
import java.awt.*;

public class Hospital {
String codhospital;
String nombre;

    public void setCodhospital(String codhospital) {
        this.codhospital = codhospital;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setServicios(List servicios) {
        this.servicios = servicios;
    }

    public void setDirector(Medico director) {
        this.director = director;
    }

    public String getCodhospital() {
        return codhospital;
    }

    public String getNombre() {
        return nombre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public int getTelefono() {
        return telefono;
    }

    public List getServicios() {
        return servicios;
    }

    public Medico getDirector() {
        return director;
    }

    Ciudad ciudad;
int telefono;

    public Hospital(String codhospital, String nombre, Ciudad ciudad, int telefono, List servicios, Medico director) {
        this.codhospital = codhospital;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.servicios = servicios;
        this.director = director;
    }

    List servicios;
Medico director;
}

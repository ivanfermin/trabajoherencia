import java.util.List;

public class Servicio {
    String idServicio;
    String nombre;

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHospitales(List<Hospital> hospitales) {
        this.hospitales = hospitales;
    }

    public void setNumerodeCamas(int numerodeCamas) {
        this.numerodeCamas = numerodeCamas;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getIdServicio() {
        return idServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Hospital> getHospitales() {
        return hospitales;
    }

    public int getNumerodeCamas() {
        return numerodeCamas;
    }

    public String getComentario() {
        return comentario;
    }

    public Servicio(String idServicio, String nombre, List<Hospital> hospitales, int numerodeCamas, String comentario) {
        this.idServicio = idServicio;
        this.nombre = nombre;
        this.hospitales = hospitales;
        this.numerodeCamas = numerodeCamas;
        this.comentario = comentario;
    }

    List<Hospital> hospitales;
    int numerodeCamas;
    String comentario;

}

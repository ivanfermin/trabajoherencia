public class Ciudad {
    String codciudad;
    String nombre;

    public void setCodciudad(String codciudad) {
        this.codciudad = codciudad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodciudad() {
        return codciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public Ciudad(String codciudad, String nombre) {
        this.codciudad = codciudad;
        this.nombre = nombre;
    }
}


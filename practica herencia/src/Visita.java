import java.util.Date;

public class Visita {
    String codVisita;
    Date fechaHora;
    Hospital hospital;
    Servicio servicio;

    public void setCodVisita(String codVisita) {
        this.codVisita = codVisita;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setTratamientos(String tratamientos) {
        this.tratamientos = tratamientos;
    }

    public void setNumerodeCama(int numerodeCama) {
        this.numerodeCama = numerodeCama;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }

    public String getCodVisita() {
        return codVisita;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public Medico getMedico() {
        return medico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getTratamientos() {
        return tratamientos;
    }

    public int getNumerodeCama() {
        return numerodeCama;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public Historial getHistorial() {
        return historial;
    }

    public Visita(String codVisita, Date fechaHora, Hospital hospital, Servicio servicio, Medico medico, String diagnostico, String tratamientos, int numerodeCama, Date fechaSalida, Historial historial) {
        this.codVisita = codVisita;
        this.fechaHora = fechaHora;
        this.hospital = hospital;
        this.servicio = servicio;
        this.medico = medico;
        this.diagnostico = diagnostico;
        this.tratamientos = tratamientos;
        this.numerodeCama = numerodeCama;
        this.fechaSalida = fechaSalida;
        this.historial = historial;
    }

    Medico medico;
    String diagnostico;
    String tratamientos;
    int numerodeCama;
    Date fechaSalida;
    Historial historial;
}

public class Historial {
    String codhistorial;

    public void setCodhistorial(String codhistorial) {
        this.codhistorial = codhistorial;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getCodhistorial() {
        return codhistorial;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Historial(String codhistorial, Paciente paciente) {
        this.codhistorial = codhistorial;
        this.paciente = paciente;
    }

    Paciente paciente;
}

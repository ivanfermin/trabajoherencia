import java.util.Date;

public class  Paciente extends Persona {
    String codPaciente;

    Date fechaNacimiento;
    String numeroSEguridadSocial;

    public Paciente(String nombre, String primerApellido, String segundoApellido, String DNI) {
        super(nombre, primerApellido, segundoApellido, DNI);
    }
}

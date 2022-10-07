import java.util.Date;
import java.util.List;

public class Medico extends Persona {
    String codMedico;




    Date fechadeNacimiento;
    List<Servicio> servicios;
    Hospital hospital;

    public Medico(String nombre, String primerApellido, String segundoApellido, String DNI) {
        super(nombre, primerApellido, segundoApellido, DNI);
    }
}


import java.util.Date;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) throws PacienteException {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2022);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date dateRepresentation = cal.getTime();

        Paciente paciente = new Paciente("Juan", "Perez", "12345", dateRepresentation);

    }
}

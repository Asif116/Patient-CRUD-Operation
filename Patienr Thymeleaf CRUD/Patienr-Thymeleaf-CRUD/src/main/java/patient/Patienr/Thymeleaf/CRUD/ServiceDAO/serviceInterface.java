package patient.Patienr.Thymeleaf.CRUD.ServiceDAO;
import patient.Patienr.Thymeleaf.CRUD.Model.Patient;
import java.util.List;
public interface serviceInterface {

    public List<Patient> findAll();

    public Patient save(Patient patient);

    public Patient findById(int id);

    public void deleteById(int id);

    List<Patient> findByFirstNameContaining(String firstName);

}

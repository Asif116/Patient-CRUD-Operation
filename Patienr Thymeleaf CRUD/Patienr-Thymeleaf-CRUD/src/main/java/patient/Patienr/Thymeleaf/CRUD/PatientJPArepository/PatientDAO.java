package patient.Patienr.Thymeleaf.CRUD.PatientJPArepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import patient.Patienr.Thymeleaf.CRUD.Model.Patient;

import java.util.List;


public interface PatientDAO extends JpaRepository<Patient,Integer> {

    List<Patient> findByFirstNameContaining(String firstName);

}

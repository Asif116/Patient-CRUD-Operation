package patient.Patienr.Thymeleaf.CRUD.ServiceDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import patient.Patienr.Thymeleaf.CRUD.Model.Patient;
import patient.Patienr.Thymeleaf.CRUD.PatientJPArepository.PatientDAO;

import java.util.List;
import java.util.Optional;

@Service
public class Service_Implementation implements serviceInterface{

    private PatientDAO patientDAO;
    @Autowired
    public Service_Implementation(PatientDAO patientDAO) {
        this.patientDAO = patientDAO;
    }

    @Override
    public List<Patient> findAll() {
        List<Patient> all=patientDAO.findAll();
        return all;
    }

    @Override
    public Patient save(Patient patient) {
        Patient savedata=patientDAO.save(patient);
        return savedata;
    }

    @Override
    public Patient findById(int id) {
        Optional<Patient> findid=patientDAO.findById(id);
        Patient thePatient=null;
        if(findid.isPresent()){
            thePatient= findid.get();
        }
        else{
            throw new RuntimeException("ID NOT FOUND EXCEPTION "+id);
        }
        return thePatient;
    }

    @Override
    public void deleteById(int id) {
        patientDAO.deleteById(id);
    }

    @Override
    public List<Patient> findByFirstNameContaining(String firstName) {
        return patientDAO.findByFirstNameContaining(firstName);
    }


}

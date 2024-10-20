package patient.Patienr.Thymeleaf.CRUD.Controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import patient.Patienr.Thymeleaf.CRUD.Model.Patient;
import patient.Patienr.Thymeleaf.CRUD.ServiceDAO.serviceInterface;

import java.util.List;

@Controller
@RequestMapping("/patient")
public class patientController {
    private serviceInterface serviceInterface;

    @Autowired
    public patientController(serviceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

    @Value("${city}")
    private List<String> city;
    @Value("${symptoms}")
    private List<String> symptoms;

    @GetMapping("/patientForm")
    public String form(Model model){
        Patient pt=new Patient();
        model.addAttribute("patient",pt);
        model.addAttribute("city",city);
        model.addAttribute("symptoms",symptoms);
        return "Patient-Form";
    }

//    @GetMapping("/list")
//    public String all(Model model){
//        List<Patient> thept=serviceInterface.findAll();
//        model.addAttribute("patientall",thept);
//        return "Patient-List";
//    }
@GetMapping("/list")
public String all(@RequestParam(value = "search", required = false) String search, Model model) {
    List<Patient> thept;
    if (search != null && !search.isEmpty()) {
        thept = serviceInterface.findByFirstNameContaining(search);

    }
    else {
        thept = serviceInterface.findAll();
    }
    model.addAttribute("patientall", thept);
    return "Patient-List";
}






    @PostMapping("/save")
    public String save(@Valid @ModelAttribute ("patient") Patient thept, BindingResult bindingResult,Model themodel){

        if(bindingResult.hasErrors()){
            themodel.addAttribute("city",city);
            themodel.addAttribute("symptoms",symptoms);
            return "Patient-Form";
        }
        else {
            serviceInterface.save(thept);
            return "redirect:/patient/list";
        }
    }
    @GetMapping("/update")
    public String update(@RequestParam ("patientId") int pt,Model model){
       Patient ptid=serviceInterface.findById(pt);
        model.addAttribute("patient",ptid);
        model.addAttribute("city",city);
        model.addAttribute("symptoms",symptoms);
        return "Patient-Form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam ("patientId") int ptid){
        serviceInterface.deleteById(ptid);
        return "redirect:/patient/list";
    }
}

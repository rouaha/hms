package com.abi.repository;

import com.abi.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by shahidul on 5/4/17.
 */
@Component
public class PatientRepository {
    @Autowired
    PatientRepo patientRepo;
    public List<Patient> getPatientList(){
        return (List<Patient>) patientRepo.findAll();
    }
    public void addpatient(Patient patient){
        patientRepo.save(patient);

    }
    public void deletePatient(int id){
        patientRepo.delete(id);
    }

}

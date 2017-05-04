package com.abi.repository;

import com.abi.entity.Patient;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by shahidul on 5/4/17.
 */
public interface PatientRepo extends CrudRepository<Patient,Integer> {
}

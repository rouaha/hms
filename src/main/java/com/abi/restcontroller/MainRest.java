package com.abi.restcontroller;

import java.util.List;


import com.abi.model.PatientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.abi.model.UserModel;
import com.abi.service.UserService;

@RestController
public class MainRest {

	@Autowired
	UserService userService;


	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public List<UserModel> getUserList(){
		
		return userService.retreiveuserdata();
	}
	@RequestMapping(value="newUser", method=RequestMethod.POST)
	public void createUser(@RequestBody UserModel UserDetail){

		 userService.addNewUser(UserDetail);
	}
	@RequestMapping(value="/patientInfo", method=RequestMethod.GET)
	public List<PatientModel> getPatientList(){

		return userService.retrivePatient();
	}

	@RequestMapping(value="/createPatient", method=RequestMethod.POST)
	public void createPatient(@RequestParam("PatientInfo") PatientModel PatientInfo){

		userService.createPatientByUser(PatientInfo);
	}
	@RequestMapping(value="/deletePatient/{serialNo}", method=RequestMethod.POST)
	public void deletePatient(@PathVariable("serialNo") int serialNo){

		userService.deletePatient(serialNo);
	}


}

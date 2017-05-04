package com.abi.service;

import java.util.ArrayList;
import java.util.List;

import com.abi.entity.Patient;
import com.abi.model.PatientModel;
import com.abi.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abi.entity.User;
import com.abi.model.UserModel;
import com.abi.repository.UserRepository;
import org.springframework.util.StringUtils;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	@Autowired
	PatientRepository patientRepository;
	
	
	public List<UserModel> retreiveuserdata(){
		
		List<UserModel> modelUserList=new ArrayList<>();
		List<User> userlist=userRepository.getUserList();
		if(userlist!=null && !userlist.isEmpty()){
			for (User user : userlist) {
				UserModel userModel=new UserModel();
				userModel.setUserName(user.getUserName());
				userModel.setEmail(user.getEmail());
				userModel.setPassword(user.getPassword());
				modelUserList.add(userModel);
			}
			return modelUserList;
		}
		return null;
	}
	public void addNewUser(UserModel userModel){
		User user = new User();
		if(userModel.getUserId()!=0){
			user.setUserId(userModel.getUserId());
			}
		user.setUserName(userModel.getUserName());
		user.setEmail(userModel.getEmail());
		user.setPassword(userModel.getPassword());
		userRepository.addUser(user);
	}
	 public List<PatientModel> retrivePatient() {
		 List<Patient> patientList = patientRepository.getPatientList();
		 List<PatientModel> patientModelList = new ArrayList<>();
		 if(patientList.isEmpty()){
		 for (Patient patient : patientList) {
			 PatientModel patientModel = new PatientModel();
			 patientModel.setEmail(patient.getEmail());
			 patientModel.setAge(patient.getAge());
			 patientModel.setDb(patient.getDb());
			 patientModel.setHealthId(patient.getHealthId());
			 patientModel.setSerialNo(patient.getSerialNo());
			 patientModel.setUserName(patient.getUserName());
			 patientModel.setStatus(patient.getStatus());
			 patientModelList.add(patientModel);

		 }
		 return patientModelList;
	 }
	return null;
	 }
	public  void createPatientByUser(PatientModel patientModel){
		Patient patient =new Patient();
		patient.setSerialNo(patientModel.getSerialNo());
		patient.setUserName(patientModel.getUserName());
		patient.setEmail(patientModel.getEmail());
		patient.setDb(patientModel.getDb());
		patient.setStatus(patientModel.getStatus());
		patient.setAge(patientModel.getAge());
		patient.setHealthId(patientModel.getHealthId());

		patientRepository.addpatient(patient);


	}
	public void deletePatient(int serialNo){
		patientRepository.deletePatient(serialNo);
	}


}

package com.nt.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.StudentCmd;

public class StudentCmdValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(StudentCmd.class);
	}

	@Override
	public void validate(Object cmd, Errors errors) {
		StudentCmd command=null;
		//type casting
		command=(StudentCmd)cmd;
		//form validation logic (ServerSide)
		if(command.getSno()<0)
			errors.rejectValue("sno","sno.required");
		if(command.getSname()==null || command.getSname()=="")
			errors.rejectValue("sname","sname.required");
		if(command.getSadd()==null || command.getSadd()=="")
			errors.rejectValue("sadd","sadd.required");
		else if(command.getSadd().length()<5){
			errors.rejectValue("sadd","sadd.minlength");
		}
	}//validate(-,-)
}//class

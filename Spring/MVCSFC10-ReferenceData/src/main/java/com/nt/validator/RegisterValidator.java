package com.nt.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.RegisterCmd;

public class RegisterValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(RegisterCmd.class);
	}

	@Override
	public void validate(Object cmd, Errors errs) {
		RegisterCmd command=null;
		command=(RegisterCmd)cmd;
		if(command.getName()==null || command.getName().equals("")){
			errs.rejectValue("name", "name.required");
		}
		else if(command.getName().length()<4){
			errs.rejectValue("name", "name.minlength");
	
		}
	}

}

package com.nt.validator;

import javax.inject.Named;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.UserCommand;

@Named
public class UserCmdValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(UserCommand.class);
	}

	@Override
	public void validate(Object cmd, Errors errors) {
		UserCommand command=null;
		//type casting
		command=(UserCommand)cmd;
		//required rule
		if(command.getUname()==null ||command.getUname().equals("")){
			errors.rejectValue("uname","login.user");
		}
		
		if(command.getPwd()==null ||command.getPwd().equals("")){
			errors.rejectValue("pwd","login.pwd");
		}
	}//validate(-,-)
}//class

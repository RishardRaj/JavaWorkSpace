package com.nt.editor;

import java.beans.PropertyEditorSupport;

import com.nt.beans.IntrAmtDetails;

public class IntrAmtDetailsEditor extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		float pAmt=0.0f,rate=0.0f,time=0.0f;
		IntrAmtDetails details=null;
		//gather p,t,r from property value (text)
		pAmt=Float.parseFloat(text.substring(0,text.indexOf(",")));  
		 time=Float.parseFloat(text.substring(text.indexOf(",")+1,text.lastIndexOf(","))); 
		rate=Float.parseFloat(text.substring(text.lastIndexOf(",")+1,text.length()));
		//create IntrAmtDetails class obj
		details=new IntrAmtDetails(pAmt,time,rate);
		//set value/obj tobean property
		setValue(details);
	}//setAsText
}//class

package com.nt.beans;

import java.util.Set;

public class Airtel {
 private Set<String> phones;
 
  public void setPhones(Set<String> phones) {
	 this.phones = phones;
   }
  
@Override
public String toString() {
	return "Airtel [phones=" + phones + "]";
}
 
  
}

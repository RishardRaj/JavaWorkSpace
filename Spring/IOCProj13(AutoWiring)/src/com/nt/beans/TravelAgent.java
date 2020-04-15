package com.nt.beans;

public class TravelAgent {
	 private TourPlan  tourPlan;
	 /*public TravelAgent() {
		System.out.println("TravelAgent:0-param constuctor");
	}*/
	 
	public TravelAgent(TourPlan tourPlan) {
		System.out.println("TravelAgent:1-param constuctor");
		this.tourPlan = tourPlan;
	}

	public void setTourPlan(TourPlan tourPlan){
		 System.out.println("TravelAgent: setTourPlan(-)");
	   this.tourPlan=tourPlan;
	  }
	 public void executeTourPlan(){
		 if(tourPlan!=null)
		 System.out.println(tourPlan.toString()+" is executed in 10 days.It was memorable");
	 }
}//class

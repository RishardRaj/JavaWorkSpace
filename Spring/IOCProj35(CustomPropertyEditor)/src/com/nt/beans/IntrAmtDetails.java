package com.nt.beans;

public class IntrAmtDetails {
	
		private float pAmt;
		  private float  time;
		  private float rate;
		  public IntrAmtDetails(float pAmt, float time, float rate) {
				this.pAmt = pAmt;
				this.time = time;
				this.rate = rate;
			}
		  
		public void setpAmt(float pAmt) {
			this.pAmt = pAmt;
		}
		public void setTime(float time) {
			this.time = time;
		}
		public void setRate(float rate) {
			this.rate = rate;
		}
		public float getpAmt() {
			return pAmt;
		}
		public float getTime() {
			return time;
		}
		public float getRate() {
			return rate;
		}
		  
		  
}

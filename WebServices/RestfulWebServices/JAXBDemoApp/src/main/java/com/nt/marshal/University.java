//University.java
package com.nt.marshal;

public class University {
	private int uId;
	private String uName;
	private boolean isRecognized;

	public class College {
		private int cId;
		private String cName;

		public class Student {
			private int sId;
			private String sName;
			private String email;

			public int getsId() {
				return sId;
			}

			public void setsId(int sId) {
				this.sId = sId;
			}

			public String getsName() {
				return sName;
			}

			public void setsName(String sName) {
				this.sName = sName;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			@Override
			public String toString() {
				return "Student [sId=" + sId + ", sName=" + sName + ", email=" + email + ", toString()="
						+ super.toString() + "]";
			}

		}

		public int getcId() {
			return cId;
		}

		public void setcId(int cId) {
			this.cId = cId;
		}

		public String getcName() {
			return cName;
		}

		public void setcName(String cName) {
			this.cName = cName;
		}

		@Override
		public String toString() {
			return "College [cId=" + cId + ", cName=" + cName + ", toString()=" + super.toString() + "]";
		}

	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public boolean isRecognized() {
		return isRecognized;
	}

	public void setRecognized(boolean isRecognized) {
		this.isRecognized = isRecognized;
	}

	@Override
	public String toString() {
		return "University [uId=" + uId + ", uName=" + uName + ", isRecognized=" + isRecognized + ", toString()="
				+ super.toString() + "]";
	}

}

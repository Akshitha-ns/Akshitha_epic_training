package controller;

public class Customer {
		String cusname;
		String cusmail;
		int cusid;
		
		
	public Customer(String cusname, String cusmail, int cusid) {
			this.cusname = cusname;
			this.cusmail = cusmail;
			this.cusid = cusid;
		}


	public String getCusname() {
		return cusname;
	}


	public void setCusname(String cusname) {
		this.cusname = cusname;
	}


	public String getCusmail() {
		return cusmail;
	}


	public void setCusmail(String cusmail) {
		this.cusmail = cusmail;
	}


	public int getCusid() {
		return cusid;
	}


	public void setCusid(int cusid) {
		this.cusid = cusid;
	}


	public static void main(String[] args) {
		

	}

}

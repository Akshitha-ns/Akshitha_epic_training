package epic_training;
abstract class Payment{
	int TransactionId;
	String CustomerName;
	double Amount;
	Payment(int tid,String cusn,double amt){
		this.TransactionId=tid;
		this.CustomerName=cusn;
		this.Amount=amt;
	}
	void display() {
		System.out.println("The Customer name "+CustomerName);
		System.out.println("The Customer Transactionid "+TransactionId);
		System.out.println("The Customer Amount "+Amount);
	}
	abstract boolean validatepay();
	abstract void processpay();
	abstract double transfee();
	abstract double cashback();
	abstract double finalamt();
}
class creditcardpay extends Payment{
	String cardNum;
	creditcardpay(int tid,String cusn,double amt,String cardNum){
		super(tid,cusn,amt);
		this.cardNum=cardNum;
	}
	boolean validatepay() {
		if(cardNum.length() == 16){
            return true;
        }
        else{
            return false;
        }
	}
	void processpay() {
		if(validatepay()){
            System.out.println("Process Successful");
            System.out.println("The Final amount is: "+finalamt());
        }
        else{
            System.out.println("Process Not Successful");
        }
	}
	double transfee() {
		return this.Amount*0.02;
	}
	double cashback() {
		 return this.Amount*0.05;	
		 }
	double finalamt() {
		return this.Amount+transfee();
	}
}
class upipay extends Payment{
	int upiId;
	upipay(int tid,String cusn,double amt,int upiId){
		super(tid,cusn,amt);
		this.upiId=upiId;
	}
	boolean validatepay() {
		return true;
	}
	void processpay() {
		if(validatepay()){
            System.out.println("Process Successful");
            System.out.println("The Final amount is: "+finalamt());
        }
	}
	double transfee() {
		return this.Amount*0.005;
	}
	double cashback() {
		return this.Amount*0.02;
	}
	double finalamt() {
		return this.Amount+transfee();
	}
}
class netbank extends Payment{
	int acno;
	netbank(int tid,String cusn,double amt,int acno){
		super(tid,cusn,amt);
		this.acno=acno;
	}
	boolean validatepay() {
		return true;
	}
	void processpay() {
		if(validatepay()){
            System.out.println("Process Successful");
            System.out.println("The Final amount is: "+finalamt());
        }
	}
	double transfee() {
		return this.Amount*0.01;
		
	}
	double cashback() {
		return this.Amount*0.01;
	}
	double finalamt() {
		return this.Amount+transfee();
	}
}
public class PaymentProcessing {

	public static void main(String[] args) {
		Payment ob = new creditcardpay(123,"deepa",500,"1234567890123456");
		ob.processpay();
		Payment ob2 = new upipay(111,"aks",600,123);
		ob2.processpay();
		Payment ob3 = new netbank(124,"san",400,89);
		ob3.processpay();
	}

}

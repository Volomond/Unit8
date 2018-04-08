package by.epam.jb24.payment;

import java.util.ArrayList;

public class PaymentList {
	private ArrayList<Payment> payLsts = new ArrayList<Payment>();
	
	public PaymentList() {
	}
	
	public ArrayList<Payment> getPayLsts(){
		return payLsts;
	}
	
	public void add(Payment payLst){
		payLsts.add(payLst);
	}
	
	public boolean delete(Payment payLst) {
		return payLsts.remove(payLst);
	}
	
	public Payment findByContent (int content) {
		for (Payment payLst : payLsts) {
			if(payLst.getAmount()==(content)) {
				return payLst;
			}
		}return null;
	}
}

package by.epam.jb24.payment;

import java.util.List;

public class PaymentListGo {

	public static void main(String[] args) {
		PaymentList myPayLst = new PaymentList();
		
		myPayLst.add(new Payment(3, new Thing(10,"apple","fruit")));
		myPayLst.add(new Payment(5, new Thing(3,"potatoes","vegetables")));
		myPayLst.add(new Payment(10, new Thing(15,"eggs","food")));
		myPayLst.add(new Payment(1, new Thing(55,"car","toy")));
		
		print(myPayLst);
	}
	
	public static void print (PaymentList payLst) {
		List<Payment> printPayments = payLst.getPayLsts();
		System.out.println("Here the list of you payments: ");
			for(int i = 0; i < printPayments.size(); i++) {
				Payment payElem = printPayments.get(i);
				print (payElem);
			}
	}
	
	public static void print(Payment payElem) {
		System.out.println(" Amount - " + payElem.getAmount()+", " + "Price - " +
	payElem.getThing().getPrice()+", " + "Name - " + payElem.getThing().getName()+", " + "Kind - " +
	payElem.getThing().getKind());
	}

}

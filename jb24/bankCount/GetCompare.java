package by.epam.jb24.bankCount;

public class GetCompare {

	public static void main(String[] args) {
		BankCount bc1 = new BankCount(100500,150,"Good Word");
		BankCount bc2 = new BankCount();
		
		if(bc1.equals(bc2)) {
			System.out.println("The same BankCount");
		}else {
			System.out.println(bc1.hashCode());
			System.out.println(bc2.hashCode());
		}
	}

}

package by.epam.jb24.bankCount;

public class BankCount {
	private int number;
	private int balance;
	private String secretWord;

	public BankCount() {
		number = 100500;
		balance = 150;
		secretWord = "Good Word";
	}
	public BankCount(int InNumber,int InBalance, String InSecretWord) {
		number = InNumber;
		balance = InBalance;
		secretWord = InSecretWord;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getSecretWord() {
		return secretWord;
	}
	public void setSecretWord(String secretWord) {
		this.secretWord = secretWord;
	}
	public boolean equals (Object obj) {
		if (obj == null) {
			return false;
		}
		
		if (this == obj) {
			return false;
		}
		
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		
		BankCount bc = (BankCount)obj;
		if (number != bc.number) {
			return false;
		}
		if (balance != bc.balance) {
			return false;
		}
		if (null == secretWord) {
			return (secretWord == bc.secretWord);
		}else {
			if (!secretWord.equals(bc.secretWord)) {
				return false;
			}
		}return true;
	}
	
	public int hashCode() {
		return (int) (41 * number * balance + ((null == secretWord) ? 0 : secretWord.hashCode()));
	}
	
}


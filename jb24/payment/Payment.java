package by.epam.jb24.payment;

public class Payment {
	private int amount;
	private Thing thing;
	
	public Payment (int InAmount, Thing InThing) {
		this.amount = InAmount;
		this.thing = InThing;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Thing getThing() {
		return thing;
	}

	public void setThing(Thing thing) {
		this.thing = thing;
	}

	@Override
	public int hashCode() {
		return (int) (31 * amount + ((thing == null) ? 0 : thing.hashCode()));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		if (amount != other.amount)
			return false;
		if (thing == null) {
			if (other.thing != null)
				return false;
		} else if (!thing.equals(other.thing))
			return false;
		return true;
	}
	
	
}

package by.epam.jb24.payment;

public class Thing {
	private int price;
	private String name;
	private String kind;

	public Thing(int InPrice, String InName, String InKind) {
		this.price = InPrice;
		this.name = InName;
		this.kind = InKind;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public int hashCode() {
		return (int) (31 * price + ((kind == null) ? 0 : kind.hashCode())+ ((name == null) ? 0 : name.hashCode()));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Thing other = (Thing) obj;
		if (kind == null) {
			if (other.kind != null)
				return false;
		} else if (!kind.equals(other.kind))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
	
}

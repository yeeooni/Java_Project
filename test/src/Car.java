
public class Car {

	private String color;
	private int account;

	public Car(String color, int account) {

		this.setColor(color);
		this.setAccount(account);

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Car [색상]" + color + ", [생산수량]" + account;
	}


}

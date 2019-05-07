
public class Sonata extends Car {

	private String series;
	private String use;

	public Sonata(String color, int account, String series, String use) {
		super(color, account);
		this.series = series;
		this.use = use;
	}

	public String toString() {
		return "Car [����] " + getColor() + " [�������] " + getAccount() + " [�ø���] " + series + " [�뵵] " + use;
	}

}

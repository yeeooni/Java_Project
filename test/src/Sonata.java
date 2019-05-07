
public class Sonata extends Car {

	private String series;
	private String use;

	public Sonata(String color, int account, String series, String use) {
		super(color, account);
		this.series = series;
		this.use = use;
	}

	public String toString() {
		return "Car [색상] " + getColor() + " [생산수량] " + getAccount() + " [시리즈] " + series + " [용도] " + use;
	}

}

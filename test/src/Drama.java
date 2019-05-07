
public class Drama extends TvProgram {

	private String director;
	private String actor;
	private String actress;

	public Drama(String director, String actor, String actress) {
		super(actor, actress);
		this.director = director;
	}

	public Drama(String title, String broadcast, String director, String actor, String actress) {
		super(title, broadcast);
		this.director = director;
		this.actor = actor;
		this.actress = actress;
	}

	@Override
	public String toString() {
		return super.toString() + "\n- ���� : " + director + "\n" 
	+ (!actor.equals("") ?  "- ���ڹ�� : " + actor +"\n" : "") 
	+ (!actress.equals("") ? "- ���ڹ�� : " + actress + "\n" : "");

	}
}
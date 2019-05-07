
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
		return super.toString() + "\n- 감독 : " + director + "\n" 
	+ (!actor.equals("") ?  "- 남자배우 : " + actor +"\n" : "") 
	+ (!actress.equals("") ? "- 여자배우 : " + actress + "\n" : "");

	}
}
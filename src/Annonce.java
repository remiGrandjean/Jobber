
public class Annonce {
	
	private String titre;
	private String typeJob;
	private String description;
<<<<<<< HEAD
	
	public Annonce(String titre, String typeJob, String description){
=======
	private int id;
	private String region;
	
	public Annonce(int id,String titre, String typeJob, String description, String region){
		this.id=id;
>>>>>>> 0c37e5e35cbb3c1ac182252fc1a7cecbab3792ae
		this.titre=titre;
		this.typeJob=typeJob;
		this.description=description;	
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getTypeJob() {
		return typeJob;
	}

	public void setTypeJob(String typeJob) {
		this.typeJob = typeJob;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String toString(){
		return titre + " " + typeJob+"\n"+description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	

}

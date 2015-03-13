
public class Annonce {
	
	private String titre;
	private String typeJob;
	private String description;
	
	public Annonce(String titre, String typeJob, String description){
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

}

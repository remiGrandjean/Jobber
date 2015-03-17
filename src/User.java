import javax.swing.ImageIcon;

public class User {

	private String nom;
	private String prenom;
	private String email;
	private int age;
	private ImageIcon img;
	private String mdp;
	private String region;
	private String role;

	public User(String nom, String prenom, String email, String mdp, int age,
			String role) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.email = email;
		this.mdp = mdp;
		this.region = region;
		this.role = role;
	}

	public User(String nom, String prenom, String email, String mdp, int age,
			ImageIcon img) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.email = email;
		this.img = img;
		this.mdp = mdp;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ImageIcon getImg() {
		return img;
	}

	public void setImg(ImageIcon img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return nom + ":" + prenom + ":" + age + ":" + email;

	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

}

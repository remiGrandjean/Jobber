import javax.swing.ImageIcon;


public class User {
	
	private String nom;
	private String prenom;
	private String email;
	private int age;
	private ImageIcon img;
<<<<<<< HEAD
	
	public User(String nom, String prenom, String email, int age, ImageIcon img){
=======
	private String mdp;
	
	public User(String nom, String prenom, String email,String mdp, int age, ImageIcon img){
>>>>>>> 0c37e5e35cbb3c1ac182252fc1a7cecbab3792ae
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.email=email;
		this.img=img;
<<<<<<< HEAD
=======
		this.mdp=mdp;
>>>>>>> 0c37e5e35cbb3c1ac182252fc1a7cecbab3792ae
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
	public String toString(){
		return nom+":"+prenom+":"+age+":"+email;
		
	}
	

}

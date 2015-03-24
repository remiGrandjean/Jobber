package classeJava;

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
	private String formation;
	private String experience;
	private String loisirs;
	private String information;

	public User(String nom, String prenom, String email, String mdp, int age,
			String role, String region) {
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getFormation() {
		return formation;
	}

	public void setFormation(String formation) {
		this.formation = formation;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getLoisirs() {
		return loisirs;
	}

	public void setLoisirs(String loisirs) {
		this.loisirs = loisirs;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

}

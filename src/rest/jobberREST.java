package rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import bdd.GenericDao;
import bdd.InitBDD;
import classeJava.User;

@Path("/v1")
public class jobberREST {
	private static GenericDao dao = InitBDD.dbi.open(GenericDao.class);

	@GET
	@Path("/user/allUser")
	public String getAllUser() {
		return dao.findAllUsers();
	}

	@GET
	@Path("/annonce/allAnnonce")
	public String getAllAnnonce() {
		return dao.findAllAnnonce();
	}

	@GET
	@Path("/user")
	public User getUserByMail(@PathParam("email") String email,
			@PathParam("mdp") String mdp) {
		return dao.findUsersByLog(email, mdp);
	}

	@GET
	@Path("/user/getFormation")
	public String getFormationByMail(@PathParam("email") String email,
			@PathParam("formation") String formation) {
		return dao.findFormationFromUser(email, formation);
	}

	@GET
	@Path("/user/getExperience")
	public String getExperienceByMail(@PathParam("email") String email,
			@PathParam("experience") String experience) {
		return dao.findExperienceFromUser(email, experience);
	}

	@GET
	@Path("/user/getLoisirs")
	public String getLoisirsByMail(@PathParam("email") String email,
			@PathParam("loisirs") String loisirs) {
		return dao.findLoisirsFromUser(email, loisirs);
	}

	@GET
	@Path("/user/getInformation")
	public String getInformationByMail(@PathParam("email") String email,
			@PathParam("formation") String information) {
		return dao.findInformationFromUser(email, information);
	}

	@GET
	@Path("/user/getInfoperso")
	public String getInfoperso(@PathParam("email") String email,
			@PathParam("nom") String nom, @PathParam("prenom") String prenom,
			@PathParam("age") int age, @PathParam("region") String region) {
		return dao.findInfoPerso(nom, prenom, age, region, email);
	}

	@POST
	@Path("/jobber/addUser")
	public void createUser(@PathParam("email") String email,
			@PathParam("mdp") String mdp, @PathParam("nom") String nom,
			@PathParam("prenom") String prenom, @PathParam("age") int age,
			@PathParam("region") String region, @PathParam("role") String role) {
		dao.insertInUsers(email, mdp, nom, prenom, age, region, role);

	}

	@POST
	@Path("/jobber/addFormation")
	public void addFormation(@PathParam("email") String email,
			@PathParam("formation") String formation) {
		dao.addFormation(email, formation);

	}

	@POST
	@Path("/jobber/addExperience")
	public void addExperience(@PathParam("email") String email,
			@PathParam("experience") String experience) {
		dao.addFormation(email, experience);

	}

	@POST
	@Path("/jobber/addLoisirs")
	public void addLoisirs(@PathParam("email") String email,
			@PathParam("loisirs") String loisirs) {
		dao.addFormation(email, loisirs);

	}

	@POST
	@Path("/jobber/addInformation")
	public void addInformation(@PathParam("email") String email,
			@PathParam("information") String information) {
		dao.addFormation(email, information);

	}

	@POST
	@Path("/jobber/addAnnonce")
	public void createAnnonce(@PathParam("titre") String titre,
			@PathParam("typeJob") String typeJob,
			@PathParam("description") String description,
			@PathParam("region") String region) {
		dao.insertInAnnonces(titre, typeJob, description, region);

	}

	@GET
	@Path("/jobber/annonce/{id}")
	public User getAnnonceById(@PathParam("id") int id) {
		return dao.findAnnonceById(id);
	}
}
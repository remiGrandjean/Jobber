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
	@Path("/jobber/allUser")
	public String getAllUser() {
		return dao.findAllUsers();
	}

	@GET
	@Path("/jobber/allAnnonce")
	public String getAllAnnonce() {
		return dao.findAllAnnonce();
	}

	@GET
	@Path("/jobber/user/{email}/{mdp}")
	public User getUserByMail(@PathParam("email") String email,
			@PathParam("mdp") String mdp) {
		return dao.findUsersByLog(email, mdp);
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
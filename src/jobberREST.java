import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


@Path("/v1")
public class jobberREST {
	private static GenericDao dao=InitBDD.dbi.open(GenericDao.class);
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
	public User getUserByMail(@PathParam("email") String email,@PathParam("mdp") String mdp){
		return dao.findUsersByLog(email, mdp);
	}
	@POST
	@Path("/jobber/{email}/{mdp}/{nom}/{prenom}/{age}/add")
	public void createUser(@PathParam("email") String email,@PathParam("mdp") String mdp,@PathParam("nom") String nom,@PathParam("prenom") String prenom,@PathParam("age") int age){
		dao.insertInUsers(email, mdp, nom, prenom, age);
		
	}
	@POST
	@Path("/jobber/{titre}/{typeJob}/{description}/add")
	public void createAnnonce(@PathParam("titre") String titre,@PathParam("typeJob") String typeJob,@PathParam("description") String description){
		dao.insertInAnnonces(titre, typeJob, description);
		
	}
	@GET
	@Path("/jobber/annonce/{id}")
	public User getAnnonceById(@PathParam("id") int id){
		return dao.findAnnonceById(id);
	}
}
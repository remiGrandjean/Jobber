import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/v1")
public class jobberREST {
<<<<<<< HEAD
	private static GenericDao dao = InitBDD.dbi.open(GenericDao.class);

=======
<<<<<<< HEAD
	static ArrayList<User> liste = new ArrayList<User>(); 
	static ArrayList<Annonce> listeAnnonce = new ArrayList<Annonce>();
	@GET
	@Path("/jobber/allUser")
	public String getAllUser() {
		String chaine="";
		for(int i=0; i<liste.size(); i++){
			chaine+=liste.get(i).toString()+"\n";
		}
		return chaine;
=======
	private static GenericDao dao=InitBDD.dbi.open(GenericDao.class);
>>>>>>> 00cab7cbc6441b5017ef7b1ab0f7db27eb631bc6
	@GET
	@Path("/jobber/allUser")
	public String getAllUser() {
		return dao.findAllUsers();
>>>>>>> 0c37e5e35cbb3c1ac182252fc1a7cecbab3792ae
	}

	@GET
	@Path("/jobber/allAnnonce")
	public String getAllAnnonce() {
<<<<<<< HEAD
		String chaine="";
		for(int i=0; i<listeAnnonce.size(); i++){
			chaine+=listeAnnonce.get(i).toString()+"\n";
		}
		return chaine;
	}
	@POST
	@Path("/jobber/{nom}/{prenom}/{email}")
	public void createUser(@PathParam("nom") String user,@PathParam("prenom") String prenom,@PathParam("age") int age,@PathParam("email")String email,@PathParam("img") ImageIcon img){
		liste.add(new User(user,prenom,email,age,img));
		System.out.println(liste.get(0));
=======
		return dao.findAllAnnonce();
	}

	@GET
	@Path("/jobber/user/{email}/{mdp}")
	public User getUserByMail(@PathParam("email") String email,
			@PathParam("mdp") String mdp) {
		return dao.findUsersByLog(email, mdp);
	}

	@POST
<<<<<<< HEAD
	@Path("/jobber/{email}/{mdp}/{nom}/{prenom}/{age}/{region}/{role}/add")
	public void createUser(@PathParam("email") String email,
			@PathParam("mdp") String mdp, @PathParam("nom") String nom,
			@PathParam("prenom") String prenom, @PathParam("age") int age,
			@PathParam("region") String region, @PathParam("role") String role) {
		dao.insertInUsers(email, mdp, nom, prenom, age, region, role);

=======
	@Path("/jobber/{email}/{mdp}/{nom}/{prenom}/{age}/add")
	public void createUser(@PathParam("email") String email,@PathParam("mdp") String mdp,@PathParam("nom") String nom,@PathParam("prenom") String prenom,@PathParam("age") int age){
		dao.insertInUsers(email, mdp, nom, prenom, age);
>>>>>>> 0c37e5e35cbb3c1ac182252fc1a7cecbab3792ae
		
>>>>>>> 00cab7cbc6441b5017ef7b1ab0f7db27eb631bc6
	}

	@POST
<<<<<<< HEAD
	@Path("/jobber/{titre}/{typeJob}/{description}/{region}/add")
	public void createAnnonce(@PathParam("titre") String titre,
			@PathParam("typeJob") String typeJob,
			@PathParam("description") String description,
			@PathParam("region") String region) {
		dao.insertInAnnonces(titre, typeJob, description, region);

=======
	@Path("/jobber/{titre}/{typeJob}/{description}/add")
	public void createAnnonce(@PathParam("titre") String titre,@PathParam("typeJob") String typeJob,@PathParam("description") String description){
<<<<<<< HEAD
		listeAnnonce.add(new Annonce(titre,typeJob,description));
		System.out.println(liste.get(0));
		
	}
=======
		dao.insertInAnnonces(titre, typeJob, description);
		
>>>>>>> 00cab7cbc6441b5017ef7b1ab0f7db27eb631bc6
	}

	@GET
	@Path("/jobber/annonce/{id}")
	public User getAnnonceById(@PathParam("id") int id) {
		return dao.findAnnonceById(id);
	}
>>>>>>> 0c37e5e35cbb3c1ac182252fc1a7cecbab3792ae
}
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


@Path("/v1")
public class jobberREST {
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
	}
	@GET
	@Path("/jobber/allAnnonce")
	public String getAllAnnonce() {
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
		
	}
	@POST
	@Path("/jobber/{titre}/{typeJob}/{description}/add")
	public void createAnnonce(@PathParam("titre") String titre,@PathParam("typeJob") String typeJob,@PathParam("description") String description){
		listeAnnonce.add(new Annonce(titre,typeJob,description));
		System.out.println(liste.get(0));
		
	}
}
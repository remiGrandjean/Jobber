import java.util.Collection;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapperFactory;
import org.skife.jdbi.v2.tweak.BeanMapperFactory;
public interface GenericDao {
	
	//User---------------------------------------------------------------
	@SqlUpdate("create table if not exists Users (email varchar(10) primary key,mdp var(10),nom varchar(15),prenom varchar(15),age integer)")
	void createUsersTable();
	
	@SqlUpdate("insert into Users (email,mdp,nom,prenom,age) values (:email,:mdp,:nom,:prenom,:age)")
	@GetGeneratedKeys
	int insertInUsers(@Bind("email") String login,@Bind("mdp") String mdp,@Bind("nom") String nom,@Bind("prenom") String prenom,@Bind("age") int age);
	
	@SqlQuery("select * from Users")
	@RegisterMapperFactory(BeanMapperFactory.class)
	String findAllUsers();
	
	@SqlQuery("select * from Users where email = :email and mdp = :mdp")
	@RegisterMapperFactory(BeanMapperFactory.class)
	User findUsersByLog(@Bind("email") String mail,@Bind("mdp") String mdp);
	
	@SqlUpdate("drop table if exists Users")
	void dropUserTable();
	
	//Annonce---------------------------------------------------------------
	@SqlUpdate("create table if not exists Annonces (id integer,titre text,typeJob text,description text)")
	void createAnnonceTable();
	
	@SqlUpdate("insert into Annonces (id,titre,typeJob,description) values (:id,:titre,:typeJob,:description)")
	@GetGeneratedKeys
	int insertInAnnonces(@Bind("titre") String titre,@Bind("typeJob") String typeJob,@Bind("description") String description);
	
	@SqlQuery("select * from Annonces where id = :id")
	@RegisterMapperFactory(BeanMapperFactory.class)
	User findAnnonceById(@Bind("id") int id);
	
	@SqlQuery("select * from Annonce")
	@RegisterMapperFactory(BeanMapperFactory.class)
	String findAllAnnonce();
	
	@SqlUpdate("drop table if exists Annonces")
	void dropAnnonceTable();

}

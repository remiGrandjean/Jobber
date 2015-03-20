package bdd;
import org.skife.jdbi.v2.DBI;
import org.sqlite.SQLiteDataSource;


public class InitBDD {

	public static DBI dbi;
	public static GenericDao dao;

	private InitBDD() {
		System.out.println("init bdd");
		SQLiteDataSource ds = new SQLiteDataSource();
		ds.setUrl("jdbc:sqlite:" + System.getProperty("java.io.tmpdir")
				+ System.getProperty("file.separator") + "bdd.db");
		System.out.println("jdbc:sqlite:"
				+ System.getProperty("java.io.tmpdir")
				+ System.getProperty("file.separator") + "bdd.db");
		dbi = new DBI(ds);
		dao = dbi.open(GenericDao.class);
		dao.createUsersTable();
		dao.createAnnonceTable();
	}

	private static InitBDD instance = null;

	public static InitBDD getInstance() {
		if (instance == null) {
			instance = new InitBDD();
		}
		return instance;
	}

}

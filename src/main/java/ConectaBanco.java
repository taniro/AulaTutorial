import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaBanco {

	private static final String DRIVER = "org.postgresql.Driver";
	private static final String URL = System.getenv("DATABASE_URL");
	private static final String USERNAME = System.getenv("DATABASE_USER");;
	private static final String PASSWORD = System.getenv("DATABASE_PASSWORD");;


	public static Connection getConnection() throws SQLException {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException ex) {
			System.out.println("Where is your PostgreSQL JDBC Driver? Include in your pom.xml");
			return null;
		}
		Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		return conn;
	}
}

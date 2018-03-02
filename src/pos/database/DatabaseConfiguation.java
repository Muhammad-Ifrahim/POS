package pos.database;

import java.sql.SQLException;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

public class DatabaseConfiguation {

	private static ConnectionSource connectionSource;

	public static void connectionConfiguration() throws ClassNotFoundException, SQLException {
		Class.forName("org.sqlite.JDBC");
		if (connectionSource == null) {
		}
		getConnection(); /* get Connection with Database */
	}

	private static void getConnection() throws SQLException {
		// TODO Auto-generated method stub
		connectionSource = new JdbcConnectionSource("jdbc:sqlite:POS.db"); /* connect with database or create db */
		isTableExsit();
	}

	private static void isTableExsit() {
		// TODO Auto-generated method stub
		// check if the model already exist in the database or not
	}
}

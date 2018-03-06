package pos.database;

import java.sql.SQLException;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import pos.entites.Person;

public class DatabaseConfiguation {

	private static ConnectionSource connectionSource;

	public static void connectionConfiguration() throws ClassNotFoundException, SQLException {
	     Class.forName("org.sqlite.JDBC");
		if (connectionSource == null) {
			connectionSource = new JdbcConnectionSource("jdbc:sqlite:POS.db");
			isTableExist();
		}
	}

	private static void isTableExist() {
		
		try {
			TableUtils.createTableIfNotExists(connectionSource, Person.class);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}	

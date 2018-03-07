package pos.database;

import java.sql.SQLException;
import java.text.ParseException;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import pos.entites.Customer;
import pos.entites.Manager;
import pos.entites.Person;
import pos.entites.Staff;
import pos.entites.Supplier;

public class DatabaseConfiguation {

	private static ConnectionSource connectionSource;

	public static void connectionConfiguration() throws ClassNotFoundException, SQLException {
	     Class.forName("org.sqlite.JDBC");
		if (connectionSource == null) {
			connectionSource = new JdbcConnectionSource("jdbc:sqlite:POS.db");
			isTableExist();
			personManager();
		}
	}

	private static void isTableExist() {
		
		try {
			TableUtils.createTableIfNotExists(connectionSource, Person.class);
			TableUtils.createTableIfNotExists(connectionSource, Customer.class);
			TableUtils.createTableIfNotExists(connectionSource, Supplier.class);
			TableUtils.createTableIfNotExists(connectionSource, Manager.class);
			TableUtils.createTableIfNotExists(connectionSource, Staff.class);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void personManager() throws SQLException
	{
	   
		Dao<Person,String> personDao = DaoManager.createDao(connectionSource, Person.class);
		Dao<Staff,String> staffDao = DaoManager.createDao(connectionSource, Staff.class);
		Dao<Manager,String> managerDao = DaoManager.createDao(connectionSource, Manager.class);
		Person p = new Person();
		p.setLastName("Ali");
		personDao.create(p);
		
		Staff s=new Staff();
		s.setPerson(p);
		staffDao.create(s);
		
		Manager m=new Manager();
		m.setStaff(s);
		managerDao.create(m);
		
		
		
		//Person p1= personDao.queryForId("1");
	   //System.out.println(p1.getId() +"  "+p1.getCreatedDate() +" "+ p1.getLastModifiedDate());
	  
	}
}	

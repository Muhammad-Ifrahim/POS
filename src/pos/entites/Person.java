/**
 * 
 */
package pos.entites;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * @author Enterprise Solution
 *
 */
// Annotation
@DatabaseTable(tableName = "Person")
public class Person {

	@DatabaseField(generatedId = true, columnName = "personId" )
	private int id;

	

	@DatabaseField(columnName = "firstName", dataType = DataType.STRING , useGetSet = true)
	private String firstName;

	@DatabaseField(columnName = "lastName", dataType = DataType.STRING, canBeNull = false, useGetSet = true)
	private String lastName;

	@DatabaseField(columnName = "address", dataType = DataType.STRING, useGetSet = true)
	private String address;

	@DatabaseField(columnName = "email", dataType = DataType.STRING, useGetSet = true)
	private String email;

	@DatabaseField(columnName = "contactNumber", dataType = DataType.STRING, useGetSet = true)
	private String contactNumber;

	@DatabaseField(columnName = "lastModifiedDate", version = true, dataType = DataType.DATE_LONG, format = "YYYY-MM-dd hh:mm:ss")
	private Date lastModifiedDate;

	@DatabaseField(columnName = "createdDate", dataType = DataType.DATE_LONG, format = "YYYY-MM-dd hh:mm:ss")
	private final Date createdDate;

	public Person() {
		Date c = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
		//Date d = sdf.format(c);
		System.out.println(sdf.format(c));
		//Date cd= Date.parse(sdf.format(c).toString());
		this.createdDate = c ;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getLastModifiedDate() {
		
		return lastModifiedDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}
	
	
	// This is for testing purpose
}
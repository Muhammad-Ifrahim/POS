/**
 * 
 */
package pos.entites;

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

	@DatabaseField(generatedIdSequence = "Person-", columnName = "personId" , useGetSet = true)
	private int id;

	@DatabaseField(columnName = "firstName", dataType = DataType.STRING , useGetSet = true)
	private String firstName;

	@DatabaseField(columnName = "lastName", dataType = DataType.STRING , canBeNull = false, throwIfNull=true , useGetSet = true)
	private String lastName;
	
	@DatabaseField(columnName = "address" , dataType = DataType.STRING , useGetSet = true)
	private String address;

	public Person(){
	
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

}
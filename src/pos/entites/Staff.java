package pos.entites;

import java.util.Date;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Staff")
public class Staff {

	@DatabaseField(columnName = "staffId" , generatedId = true )
	private int id;
	
	@DatabaseField(columnName = "person_id" , canBeNull = false , foreign = true)
	private Person person;
	
	@DatabaseField(columnName = "createdDate", dataType = DataType.DATE_LONG, format = "YYYY-MM-dd hh:mm:ss")
	private final Date createdDate;
	
	public Staff()
	{
		this.createdDate = new Date();
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getId() {
		return id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}
	
	
}

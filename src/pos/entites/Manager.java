package pos.entites;

import java.util.Date;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Manager")
public class Manager {
	
	@DatabaseField(columnName = "managerId" , generatedId = true )
	private int id;
	
	@DatabaseField(columnName = "staff_id" , canBeNull = false , foreign = true)
	private Staff staff;
	
	@DatabaseField(columnName = "createdDate", dataType = DataType.DATE_LONG, format = "YYYY-MM-dd hh:mm:ss")
	private final Date createdDate;
	
	public Manager()
	{
		this.createdDate = new Date();
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public int getId() {
		return id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}
	
	

}

package pos.entites;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Customer")
public class Customer {
	
	@DatabaseField(columnName = "CustomerId" , generatedIdSequence = "Cust-" , useGetSet = true)
	private int id;

	@DatabaseField(columnName = "personId" , canBeNull = false , foreign = true, useGetSet = true)
	private Person person;
}

package pos.entites;

import java.util.Date;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Product" )
public class Product {
	
	@DatabaseField(columnName = "productId" , generatedId = true )
	private int id;
	
	@DatabaseField(columnName = "productName" , canBeNull = false , useGetSet = true , dataType = DataType.STRING )
	private String name;
	
	@DatabaseField(columnName = "lastModifiedDate", version = true, dataType = DataType.DATE_LONG, format = "YYYY-MM-dd hh:mm:ss")
	private Date lastModifiedDate;
	
	@DatabaseField(columnName = "createdDate", dataType = DataType.DATE_LONG, format = "YYYY-MM-dd hh:mm:ss")
	private final Date createdDate;
	
	public Product()
	{
		this.createdDate = new Date();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}
	
	

}

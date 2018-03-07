package pos.entites;

import java.util.Date;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Price" )
public class Price {
	
	@DatabaseField(columnName = "priceId" , generatedId = true)
	private int id;
	
	@DatabaseField(columnName = "productPrice" , dataType = DataType.DOUBLE ,canBeNull = false , useGetSet = true )
	private double price;
	
	@DatabaseField(columnName = "createdDate", dataType = DataType.DATE_LONG, format = "YYYY-MM-dd hh:mm:ss")
	private final Date createdDate;
	
	public Price()
	{
		this.createdDate = new Date();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}
	

}

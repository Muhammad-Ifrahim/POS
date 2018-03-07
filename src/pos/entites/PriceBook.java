package pos.entites;

import java.util.Date;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "PriceBook" )
public class PriceBook {

	@DatabaseField(columnName = "priceBookId" , generatedId = true )
	private int id;
	
	@DatabaseField(foreign = true , columnName = "product_id" , canBeNull = false , useGetSet = true  )
	private Product product;
	
	@DatabaseField(foreign = true , columnName = "price_id" , canBeNull = false , useGetSet = true )
	private Price price;
	
	@DatabaseField(columnName = "lastModifiedDate", version = true, dataType = DataType.DATE_LONG, format = "YYYY-MM-dd hh:mm:ss")
	private Date lastModifiedDate;
	
	@DatabaseField(columnName = "createdDate", dataType = DataType.DATE_LONG, format = "YYYY-MM-dd hh:mm:ss")
	private final Date createdDate;
	
	public PriceBook()
	{
		this.createdDate = new Date();
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
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

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

	@DatabaseField(generatedIdSequence = "Person-", columnName = "personId")
	private int id;

	@DatabaseField(columnName = "firstName", dataType = DataType.STRING)
	private String firstName;

	@DatabaseField(columnName = "lastName", dataType = DataType.STRING, canBeNull = false)
	private String lastName;

}
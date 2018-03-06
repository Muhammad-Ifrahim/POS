package pos.template;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class HeaderController {
	
	@FXML
	private HBox header;
	@FXML
	private Button product;
	
	@FXML
	private void sendProductFxml(MouseEvent e) throws IOException 
	{
	
		//System.out.println("Hello - " + product.getId()+ "---"+ product.getAccessibleText()+ e.getSource() );
		Button button= (Button) e.getSource();
		TemplateController.mainTemplate.setCenter((BorderPane) FXMLLoader.load(getClass().getResource(button.getId()+".fxml")));
		
		//  CenterController.setCenterView(new String("Test.fxml"));
		//CenterController object=null;
		//object.setCenterView("dsdsd");

	}
}

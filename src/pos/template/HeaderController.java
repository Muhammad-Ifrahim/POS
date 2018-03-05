package pos.template;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class HeaderController {
	
	@FXML
	private HBox header;
	
	@FXML
	private void sendProductFxml(Event e) throws IOException 
	{
	
		System.out.println("Hello - " + e);
		TemplateController.mainTemplate.setCenter((BorderPane) FXMLLoader.load(getClass().getResource("Test.fxml")));
		//  CenterController.setCenterView(new String("Test.fxml"));
		//CenterController object=null;
		//object.setCenterView("dsdsd");

	}
}

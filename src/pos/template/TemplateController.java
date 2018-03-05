package pos.template;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;


public class TemplateController {

	
	public static BorderPane mainTemplate;
    
	public BorderPane getMaintemplate() {
		if (mainTemplate == null) {
			mainTemplate = new BorderPane();
		}

		try {
			onLoad();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mainTemplate;
	}

	public void onLoad() throws IOException {

		setHeader();
		setCenter();
		setFooter();
		
	}

	private void setHeader() {
		try {
			
			mainTemplate.setTop((HBox) FXMLLoader.load(getClass().getResource("Header.fxml")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void setFooter() {
		try {
			mainTemplate.setBottom((Pane) FXMLLoader.load(getClass().getResource("Footer.fxml")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setCenter( )
	{
		
		String name = CenterController.centerView;
		try {
			mainTemplate.setCenter((BorderPane) FXMLLoader.load(getClass().getResource(name)));
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		
	}

}

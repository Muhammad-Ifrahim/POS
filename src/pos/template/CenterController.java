package pos.template;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class CenterController {

	public static String centerView = "Center.fxml";
   // public TemplateController templateObject;
	public static String getCenterView() {
		return centerView;
	}

	public static void setCenterView(String centerView) throws IOException {
		CenterController.centerView = centerView;
		
	}

}

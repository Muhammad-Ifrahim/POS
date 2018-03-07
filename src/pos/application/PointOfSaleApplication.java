package pos.application;

import java.io.IOException;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import pos.database.DatabaseConfiguation;
import pos.template.TemplateController;

public class PointOfSaleApplication extends Application {
 
	//public TemplateController  template;
	@Override
	public void start(Stage primaryStage) throws IOException {
        //Run the Migration and Build the Table in SQLLite
		try {
			DatabaseConfiguation.connectionConfiguration();
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
		//
		TemplateController temp= new TemplateController();
		BorderPane root = (BorderPane) temp.getMaintemplate();
		
		Scene scene=new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setFullScreen(true);
	}
	
	

	public static void main(String[] args) {
		launch(args);
	}
}

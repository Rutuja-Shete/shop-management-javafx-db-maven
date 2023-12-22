package home_screen;

import java.net.URL;
import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class HomeScreen 
{
	public static void showHomeScreen() throws Exception
	{
				Parent actorGroup = FXMLLoader.load(new URL("file:///C|/Users//NIKITA HAJARE//nikita-eclipse-workspace//ShoppingManagementJavaFxDB//src//home_screen//HomeScreen.fxml"));
        StageFactory.stage.setTitle("Home Screen");
		
		StageFactory.stage.setFullScreen(true);
		Scene s = new Scene(actorGroup);
		StageFactory.stage.setScene(s);
		StageFactory.stage.show();	
		
	}

}


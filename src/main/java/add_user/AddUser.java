package add_user;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class AddUser 
{
	public static void showAddUserScreen() throws Exception
	{
		Parent actorgroup = FXMLLoader.load(new URL("file:///C|/Users//NIKITA HAJARE//nikita-eclipse-workspace//ShoppingManagementJavaFxDB//src//add_user//add_user.fxml"));
		StageFactory.stage.setTitle("Add User Details");
		StageFactory.stage.setFullScreen(true);
		
		Scene s = new Scene(actorgroup);
		StageFactory.stage.setScene(s);
		StageFactory.stage.show();
		
				
	}

}

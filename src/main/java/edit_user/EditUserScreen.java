package edit_user;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class EditUserScreen 
{
	public static void showEditUserScreen() throws Exception
	{
		Parent actorGroup = FXMLLoader.load(new URL("file:///C|/Users//NIKITA HAJARE//nikita-eclipse-workspace//ShoppingManagementJavaFxDB//src//edit_user//edit_user.fxml"));
		StageFactory.stage.setTitle("Edit User");
		StageFactory.stage.setFullScreen(true);
		
		Scene s = new Scene(actorGroup);
		StageFactory.stage.setScene(s);
		StageFactory.stage.show();
		
		
	}

}

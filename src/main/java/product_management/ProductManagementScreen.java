package product_management;

import java.net.URL;
import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ProductManagementScreen 
{
	public static void showProductManagementScreen() throws Exception

	{
		Parent actorGroup = FXMLLoader.load(new URL("file:///C|/Users//NIKITA HAJARE//nikita-eclipse-workspace//ShoppingManagementJavaFxDB//src//product_management//product_management.fxml"));
		StageFactory.stage.setTitle("Product Management");
		StageFactory.stage.setFullScreen(true);
		
		Scene s = new Scene(actorGroup);
		StageFactory.stage.setScene(s);
		StageFactory.stage.show();
		
	}
}
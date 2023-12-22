package edit_product;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import product_management.ProductManagementScreen;

public class EditProductScreenController
{
	@FXML
	private TextField productNameToEdit;
	
	@FXML
	private TextField productID;
	
	@FXML
	private TextField productName;
	
	@FXML
	private TextField price;
	
	@FXML
	private TextField category;
	
	@FXML
	private TextField quantity;
	
	@FXML
	private Label userMessage;
	
	
	public void done(ActionEvent event) throws Exception
	{
			String updateQuery = "update Products set "+ " productID='"+productID.getText()+"', productName='"+productName.getText()+"', price='"+price.getText()+"', category='"+category.getText()+"', quantity='"+quantity.getText()+"' "+ "where productName='"+productNameToEdit.getText()+"'";
			DBUtils.executeQuery(updateQuery);
			userMessage.setText("Edit product successfully!!");			
			
	}
	
	public void back(ActionEvent event) 
	{
		try {
			ProductManagementScreen.showProductManagementScreen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
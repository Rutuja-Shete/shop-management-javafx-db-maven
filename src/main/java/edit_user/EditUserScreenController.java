package edit_user;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import db_operations.DBUtils;
import home_screen.HomeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class EditUserScreenController 
{
	@FXML
	private TextField userNameToEdit;
	
	@FXML
	private TextField NewUserName;
	
	@FXML
	private TextField NewEmail;
	
	@FXML
	private TextField New_passwords;
	
	@FXML
	private TextField New_userRole;
	
	@FXML
	private Label userMessage;
	
	public void edit(ActionEvent event) throws Exception
	{
			String updateQuery = "update Users set "+ " userName='"+NewUserName.getText()+"', Email='"+NewEmail.getText()+"', passwords='"+New_passwords.getText()+"', userRole='"+New_userRole.getText()+"' "+ "where userName='"+userNameToEdit.getText()+"'";
			DBUtils.executeQuery(updateQuery);	
			userMessage.setText("Edit user successfully!!");			

	}


	public void backToHomeScreen(ActionEvent event) 
	{
		try {
			HomeScreen.showHomeScreen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	}
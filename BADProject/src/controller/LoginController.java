package controller;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert.AlertType;
import model.User;
import view.LoginView;

public class LoginController extends ControllerTemplate{
	
	private LoginView view;
	
	public LoginController(LoginView view) {
		this.view = view;
		setOnAction();
	}
	
	public void setOnAction() {
		view.getLoginBtn().setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				checkList();
			}
		});
	}

	public void checkList() {
		ArrayList<User> users = getData();
		
		String email = view.getEmailTF().getText();
		String password = view.getPasswdTF().getText();
		
		for (User user : users) {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
				rm.showAlert(AlertType.INFORMATION, "Log in", "Successfully Logged In");
				return;
			}
		}
	}
	
	public ArrayList<User> getData() {
		ArrayList<User> users = new ArrayList<User>();
		String query = "SELECT * FROM msuser";
		this.connect.rs = connect.execQuery(query);
	
		try {
			while(this.connect.rs.next()) {
				String UserID = connect.rs.getString("UserID");
				String Username = connect.rs.getString("Username");
				String Email = connect.rs.getString("Email");
				String Password = connect.rs.getString("Password");
				Integer Age = connect.rs.getInt("Age");
				String Gender = connect.rs.getString("Gender");
				String Country = connect.rs.getString("Country");
				String PhoneNumber = connect.rs.getString("PhoneNumber");
				String Role = connect.rs.getString("Role");
				
				users.add(new User(UserID, Username, Email, Password, Age, Gender, Country, PhoneNumber, Role));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return users;
	}
}

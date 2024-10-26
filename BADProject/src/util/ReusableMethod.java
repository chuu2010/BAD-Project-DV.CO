package util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ReusableMethod {

	public void showAlert(AlertType at, String Title, String Content) {
		Alert alert = new Alert(at);
		alert.setTitle(Title);
		alert.setContentText(Content);
		alert.showAndWait();
	}

}

package view;

import javafx.scene.control.MenuBar;
import javafx.stage.Screen;
import javafx.stage.Stage;
import util.Connect;

public abstract class viewTemplate {
	
	private Stage stage;
	protected Double width, height;
	protected Connect connect = Connect.getInstance();

	public viewTemplate(Stage stage) {
		this.stage = stage;
		this.width = stage.getWidth();
		this.height = stage.getHeight();
	}
	
	public abstract void init();
	public abstract void arrangeComponent();

	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}
	
	

	
}

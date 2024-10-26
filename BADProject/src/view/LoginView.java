package view;

import java.sql.SQLException;
import java.util.ArrayList;

import controller.LoginController;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import model.User;

public class LoginView extends viewTemplate{
	
	private Scene scene;
	private MenuBar mb;
	private Menu menu;
	private MenuItem loginMenu, registerMenu;
	private BorderPane mainLayout;
	private GridPane loginContainer;
	private Label loginLbl, emailLbl, passwdLbl, noAccountLbl, askToSignUpLbl;
	private TextField emailTF;
	private PasswordField passwdTF;
	private Button loginBtn;
	private HBox noAccountContainer;

    public LoginView(Stage stage) {
		super(stage);
		init();
		arrangeComponent();
		
		new LoginController(this);
		
		stage.setTitle("Dv.Co | Login");
		stage.setScene(scene);
    }

	@Override
	public void init() {
		mainLayout = new BorderPane();
		
		mb = new MenuBar();
		menu = new Menu("Menu");
		loginMenu = new MenuItem("Login");
		loginContainer = new GridPane();
		registerMenu = new MenuItem("Register");
		
		noAccountContainer = new HBox();
		
		loginLbl = new Label("LOGIN");
		loginBtn = new Button("Login");
		
		noAccountLbl = new Label("Dont have an account? ");
		askToSignUpLbl = new Label("Sign Up!");
		askToSignUpLbl.setTextFill(Color.BLUE);
		
		emailLbl = new Label("Email");
		passwdLbl = new Label("Password");
		
		emailTF = new TextField();
		passwdTF = new PasswordField();
		
		scene = new Scene(mainLayout, this.width, this.height);
	}

	@Override
	public void arrangeComponent() {
		loginMenu.setDisable(true);
	
		
		loginLbl.setFont(Font.font("Arial", FontWeight.BOLD, 35));
		
		emailTF.setPromptText("Email");
		passwdTF.setPromptText("Password");
		askToSignUpLbl.setTextFill(Color.BLUE);
		
		emailTF.setMinWidth(200);
		
		noAccountContainer.getChildren().addAll(noAccountLbl, askToSignUpLbl);
		
		loginContainer.add(loginLbl, 1, 0, 2, 1);
		
		loginContainer.setAlignment(Pos.CENTER);
		loginContainer.add(emailLbl, 0, 1);
		loginContainer.add(emailTF, 1, 1);
		loginContainer.add(passwdLbl, 0, 2);
		loginContainer.add(passwdTF, 1, 2);
		loginContainer.add(loginBtn, 1, 3);
		loginContainer.add(noAccountContainer, 0, 4, 3, 1);
		
		GridPane.setHalignment(loginBtn, HPos.RIGHT);
		noAccountContainer.setAlignment(Pos.CENTER);
		
		loginContainer.setHgap(10);
		loginContainer.setVgap(10);
		
		mb.getMenus().add(menu);
		menu.getItems().addAll(loginMenu, registerMenu);
		

		mainLayout.setTop(mb);
		mainLayout.setCenter(loginContainer);
	}

	public Scene getScene() {
		return scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}

	public MenuBar getMb() {
		return mb;
	}

	public void setMb(MenuBar mb) {
		this.mb = mb;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public MenuItem getLoginMenu() {
		return loginMenu;
	}

	public void setLoginMenu(MenuItem loginMenu) {
		this.loginMenu = loginMenu;
	}

	public MenuItem getRegisterMenu() {
		return registerMenu;
	}

	public void setRegisterMenu(MenuItem registerMenu) {
		this.registerMenu = registerMenu;
	}

	public BorderPane getMainLayout() {
		return mainLayout;
	}

	public void setMainLayout(BorderPane mainLayout) {
		this.mainLayout = mainLayout;
	}

	public GridPane getLoginContainer() {
		return loginContainer;
	}

	public void setLoginContainer(GridPane loginContainer) {
		this.loginContainer = loginContainer;
	}

	public Label getLoginLbl() {
		return loginLbl;
	}

	public void setLoginLbl(Label loginLbl) {
		this.loginLbl = loginLbl;
	}

	public Label getEmailLbl() {
		return emailLbl;
	}

	public void setEmailLbl(Label emailLbl) {
		this.emailLbl = emailLbl;
	}

	public Label getPasswdLbl() {
		return passwdLbl;
	}

	public void setPasswdLbl(Label passwdLbl) {
		this.passwdLbl = passwdLbl;
	}

	public Label getNoAccountLbl() {
		return noAccountLbl;
	}

	public void setNoAccountLbl(Label noAccountLbl) {
		this.noAccountLbl = noAccountLbl;
	}

	public Label getAskToSignUpLbl() {
		return askToSignUpLbl;
	}

	public void setAskToSignUpLbl(Label askToSignUpLbl) {
		this.askToSignUpLbl = askToSignUpLbl;
	}

	public TextField getEmailTF() {
		return emailTF;
	}

	public void setEmailTF(TextField emailTF) {
		this.emailTF = emailTF;
	}

	public PasswordField getPasswdTF() {
		return passwdTF;
	}

	public void setPasswdTF(PasswordField passwdTF) {
		this.passwdTF = passwdTF;
	}

	public Button getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn(Button loginBtn) {
		this.loginBtn = loginBtn;
	}

	public HBox getNoAccountContainer() {
		return noAccountContainer;
	}

	public void setNoAccountContainer(HBox noAccountContainer) {
		this.noAccountContainer = noAccountContainer;
	}
}

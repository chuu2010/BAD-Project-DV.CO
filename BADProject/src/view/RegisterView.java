package view;

import controller.RegistController;
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
import javafx.stage.Stage;

public class RegisterView extends viewTemplate {

	private Scene scene;
	private MenuBar mb;
	private Menu menu;
	private MenuItem loginMenu, registerMenu;
	private BorderPane mainLayout, registerLayout;
	private GridPane registContainer;
	private Label registLbl, userLbl, emailLbl, agreeLbl, phoneLbl, passwdLbl, genderLbl, countryLbl, confpassLbl, yesAccountLbl, ageLbl, askToSignInLbl;
	private TextField emailTF, userTF, phoneTF;
	private PasswordField passwdPF, confpassPF;
	private Button registBtn;
	private HBox yesAccountContainer, genderContainer, agreeContainer, btnContainer;
	
	private Spinner<Integer> ageSpinner;
    private RadioButton maleRadioButton, femaleRadioButton;
    private ToggleGroup genderGroup;
    private ComboBox<String> countryComboBox;
    private CheckBox agreeCheckBox;
    private Button registerButton;
    private Label registLabel;
	
	public RegisterView(Stage stage) {
		super(stage);
		init();
		arrangeComponent();
		
		new RegistController(this);
		
		stage.setTitle("Dv.Co | Register");
		stage.setScene(scene);
	}

	@Override
	public void init() {
		mainLayout = new BorderPane();
		registerLayout = new BorderPane();
		
		mb = new MenuBar();
		menu = new Menu("Menu");
		loginMenu = new MenuItem("Login");
		registerMenu = new MenuItem("Register");
		registContainer = new GridPane();
		
		yesAccountContainer = new HBox();
		btnContainer = new HBox();
		
		registLbl = new Label("REGISTER");
		registBtn = new Button("Register");
		
		userLbl = new Label("Username");
		emailLbl = new Label("Email");
		passwdLbl = new Label("Password");
		confpassLbl = new Label("Confirm Password");
		ageLbl = new Label("Age");
		genderLbl = new Label("Gender");
		countryLbl = new Label("Country");
		phoneLbl = new Label("Phone Number");
		agreeLbl = new Label("Agree to terms and condition");
		
		userTF = new TextField();
	    emailTF = new TextField();
	    passwdPF = new PasswordField();
	    confpassPF = new PasswordField();
	    phoneTF = new TextField();
		
		ageSpinner = new Spinner<Integer>(1, 100, 13);
		maleRadioButton = new RadioButton("Male");
		femaleRadioButton = new RadioButton("Female");
		genderGroup = new ToggleGroup();
		maleRadioButton.setToggleGroup(genderGroup);
        femaleRadioButton.setToggleGroup(genderGroup);
        genderContainer = new HBox();
        countryComboBox = new ComboBox<>();
        countryComboBox.getItems().addAll("Indonesia", "Malaysia", "Singapore");
        countryComboBox.setValue("Indonesia");
        agreeCheckBox = new CheckBox();
		
        agreeContainer = new HBox();
        
		registBtn = new Button("Register");
		
		yesAccountLbl = new Label("Already have an account? ");
		askToSignInLbl = new Label("Sign In!");
		askToSignInLbl.setTextFill(Color.BLUE);
		
		scene = new Scene(mainLayout, this.width, this.height);
	}

	@Override
	public void arrangeComponent() {
		mb.getMenus().add(menu);
		menu.getItems().addAll(loginMenu, registerMenu);
		
		registContainer.add(userLbl, 0, 0);
		registContainer.add(new Label(":"), 1, 0);
		registContainer.add(userTF, 2, 0);
		
		registContainer.add(emailLbl, 0, 1);
		registContainer.add(new Label(":"), 1, 1);
		registContainer.add(emailTF, 2, 1);
		
		registContainer.add(passwdLbl, 0, 2);
		registContainer.add(new Label(":"), 1, 2);
		registContainer.add(passwdPF, 2, 2);
		
		registContainer.add(confpassLbl, 0, 3);
		registContainer.add(new Label(":"), 1, 3);
		registContainer.add(confpassPF, 2, 3);
		
		registContainer.add(ageLbl, 0, 4);
		registContainer.add(new Label(":"), 1, 4);
		registContainer.add(ageSpinner, 2, 4);
		
		genderContainer.getChildren().addAll(maleRadioButton, femaleRadioButton);
		genderContainer.setSpacing(20);
		registContainer.add(genderLbl, 0, 5);
		registContainer.add(new Label(":"), 1, 5);
		registContainer.add(genderContainer, 2, 5);

		registContainer.add(countryLbl, 0, 6);
		registContainer.add(new Label(":"), 1, 6);
		registContainer.add(countryComboBox, 2, 6);
		
		registContainer.add(phoneLbl, 0, 7);
		registContainer.add(new Label(":"), 1, 7);
		registContainer.add(phoneTF, 2, 7);
		
		agreeContainer.getChildren().addAll(agreeLbl, agreeCheckBox);
		agreeContainer.setSpacing(5);
		
		registContainer.add(agreeContainer, 0, 8);
		
		btnContainer.getChildren().add(registBtn);
		btnContainer.setAlignment(Pos.BASELINE_RIGHT);
		registContainer.add(btnContainer, 2, 9);
		
		registContainer.setHgap(15);
		registContainer.setVgap(10);
		
		registerLayout.setTop(registLbl);
		registerLayout.setCenter(registContainer);
		
		BorderPane.setAlignment(registLbl, Pos.CENTER);
		registContainer.setAlignment(Pos.CENTER);
		
		mainLayout.setTop(mb);
		mainLayout.setCenter(registerLayout);
	}

}

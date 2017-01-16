package application;

import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;


public class MainController {
	
	@FXML
	private Label nameLabel;
	
	@FXML 
	private TextField nameTextField;
	
	@FXML
	private Label taxIdLabel;
	
	@FXML
	private TextField taxIdTextField;
	
	@FXML
	private Label feeLabel;
	
	@FXML
	private TextField feeTextField;
	
	@FXML
	private Label pNameLabel;
	
	@FXML
	private TextField pNameTextField;
	
	@FXML
	private Label cityLabel;
	
	@FXML
	private TextField cityTextField;
	
	@FXML
	private Label rentLabel;
	
	@FXML
	private TextField rentTextField;
	
	@FXML
	private Label ownerLabel;
	
	@FXML
	private TextField ownerTextField;
	
	@FXML
	private Label ListOfLabel;
	
	@FXML
	private Button nMCButton;
	
	public void NMCButtonListener(){
		
		nameTextField.clear();;
		taxIdTextField.clear();;
		feeTextField.clear();
		pNameTextField.clear();
		cityTextField.clear();
		rentTextField.clear();
		ownerTextField.clear();
		
	}
	
	@FXML
	private Button loPButton;
	
	@FXML
	private TextField NoPTextField;
	
	private String numOfProperty;
	private String name;
	private String taxId;
	private String fee;
	
	private String propertyName;
	private String city;
	private String rent;
	private String owner;

	
	ManagementCompany m;
	Property p;
	@FXML
	private Button aPButton;
	
	public void addPropertyAction(){
		
		this.name = nameTextField.getText();
		this.taxId = taxIdTextField.getText();
		this.fee = feeTextField.getText();
		
		
		propertyName = pNameTextField.getText();
		city = cityTextField.getText();
		rent = rentTextField.getText();
		owner = ownerTextField.getText();
		m = new ManagementCompany(name,taxId, Double.parseDouble(fee));
		p = new Property(propertyName, city, Double.parseDouble(rent), owner);
		pNameTextField.clear();
		m.addProperty(p);
		cityTextField.clear();
		rentTextField.clear();
		ownerTextField.clear();
		
	}
	
	 

	
	public void loPButtonListener(){
		
		
		Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("Management Company");
    	alert.setHeaderText(null);
    	alert.setContentText("List of the properties for "+name+", taxID: "+taxId+
    			"-----------------------------------------------------------------"+
    			m.toStrin()+
    			"-----------------------------------------------------------------"+
    			"Total management fee: $"+m.totalFee());

    	alert.showAndWait();
	}
	
	@FXML
	private Button tRButton;
	
	public void totalRentButtonListener() throws Exception{
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Management Company");
		alert.setHeaderText(null);
		
		alert.setContentText("\nTotal Rent of the properties: $"+m.totalRent()+ "\n");
		alert.showAndWait();
	}
	
	@FXML
	private Button mRButton;
	
	public void mRButtonListener(){
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Management Company");
		alert.setHeaderText(null);
		alert.setContentText("The property with the highest rent:\n" + m.displayPropertyAtIndex(m.maxPropertyRentIndex()));
		alert.showAndWait();
	}

	
	@FXML
	private Button exitButton;
	
	public void closeButtonAction(){
	    // get a handle to the stage
	    Stage stage = (Stage) exitButton.getScene().getWindow();
	    // do what you have to do
	    stage.close();
	}
	
	

	
}
	
	

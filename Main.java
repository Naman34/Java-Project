package application;

import com.sun.prism.Image;

import javafx.application.Application; 
import javafx.collections.FXCollections; 
import javafx.collections.ObservableList; 

import javafx.geometry.Insets; 
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene; 
import javafx.scene.image.ImageView;
import javafx.scene.control.Button; 
import javafx.scene.control.CheckBox; 
import javafx.scene.control.ChoiceBox; 
import javafx.scene.control.DatePicker; 
import javafx.scene.control.ListView; 
import javafx.scene.control.RadioButton; 
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.scene.control.ToggleGroup;  
import javafx.scene.control.ToggleButton; 
import javafx.stage.Stage; 
         
public class Main extends Application { 
   @Override 
   public void start(Stage stage) {    

	   
	   //Label for name 
      Text nameLabel = new Text("Child's Name"); 
      
      //Text field for name 
      TextField nameText = new TextField(); 
       
      //Label for date of birth 
      Text dobLabel = new Text("Date of birth"); 
      
      //date picker to choose date 
      DatePicker datePicker = new DatePicker(); 
       
      //Label for gender
      Text genderLabel = new Text("Child's gender"); 
      
      //Toggle group of radio buttons       
      ToggleGroup groupGender = new ToggleGroup(); 
      RadioButton maleRadio = new RadioButton("male"); 
      maleRadio.setToggleGroup(groupGender); 
      RadioButton femaleRadio = new RadioButton("female"); 
      femaleRadio.setToggleGroup(groupGender); 
      
      //child's bloodgroup
      Text BgLabel = new Text("Blood group");
      
       ChoiceBox Bloodgroup = new ChoiceBox();
       Bloodgroup.getItems().addAll("A+","B+","AB+","A-","B-","AB-","O+","O-");
       
       
      //Label for Dad,s name 
      Text dadLabel = new Text("Father's Name"); 
      TextField dadText = new TextField();
      
      //Label for moms name 
      Text momLabel = new Text("Mother's Name"); 
      TextField momText = new TextField();
      
      //Label for address 
      Text addressLabel = new Text("Address"); 
      TextField addtext = new TextField();
      
      //Label for city
      Text cityLabel = new Text("City");
      TextField cityText = new TextField();
      
      //Label for picode
      Text pinLabel = new Text("Pincode");
      TextField PinText = new TextField();
      PinText.lengthProperty();
   
      //Label for location 
      Text locationLabel = new Text("State"); 
      
      //Choice box for location 
      ChoiceBox locationchoiceBox = new ChoiceBox(); 
      locationchoiceBox.getItems().addAll
         ("Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh","Goa","UP","West Bengal","Rajasthan","Maharashtra"); 
       
      //Label for register 
      Button buttonRegister = new Button("Create Profile");  
      
      //Creating a Grid Pane 
      GridPane gridPane = new GridPane();    
      
      //Setting size for the pane 
      gridPane.setMinSize(900, 900); 
       
      //Setting the padding    
      gridPane.setPadding(new Insets(10, 10, 10, 10));  
      
      //Setting the vertical and horizontal gaps between the columns 
      gridPane.setVgap(20); 
      gridPane.setHgap(20);       
      
      //Setting the Grid alignment 
      gridPane.setAlignment(Pos.CENTER); 
       
      //Arranging all the nodes in the grid 
      gridPane.add(nameLabel, 0, 0); 
      gridPane.add(nameText, 1, 0); 
      
   
      gridPane.add(dobLabel, 0, 2);       
      gridPane.add(datePicker, 1, 2); 
      
      gridPane.add(genderLabel, 0, 4); 
      gridPane.add(maleRadio, 1, 4);       
      gridPane.add(femaleRadio, 2, 4); 
      
      gridPane.add(BgLabel, 0, 6);
      gridPane.add(Bloodgroup, 1, 6);
      
      gridPane.add(dadLabel, 0, 8);
      gridPane.add(dadText, 1, 8);
      
      gridPane.add(momLabel, 0, 10); 
      gridPane.add(momText, 1, 10);
       
      gridPane.add(addressLabel, 0, 12); 
      gridPane.add(addtext, 1, 12);   
      
      gridPane.add(cityLabel, 0, 14);
      gridPane.add(cityText, 1, 14); 
      
      gridPane.add(pinLabel, 0, 16);
      gridPane.add(PinText, 1, 16);
      
      gridPane.add(locationLabel, 0, 18); 
      gridPane.add(locationchoiceBox, 1, 18);    
       
      gridPane.add(buttonRegister, 2, 20);      
      
      //Styling nodes   
      buttonRegister.setStyle(
         "-fx-background-color: grey; -fx-textfill: white;"); 
       
      nameLabel.setStyle("-fx-font: normal bold 20px 'serif' "); 
      dobLabel.setStyle("-fx-font: normal bold 20px 'serif' "); 
      genderLabel.setStyle("-fx-font: normal bold 20px 'serif' "); 
      BgLabel.setStyle("-fx-font: normal bold 20px 'serif' ");
      dadLabel.setStyle("-fx-font: normal bold 20px 'serif' "); 
      momLabel.setStyle("-fx-font: normal bold 20px 'serif' "); 
      addressLabel.setStyle("-fx-font: normal bold 20px 'serif' "); 
      cityLabel.setStyle("-fx-font: normal bold 20px 'serif' ");
      pinLabel.setStyle("-fx-font: normal bold 20px 'serif' ");
      locationLabel.setStyle("-fx-font: normal bold 20px 'serif' "); 
       
      //Setting the back ground color 
      gridPane.setStyle("-fx-background-image: url(file:baby2.jpg);");       
       
      //Creating a scene object 
      Scene scene = new Scene(gridPane); 
      
      //Setting title to the Stage 
      stage.setTitle("Profile Form"); 
         
      //Adding scene to the stage 
      stage.setScene(scene);  
      
      //Displaying the contents of the stage 
      stage.show(); 
   }      
   public static void main(String args[]){ 
      launch(args); 
   } 
}
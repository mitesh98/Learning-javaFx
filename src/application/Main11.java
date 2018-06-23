package application;

import javafx.geometry.Insets;
import javafx.geometry.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Main11 extends Application {
	Stage window;
	
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		window = primaryStage;
		window.setTitle("JavaFx");
	
	window.setOnCloseRequest(e->{
		e.consume();
		closeProgram();
	});
		
	VBox layout1 = new VBox();
	layout1.setPadding(new Insets(10,10,10,10)); 
	
	
	
	//ChoiceBox
	ComboBox<String>combobox =new ComboBox<>();
	combobox.getItems().addAll("Race3","Razi","Sanju");
	combobox.setValue("Choose show ");//Set default value
	
	combobox.setOnAction(e->System.out.println("you have choosen "+combobox.getValue()));
	
	
	
	Button loginButton = new Button("Book");
	loginButton.setOnAction(e->System.out.println(combobox.getValue()+" have been booked"));
	
	layout1.getChildren().addAll
	(combobox,loginButton);
	
	
	
	Scene scene= new Scene(layout1,600,300);
	window.setScene(scene);
	window.show();
	
	}
	
	private void closeProgram(){
		boolean answer =ConfirmBox.display
				("title","Sure you want to exit");
		if(answer)
			window.close();
		
	}
	

	
}
























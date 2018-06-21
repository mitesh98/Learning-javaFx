package application;

import javafx.geometry.Insets;
import javafx.geometry.*;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Main8 extends Application {
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
	
	
	CheckBox checkbox1 =new CheckBox("Liti");
	CheckBox checkbox2 =new CheckBox("Chokha");
	checkbox2.setSelected(true);
	
	Button loginButton = new Button("Order Now");
	loginButton.setOnAction(e->handleOptions(checkbox1,checkbox2));
	
	layout1.getChildren().addAll(checkbox1,checkbox2,loginButton);
	//loginButton.setOnAction(e->);
	
	
	
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
	
	private void handleOptions( CheckBox box1,CheckBox box2){
		if(box1.isSelected())
			System.out.println("Litti");
		if(box2.isSelected())
			System.out.println("chokha");
	}
	
}
























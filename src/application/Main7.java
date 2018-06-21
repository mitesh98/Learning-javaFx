package application;

import javafx.geometry.Insets;
import javafx.geometry.*;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Main7 extends Application {
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
		
	GridPane grid = new GridPane();
	grid.setPadding(new Insets(10,10,10,10));
	//grid.setPadding(new Insets(10,10,10,10));
	grid.setVgap(10);
	grid.setHgap(10);
	
	Label nameLabel=new Label("Username");
	GridPane.setConstraints(nameLabel, 0,0);
	
	TextField nameInput = new TextField("Miteshs");
	GridPane.setConstraints(nameInput, 1, 0);
	
	
	Label passLabel=new Label("Password");
	GridPane.setConstraints(passLabel, 0,1);
	
	TextField passInput = new TextField();
	passInput.setPromptText("password");
	GridPane.setConstraints(passInput, 1,1);
	
	Button loginButton = new Button("Login");
	GridPane.setConstraints(loginButton, 1, 2);
	
	grid.getChildren().addAll(nameLabel,nameInput,passLabel,passInput,loginButton);
	
	Scene scene= new Scene(grid,600,300);
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
























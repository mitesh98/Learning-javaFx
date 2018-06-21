package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main2 extends Application {
	Stage window;
	Scene scene1,scene2;
	Button button1,button2;
	
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	window = primaryStage;
	
	Label label1 = new Label("Welcome to First Scene");
	Button button1 =new Button("Goto scene2");
	button1.setOnAction(e->window.setScene(scene2));
	
	//Layout 1 = children are in vertical column
	VBox layout1 = new VBox(20);
	layout1.getChildren().addAll(label1,button1);
	scene1=new Scene(layout1,200,200);
	
	//Button2
	Button button2 =new Button("Go back to scene");
	button2.setOnAction(e->window.setScene(scene1));
	
	//Layout2
	StackPane layout2= new StackPane();
	layout2.getChildren().add(button2);
	scene2= new Scene(layout2,600,300);
	
	//Set default window
	window.setScene(scene1);
	window.setTitle("Title of window");
	window.show();
		
	
		
	}
	
}
























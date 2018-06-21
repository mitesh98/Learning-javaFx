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

public class Main4 extends Application {
	Stage window;
	Button button1;
	
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		window = primaryStage;
		window.setTitle("Title of window");
	
	//Button
	Button button =new Button("Click me");
	button.setOnAction(e->{
		boolean result = ConfirmBox.display("Licence", "Are u agree to confirm");
		System.out.println(result);
	});
	
	//Layout
	StackPane layout= new StackPane();
	layout.getChildren().add(button);
	Scene scene= new Scene(layout,600,300);
	
	//Set  window
	window.setScene(scene);
	window.show();
		
	
		
	}
	
}
























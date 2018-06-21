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

public class Main5 extends Application {
	Stage window;
	Button button1;
	
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
		
	//Button
	Button button =new Button("Close");
	button.setOnAction(e->closeProgram());
	
	//Layout
	StackPane layout= new StackPane();
	layout.getChildren().add(button);
	Scene scene= new Scene(layout,600,300);
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
























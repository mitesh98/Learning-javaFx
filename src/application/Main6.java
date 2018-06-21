package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main6 extends Application {
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
		
	HBox topRow = new HBox();
	Button button1 = new Button("File");
	Button button2 = new Button("Edit");
	Button button3 = new Button("Source");
	topRow.getChildren().addAll(button1,button2,button3);
	
	VBox left = new VBox();
	Button buttonA = new Button("F");
	Button buttonB = new Button("E");
	Button buttonC = new Button("S");
	left.getChildren().addAll(buttonA,buttonB,buttonC);
	
	BorderPane layout = new BorderPane();
	layout.setTop(topRow);
	layout.setLeft(left);
	
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
























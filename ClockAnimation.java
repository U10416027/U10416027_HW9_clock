//U10416027	董郡麟

import java.util.Calendar; 
import java.util.GregorianCalendar;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.util.Duration;
import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;

public class ClockAnimation extends Application{
	
	public void start(Stage primaryStage){
		ClockPane clock = new ClockPane();
		
		EventHandler<ActionEvent> eventHandler = e->{
			clock.setCurrentTime();
		};
		
		Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000),eventHandler));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
		
		
		Scene scene = new Scene(pane,250,250);
		primaryStage.setTitle("小時鐘");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main (String[] args){
		launch(args);
	}
}

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
	
		//set the buttons and add to the pane	
		Button start = new Button("開始");
		Button stop = new Button("停止");
		start.setPrefSize(75,30);
		stop.setPrefSize(75,30);
		start.setTranslateX(0);
		start.setTranslateY(0);
		stop.setTranslateX(90);
		stop.setTranslateY(0);
		
		HBox box = new HBox(10);
		BorderPane pane = new BorderPane();
		box.getChildren().addAll(start, stop);
		pane.setCenter(clock);
		pane.setBottom(box);		
		
		EventHandler<ActionEvent> eventHandler = e->{
			clock.setCurrentTime();
		};
		
		Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000),eventHandler));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
		
		//Set button action(start)
		start.setOnAction(e -> {
			//Play animation
			animation.play();
		});
		
		//Set button action(stop)
		stop.setOnAction(e -> {
			//Stop animation
			animation.stop();
		});		
		
		Scene scene = new Scene(pane,250,250);
		primaryStage.setTitle("小時鐘");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main (String[] args){
		launch(args);
	}
}

package application;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;


public class Scane extends Application {
	public static void main(String[]args) {
		launch(args);
	}
	public void start (Stage primaryStage) throws Exception{
		Group root=new Group();
		Scene scene =new Scene(root,600,600,Color.LIGHTSKYBLUE);
		Stage stage =new Stage();
		
		
		Text text=new Text();
		text.setText("qwerty");
		text.setX(50);
		text.setY(50);
		text.setFont(Font.font("Veranda",50));
		text.setFill(Color.RED);
		
		Line line=new Line();
		line.setStartX(0);
		line.setStartY(80);
		line.setEndX(600);
		line.setEndY(80);
		line.setStrokeWidth(5);
		line.setStroke(Color.YELLOW);
		line.setOpacity(1);
		//line.setRotate(40);
		
		Rectangle rectangle=new Rectangle();
		rectangle.setX(150);
		rectangle.setY(150);
		rectangle.setWidth(100);
		rectangle.setHeight(100);
		rectangle.setFill(Color.WHITE);
		rectangle.setStrokeWidth(5);
		rectangle.setStroke(Color.BLACK);
		
		Polygon triangle=new Polygon();
		triangle.getPoints().setAll(
				250.0,250.0,
				400.0,300.0,
				250.0,300.0
				);
		triangle.setFill(Color.GREEN);
		
		Circle circle=new Circle();
		circle.setCenterX(400);
		circle.setCenterY(400);
		circle.setRadius(60);
		circle.setFill(Color.ORANGE);
		
		Image image =new Image("aq.png");
		ImageView imageView=new ImageView(image);
		imageView.setX(100);
		imageView.setY(350);
		
		root.getChildren().add(text);
		root.getChildren().add(line);
		root.getChildren().add(rectangle);
		root.getChildren().add(triangle);
		root.getChildren().add(circle);
		root.getChildren().add(imageView);


		stage.setScene(scene);
		stage.show();
		     
		
	}
	

}

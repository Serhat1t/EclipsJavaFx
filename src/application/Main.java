 package application;
	

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class Main extends Application {
	
	public static void main(String[]args) {
		launch(args);
		
	}

	@Override
	public void start(Stage stage) throws Exception {
		Group root =new Group();
		Scene scene = new Scene(root,Color.BLUE);
		//panelin rengini ayarlayabildik.
		Image icon =new Image ("blackHeart.jpg");
		stage.getIcons().add(icon);
		//İconu src klosörüne kopyaladık ve panale ekledik.
		stage.setTitle("Stage Demo SERHAT ");
		//panale başlık ekledik.
		stage.setWidth(520);//Panalin genişliği
		stage.setHeight(420);//panlein boyutu
		stage.setResizable(false);//boyutu artık sabit
		//stage.setX(30);//ekranın neresinde oluşaçağını belirledik
		//stage.setY(30);//ekranın neresinde oluşaçağını belirledik
		stage.setFullScreen(true);//tam ekran yaptık
		stage.setFullScreenExitHint("press q");
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
		//hangi tuşa baıp tam ekrandan çıkacağını belirledik.
		stage.setScene(scene);
		stage.show();
		
	}
	
}







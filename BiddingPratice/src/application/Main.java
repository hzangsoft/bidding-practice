package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root =  FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Bidding Practice");
			Image icon16 = new Image("/application/logo_16x16.png");
			Image icon24 = new Image("/application/logo_24x24.png");
			Image icon32 = new Image("/application/logo_32x32.png");
			Image icon48 = new Image("/application/logo_48x48.png");
			Image icon256 = new Image("/application/logo_256x256.png");

			primaryStage.getIcons().add(icon16);
			primaryStage.getIcons().add(icon24);
			primaryStage.getIcons().add(icon32);
			primaryStage.getIcons().add(icon48);
			primaryStage.getIcons().add(icon256);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

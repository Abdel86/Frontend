package controller;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application {
	
	private Stage primaryStage;
	private AnchorPane rootlayout;
	

	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Chess");
		
		initRootLayout();
		
	}
	
	public void initRootLayout() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainApp.class.getResource("view/Login.fxml"));
		rootlayout = (AnchorPane) loader.load();
		Scene scene = new Scene(rootlayout);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}

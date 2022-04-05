package App;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    final int WIDTH = 500;
    final int HEIGHT = 600;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/game-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), this.WIDTH, this.HEIGHT);
        stage.setTitle("Positional Game");
        stage.getIcons().add(new Image("circle.png"));
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
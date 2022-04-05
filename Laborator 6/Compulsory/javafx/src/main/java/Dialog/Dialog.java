package Dialog;

import App.Main;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Dialog {

    public void init(String errorMsg) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/dialog-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 210);
        Text msg = (Text) scene.lookup("#errorMsg");
        msg.setText(errorMsg);
        Button close = (Button) scene.lookup("#closeBtn");
        Stage dialog = new Stage();
        close.setOnAction(e -> dialog.close());
        dialog.initModality(Modality.APPLICATION_MODAL);
        dialog.setTitle("Error");
        dialog.getIcons().add(new Image("error.png"));
        dialog.setScene(scene);
        dialog.setResizable(false);
        dialog.showAndWait();
    }
}

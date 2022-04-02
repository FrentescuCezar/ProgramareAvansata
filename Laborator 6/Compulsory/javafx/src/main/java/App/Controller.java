package App;

import javafx.animation.PauseTransition;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import Dialog.Dialog;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Controller {
    @FXML
    private TextField gridWidth;
    @FXML
    private TextField gridHeight;
    @FXML
    private GridPane grid;
    Dialog dialog = new Dialog();

    @FXML
    protected void createGrid() throws IOException {
        String width = gridWidth.getText();
        String height = gridHeight.getText();

        if (!this.isInputValid(width, height)) {
            System.out.println("invalid input");
            return;
        }
        grid.getChildren().clear();
        System.out.println("create grid with width: " + width + " and " + "height: " + height);

        int w = Integer.parseInt(width);
        int h = Integer.parseInt(height);
        int maxVal = Math.max(w, h);
        double size = 480.00 / maxVal;

        int rowIdx = 1;
        int rowCount = 0;

        while (rowCount < h) {
            for (int i = 0; i < w; ++i) {
                grid.addColumn(i, new Rectangle(size, 2));
            }
            for (int i = 0; i < w + 1; ++i) {
                grid.addRow(rowIdx, new Rectangle(2, size));
            }
            rowIdx += 2;
            rowCount++;
        }
        for (int i = 0; i < w; ++i) {
            grid.addColumn(i, new Rectangle(size, 2));
        }
    }

    protected boolean isInputValid(String width, String height) throws IOException {
        if (width.equals("") || height.equals("")) {
            dialog.init("Can't be empty !");
            return false;
        }
        try {
            Integer.parseInt(width);
            Integer.parseInt(height);
        } catch (NumberFormatException err) {
            dialog.init("Please enter only numbers !");
            return false;
        }
        if (Integer.parseInt(width) == 0 || Integer.parseInt(height) == 0) {
            dialog.init("Can't be zero !");
            return false;
        }
        if (Integer.parseInt(width) < 0 || Integer.parseInt(height) < 0) {
            dialog.init("Can't be negative !");
            return false;
        }
        if (Integer.parseInt(width) > 15 || Integer.parseInt(height) > 15) {
            dialog.init("Can't be more than 15 !");
            return false;
        }
        return true;
    }
}
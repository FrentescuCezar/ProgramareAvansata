module app {
    requires javafx.controls;
    requires javafx.fxml;

    exports App;
    opens App to javafx.fxml;
}
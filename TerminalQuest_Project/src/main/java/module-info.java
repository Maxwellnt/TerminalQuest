module com.example.terminalquest_project {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.terminalquest_project to javafx.fxml;
    exports com.example.terminalquest_project;
}
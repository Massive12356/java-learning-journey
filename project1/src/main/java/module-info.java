module com.group9.project1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.group9.project1 to javafx.fxml;
    exports com.group9.project1;
}
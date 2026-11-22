module com.group9.tipcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.group9.tipcalculator to javafx.fxml;
    exports com.group9.tipcalculator;
}
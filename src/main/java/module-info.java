module com.example.automated_testing {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.automated_testing to javafx.fxml;
    exports com.example.automated_testing;
}
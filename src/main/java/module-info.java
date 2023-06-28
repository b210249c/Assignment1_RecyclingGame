module com.jamieleen.assignment1 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.jamieleen.assignment1 to javafx.fxml;
    exports com.jamieleen.assignment1;
}
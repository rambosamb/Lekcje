module com.example.lekcje {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.lekcje to javafx.fxml;
    exports com.example.lekcje;
}
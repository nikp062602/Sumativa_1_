module com.example.sumativa_1_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sumativa_1_ to javafx.fxml;
    exports com.example.sumativa_1_;
}
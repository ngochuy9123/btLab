module com.algorithm.arrayalgorithm {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.algorithm.arrayalgorithm to javafx.fxml;
    exports com.algorithm.arrayalgorithm;
}
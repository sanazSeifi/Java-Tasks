module com.example.getmehired_tasks {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.getmehired_tasks to javafx.fxml;
    exports com.example.getmehired_tasks;
}
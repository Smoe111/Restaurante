module co.uniquindio.estudiantes {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.uniquindio.estudiantes to javafx.fxml;
    exports co.uniquindio.estudiantes;
}

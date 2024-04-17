package co.uniquindio.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;

public class InicioController {
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnIniciarSesion;

    @FXML
    private Button btnRegistrarse;

    @FXML
    void OpenIniciarSesion(ActionEvent event) throws IOException {

        Restaurante.setRoot("viewIniciarSesion");

    }

    @FXML
    void OpenRegistrar(ActionEvent event) throws IOException {

        Restaurante.setRoot("viewRegistrarse");

    }



}



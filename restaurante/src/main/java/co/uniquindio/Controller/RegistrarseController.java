package co.uniquindio.Controller;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;

public class RegistrarseController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnGuardar;

    @FXML
    private Button btnRegresar;

    @FXML
    private TextField txtApellido;

    @FXML
    private PasswordField txtContraseña;

    @FXML
    private TextField txtDocumento;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtUsuario;

    @FXML
    void OpenViewInicio(ActionEvent event) throws IOException{

        Restaurante.setRoot("viewInicio");

    }

    @FXML
    void RegistrarUsuario(ActionEvent event) {



    }


}


   


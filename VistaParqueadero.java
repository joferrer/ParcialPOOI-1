
import java.io.FileInputStream;
import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.fxml.FXML;
public class VistaParqueadero extends Application
{
    public void start(Stage stage)throws IOException{
    FXMLLoader loader = new FXMLLoader();
       
        String path ="Vista/ParqueaderoXML.fxml";
        
        FileInputStream stream = new FileInputStream(path);
        
        Pane root = (Pane) loader.load(stream);
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Vista Fraccionario");
        stage.show();
    }
}

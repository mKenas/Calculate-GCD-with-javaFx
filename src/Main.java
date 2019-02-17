import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    //PS: change the CSS filepath in app.fxml to match your folder structure if the style does not get apply
    // you can fine app.fxml under resources/fxml/app.fxml
    // you can find the logic under resources/controllers/App.java


    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the font
        Font.loadFont(getClass().getResource("resources/fonts/VarelaRound-Regular.ttf").toExternalForm(), 10);
        // Load the FXML file to build the UI.
        Parent root = FXMLLoader.load(getClass().getResource("resources/fxml/app.fxml"));
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    public static void main(String[] args) {

        launch(args);
    }

}

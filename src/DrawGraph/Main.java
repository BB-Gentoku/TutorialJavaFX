package DrawGraph;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;




public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override public void start(Stage stage) throws Exception {
        Label label = new Label("Hello World from Label");
        BorderPane pane = new BorderPane();
        pane.setCenter(label);
        //BorderPane panel1 = new BorderPane();

        Scene scene = new Scene(pane, 320, 240);
        stage.setScene(scene);
        stage.show();
    }
}

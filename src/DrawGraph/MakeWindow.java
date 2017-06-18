package DrawGraph;


/**
 * javaFXのサンプル
 * 無地のウィンドウの生成
*/


import javafx.application.Application;
import javafx.stage.Stage;

public class MakeWindow extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("First Sample");
        stage.show();
    }
}

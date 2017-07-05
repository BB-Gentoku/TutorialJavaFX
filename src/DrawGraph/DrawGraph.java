package DrawGraph;


/**
 * javaFXのサンプル
 * ウィンドウの生成
 * ウィンドウに文字載せる
 * 画像の表示
*/

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class DrawGraph extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Group group = new Group();//Groupクラス 何するか分からん
        Scene scene = new Scene(group);//Sceneクラス 何するか分からん
        stage.setScene(scene);//Stageクラス 引数で中身入ってる 何するか分からん

        Canvas canvas = new Canvas(400, 200);//Canvasクラス 多分画像とか描画するとこ
        group.getChildren().add(canvas);//今は意味不明

        GraphicsContext gc = canvas.getGraphicsContext2D();//グラフィックコンテキスト 分からん newは？
        //newは要らないと思う。gcのインスタンスに入るクラスが返ってくるみたい。

        gc.setFill(Color.RED);//文字の塗りつぶし色？
        gc.setStroke(Color.YELLOW);//文字の外枠色？
        gc.setLineWidth(2);//分からん
        Font font = Font.font("TimesNewRoman", FontWeight.BOLD, 48);//Fontクラス 分からん new?
        gc.setFont(font);
        gc.fillText("Hello_World", 60, 50);
        gc.strokeText("Hello_World", 60, 50);

        //画像が無いとここで例外処理が発生する
        Image earth = new Image("DrawGraph/Earth.png", 120, 120, true, true );//画像はbinファイルに
        gc.drawImage(earth, 180, 100);//画像の出力座標

        stage.setTitle("draw Font and Graphic Sample");
        stage.show();
    }
}

package DrawGraph;

import javafx.animation.AnimationTimer;

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
import javafx.stage.Stage;

public class CheckValuable extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	// サンプルそのまんま
	// 参考の余地あり
	@Override
	public void start(Stage theStage) {
		theStage.setTitle("Timeline Example");

		Group root = new Group();
		Scene theScene = new Scene(root);
		theStage.setScene(theScene);

		Canvas canvas = new Canvas(480, 480);
		root.getChildren().add(canvas);

		GraphicsContext gc = canvas.getGraphicsContext2D();

		Image earth = new Image("DrawGraph/Earth.png", 30, 30, true, true);
		Image sun = new Image("DrawGraph/Sun.png", 90, 90, true, true);
		//Image space = new Image("DrawGraph/Nep.png", 480, 480, true, true);

		final long startNanoTime = System.nanoTime();

		//アニメーションは抽象クラスらしい
		new AnimationTimer() {
			@Override
			public void handle(long currentNanoTime) {
				double t = (currentNanoTime - startNanoTime) / 1000000000.0;

				double x = 232 + 128 * Math.cos(t);
				double y = 232 + 128 * Math.sin(t);

				// background image clears canvas
				//gc.drawImage(space, 0, 0);
				gc.drawImage(earth, x, y);
				gc.drawImage(sun, 196, 196);
			}
		}.start();

		theStage.show();
	}
}

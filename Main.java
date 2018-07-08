//QRCode.java          Author: Jazmine Butler

//
//Generates a QR Code using rectangles//
package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Main extends Application
{

	//creates rectangles for QRCode//
	public void start(Stage primaryStage)
	{
		Rectangle topleft = new Rectangle(0, 0, 150, 150);
		topleft.setFill(Color.BLACK);
	
		Rectangle tlwhite = new Rectangle(4, 4, 100, 100);
		tlwhite.setFill(Color.WHITE);

		Rectangle tlblack = new Rectangle(8, 8, 50, 50);
		tlblack.setFill(Color.BLACK);

		Rectangle topright = new Rectangle (512, 0, 150, 150);
		topright.setFill(Color.BLACK);

		Rectangle trwhite = new Rectangle (516, 4, 100, 100);
		trwhite.setFill(Color.WHITE);

		Rectangle trblack = new Rectangle (520, 8, 50, 50);
		trblack.setFill(Color.BLACK);

		Rectangle botleft = new Rectangle (0, 512, 150, 150);
		botleft.setFill(Color.BLACK);

		Rectangle btlwhite = new Rectangle (4, 516, 100, 100);
		btlwhite.setFill(Color.WHITE);

		Rectangle btlblack = new Rectangle (8, 520, 50, 50);
		btlblack.setFill(Color.BLACK);

		Rectangle btright = new Rectangle (110, 0, 100, 100);
		btright.setFill(Color.BLACK);

		Rectangle btrwhite = new Rectangle (114, 4, 50, 50);
		btrwhite.setFill(Color.WHITE);

		Rectangle btrblack = new Rectangle (118, 8, 25, 25);
		btrblack.setFill(Color.BLACK);

		Group sqr = new Group (tlwhite, tlblack, trwhite, trblack, btlwhite, btlblack, btrwhite, btrblack);
		Group root = new Group (topleft, topright, botleft, btright, sqr);
		Scene scene = new Scene (root, 512, 512);

		primaryStage.setTitle("QRCode");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
}
package aplikacja;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Controller {

	@FXML
	private Rectangle rectangle;

	@FXML
	private Circle circle6;

	@FXML
	private Circle circle1;

	@FXML
	private Circle circle2;

	@FXML
	private Circle circle3;

	@FXML
	private Circle circle4;

	@FXML
	private Circle circle5;

	private double x;
	private double y;

	public void up(ActionEvent e) {
		rectangle.setY(y-=5);
	}

	public void down(ActionEvent e) {
		rectangle.setY(y+=5);
	}

	public void left(ActionEvent e) {
		rectangle.setX(x-=5);
	}

	public void right(ActionEvent e) {
		rectangle.setX(x+=5);
	}

	public void akcja(ActionEvent e) {
		circle6.setCenterX(x+=5);
	}

	public void akcja1(ActionEvent e) {
		circle6.setCenterX(x-=5);
	}

	public void akcjag(ActionEvent e) {
		circle6.setCenterY(y-=5);
	}

	public void akcjad(ActionEvent e) {
		circle6.setCenterY(y+=5);
	}

	public void akcja2(ActionEvent e) {
		/*
		if(circle6.isVisible())
			circle6.setVisible(false);
		else
			circle6.setVisible(true);
			*/

		Circle[] circles = {circle1,circle2,circle3,circle4,circle5,circle6};
		for (Circle circle: circles){
			if(circle6.isVisible())
				circle.setVisible(false);
			else
				circle.setVisible(true);
		}
	}

	public void akcja5(ActionEvent e) {
		//circle1.setFill(Color.RED);

		int liczba = 0;

		Circle[] circles = {circle1,circle2,circle3,circle4,circle5,circle6};
		for (Circle circle: circles){
			System.out.println(circle.getFill());
			circle.setFill(Color.YELLOW);
		}
		liczba++;

		for (Circle circle: circles){
			System.out.println(circle.getFill());
			circle.setFill(Color.YELLOW);
		}

	}

}

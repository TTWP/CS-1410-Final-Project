package application;

import javafx.animation.FadeTransition;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

/**
 * 
 * 
 * 
 * 
 * @author Yingjie He
 * 
 *         This class is ElC Building Level 3 Room class, it inherit from
 *         ElcBuildingLevel3, it it make a point when you search the elc room
 *         number.
 *
 *
 *
 *
 */
public class ElcBuildingLevel3Room extends ElcBuildingLevel3 {
	// To create the array to store the object, here is superclass array, here using
	// the polymorphism.
	private Node[] roomnumNodes = new Node[10];
	// Create attribute
	private String roomNum;

	// The construct
	public ElcBuildingLevel3Room(String rooMnum) {
		super();// To call the super class construct.
		this.roomNum = rooMnum;
		// To create the point
		Circle p301 = new Circle();
		p301.setFill(Color.RED);
		p301.setCenterX(170);
		p301.setCenterY(410);
		p301.setRadius(12);
		roomnumNodes[0] = p301;// And store in the array
		root.getChildren().add(p301);

		Circle p305 = new Circle();
		p305.setFill(Color.RED);
		p305.setCenterX(182);
		p305.setCenterY(235);
		p305.setRadius(7);
		roomnumNodes[1] = p305;
		root.getChildren().add(p305);

		Circle p306 = new Circle();
		p306.setFill(Color.RED);
		p306.setCenterX(245);
		p306.setCenterY(160);
		p306.setRadius(12);
		roomnumNodes[2] = p306;
		root.getChildren().add(p306);

		Circle p308 = new Circle();
		p308.setFill(Color.RED);
		p308.setCenterX(380);
		p308.setCenterY(180);
		p308.setRadius(12);
		roomnumNodes[3] = p308;
		root.getChildren().add(p308);

		Circle p308a = new Circle();
		p308a.setFill(Color.RED);
		p308a.setCenterX(483);
		p308a.setCenterY(129);
		p308a.setRadius(6);
		roomnumNodes[4] = p308a;
		root.getChildren().add(p308a);

		Circle p309 = new Circle();
		p309.setFill(Color.RED);
		p309.setCenterX(580);
		p309.setCenterY(131);
		p309.setRadius(8);
		roomnumNodes[5] = p309;
		root.getChildren().add(p309);

		Circle p310 = new Circle();
		p310.setFill(Color.RED);
		p310.setCenterX(552);
		p310.setCenterY(220);
		p310.setRadius(20);
		roomnumNodes[6] = p310;
		root.getChildren().add(p310);

		Circle p311 = new Circle();
		p311.setFill(Color.RED);
		p311.setCenterX(552);
		p311.setCenterY(325);
		p311.setRadius(20);
		roomnumNodes[7] = p311;
		root.getChildren().add(p311);

		Circle p312 = new Circle();
		p312.setFill(Color.RED);
		p312.setCenterX(552);
		p312.setCenterY(445);
		p312.setRadius(20);
		roomnumNodes[8] = p312;
		root.getChildren().add(p312);

		Circle p313 = new Circle();
		p313.setFill(Color.RED);
		p313.setCenterX(318);
		p313.setCenterY(315);
		p313.setRadius(20);
		roomnumNodes[9] = p313;
		root.getChildren().add(p313);
		// To call the method.
		pointShow();
	}

	// Making a method, to determine which point show.
	public void pointShow() {
		FadeTransition fade = new FadeTransition();// To create a fade effect to this point.
		fade.setDuration(Duration.seconds(2.5));
		// To set close all node first
		for (Node node : roomnumNodes) {
			node.setVisible(false);
		}
		// To decide show which one
		if (roomNum.equals("301")) {
			roomnumNodes[0].setVisible(true);// Showing the point first.
			fade.setNode(roomnumNodes[0]);// To set which point apply this effect.
			fade.setFromValue(0);// To set hide.
			fade.setToValue(1);// To set show.
			fade.play();// Run this fade effect.

		} else if (roomNum.equals("305")) {
			roomnumNodes[1].setVisible(true);
			fade.setNode(roomnumNodes[1]);
			fade.setFromValue(0);
			fade.setToValue(1);
			fade.play();

		} else if (roomNum.equals("306")) {
			roomnumNodes[2].setVisible(true);
			fade.setNode(roomnumNodes[2]);
			fade.setFromValue(0);
			fade.setToValue(1);
			fade.play();

		} else if (roomNum.equals("308")) {
			roomnumNodes[3].setVisible(true);
			fade.setNode(roomnumNodes[3]);
			fade.setFromValue(0);
			fade.setToValue(1);
			fade.play();

		} else if (roomNum.equals("308a")) {
			roomnumNodes[4].setVisible(true);
			fade.setNode(roomnumNodes[4]);
			fade.setFromValue(0);
			fade.setToValue(1);
			fade.play();

		} else if (roomNum.equals("309")) {
			roomnumNodes[5].setVisible(true);
			fade.setNode(roomnumNodes[5]);
			fade.setFromValue(0);
			fade.setToValue(1);
			fade.play();

		} else if (roomNum.equals("310")) {
			roomnumNodes[6].setVisible(true);
			fade.setNode(roomnumNodes[6]);
			fade.setFromValue(0);
			fade.setToValue(1);
			fade.play();

		} else if (roomNum.equals("311")) {
			roomnumNodes[7].setVisible(true);
			fade.setNode(roomnumNodes[7]);
			fade.setFromValue(0);
			fade.setToValue(1);
			fade.play();

		} else if (roomNum.equals("312")) {
			roomnumNodes[8].setVisible(true);
			fade.setNode(roomnumNodes[8]);
			fade.setFromValue(0);
			fade.setToValue(1);
			fade.play();

		} else if (roomNum.equals("313")) {
			roomnumNodes[9].setVisible(true);
			fade.setNode(roomnumNodes[9]);
			fade.setFromValue(0);
			fade.setToValue(1);
			fade.play();
		}
	}

}

package application;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Pagination;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.util.Duration;

/**
 * 
 *
 * @author Changxiang Zeng
 * 
 *         This class is a LIB Building class, to make the LIB windows and
 *         inherit from Building class.
 * 
 * 
 * 
 */

public class Library extends Building {

	public Library() {
		// create the title and put the buiding name on it
		super("The Gerald R. Sherratt Library");

		Text title = new Text(11, 55, "The Gerald R. Sherratt Library");
		title.setFont(Font.font(null, FontWeight.BOLD, 32));
		title.setFill(Color.rgb(245, 115, 0));
		root.getChildren().add(title);

		Pagination pa = new Pagination(3);
		pa.setPrefWidth(325);
		pa.setPrefHeight(325);
		pa.setLayoutX(15);
		pa.setLayoutY(50);
		pa.getStyleClass().add(Pagination.STYLE_CLASS_BULLET);
		pa.setPageFactory(new Callback<Integer, Node>() {

			// put those pictures of the buding on it
			@Override
			public Node call(Integer param) {
				if (param == 0) {
					ImageView image = new ImageView("LB1.jpg");

					image.setFitHeight(325);
					image.setFitWidth(325);
					image.setPreserveRatio(true);

					return image;
				} else if (param == 1) {
					ImageView image = new ImageView("LB2.jpg");

					image.setFitHeight(325);
					image.setFitWidth(325);
					image.setPreserveRatio(true);

					return image;

				} else if (param == 2) {
					ImageView image = new ImageView("LB3.jpg");

					image.setFitHeight(325);
					image.setFitWidth(325);
					image.setPreserveRatio(true);

					return image;
				}
				return new ImageView();
			}
		});

		// create the time line for switch those pictures
		Timeline threeSecondsWonder = new Timeline(new KeyFrame(Duration.seconds(3), event -> {
			int pos = (pa.getCurrentPageIndex() + 1) % pa.getPageCount();
			pa.setCurrentPageIndex(pos);
		}));
		threeSecondsWonder.setCycleCount(Timeline.INDEFINITE);
		threeSecondsWonder.play();

		root.getChildren().add(pa);

		ImageView imageview = new ImageView("SUU-Campus (LB).png");
		imageview.setX(15);
		imageview.setY(380);
		imageview.setFitHeight(350);
		imageview.setFitWidth(350);
		imageview.setPreserveRatio(true);
		root.getChildren().add(imageview);

		// introduction of this budilding
		Text t = new Text(
				"The Gerald R. Sherratt Library opened its doors Spring quarter of 1996. The library has four levels available for students to use, with ample space available for studying. The second and third levels have group study rooms. Students can check out materials at the circulation desk or at the automated check out machine on the first level. The Garden Level also has a waterfall viewing area with various alphabets etched into the wall.");
		t.setLayoutX(400);
		t.setLayoutY(120);
		t.setWrappingWidth(320);
		t.setLineSpacing(10);
		t.setFont(new Font(20));
		root.getChildren().add(t);

		// create a Go Back button and contenect with the main page
		Button gobackbtn = new Button("Go Back");
		gobackbtn.setShape(new Circle(3.0));
		gobackbtn.setLayoutX(762);
		gobackbtn.setLayoutY(445);
		gobackbtn.setPrefSize(100, 30);
		gobackbtn.setTextFill(Color.BLUEVIOLET);
		gobackbtn.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
			gobackbtn.setEffect(shadow);
		});
		gobackbtn.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
			gobackbtn.setEffect(null);
		});
		gobackbtn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Main open = new Main();
				open.start(new Stage());
				stage.close();
			}
		});
		root.getChildren().add(gobackbtn);

	}

}

package application;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
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
 * 
 * @author Yingjie He
 * 
 *         This class is a ELC Building class, to make the ELC windows and
 *         inherit from Building class.
 *
 *
 *
 *
 */

public class ElcBuilding extends Building {
	// The construct
	public ElcBuilding() {
		super("Electronic Learning Center ¡ª ELC");// To call superclass construct.
		Text title = new Text(11, 55, "Electronic Learning Center ¡ª ELC");// To set the title.
		title.setFont(Font.font(null, FontWeight.BOLD, 32));// To set the title font size.
		title.setFill(Color.CORNFLOWERBLUE);// Title color.
		root.getChildren().add(title);

		Pagination pa = new Pagination(6);// To realize scroll picture function.
		pa.setPrefWidth(325);
		pa.setPrefHeight(325);
		pa.setLayoutX(15);
		pa.setLayoutY(50);
		pa.getStyleClass().add(Pagination.STYLE_CLASS_BULLET);// Change style to circle button.
		pa.setPageFactory(new Callback<Integer, Node>() {
			@Override
			public Node call(Integer param) {// To make some in each page
				if (param == 0) {
					ImageView image = new ImageView("ELC.jpg");// Put picture in.
					image.setFitHeight(325);
					image.setFitWidth(325);
					image.setPreserveRatio(true);

					return image;
				} else if (param == 1) {
					ImageView image = new ImageView("ELC2.jpg");
					image.setFitHeight(325);
					image.setFitWidth(325);
					image.setPreserveRatio(true);

					return image;
				} else if (param == 2) {
					ImageView image = new ImageView("ELC3.jpg");
					image.setFitHeight(325);
					image.setFitWidth(325);
					image.setPreserveRatio(true);

					return image;
				} else if (param == 3) {
					ImageView image = new ImageView("ELC4.jpg");
					image.setFitHeight(325);
					image.setFitWidth(325);
					image.setPreserveRatio(true);

					return image;
				} else if (param == 4) {
					ImageView image = new ImageView("TestCenter1.jpg");
					image.setFitHeight(325);
					image.setFitWidth(325);
					image.setPreserveRatio(true);

					return image;
				} else if (param == 5) {
					ImageView image = new ImageView("TestCenter2.jpg");
					image.setFitHeight(325);
					image.setFitWidth(325);
					image.setPreserveRatio(true);

					return image;
				}
				return new ImageView();
			}
		});
		// Let it auto rolling in 3 seconds
		Timeline threeSecondsWonder = new Timeline(new KeyFrame(Duration.seconds(3), event -> {
			int pos = (pa.getCurrentPageIndex() + 1) % pa.getPageCount();
			pa.setCurrentPageIndex(pos);
		}));
		threeSecondsWonder.setCycleCount(Timeline.INDEFINITE);
		threeSecondsWonder.play();
		root.getChildren().add(pa);
		// Add a image
		ImageView imageview = new ImageView("SUU-Campus(ELC).png");
		imageview.setX(15);
		imageview.setY(380);
		imageview.setFitHeight(350);
		imageview.setFitWidth(350);
		imageview.setPreserveRatio(true);
		root.getChildren().add(imageview);
		// Add some information of ELC BUilding
		Text t = new Text(
				"The Electronic Learning Center was finished in 1969, built originally as the Library. During spring quarter of 1996 this building closed its doors as the Library and reopened as the Electronic Learning Center, Media Center, computer labs, and location for the EDNET program. Currently the building houses the Computer Science & Information Systems department, several computer labs/classrooms, the Testing Center, and more. (Retrieve from Southern Utah University Website 'www.suu.edu') ");
		t.setLayoutX(400);
		t.setLayoutY(120);
		t.setWrappingWidth(320);
		t.setLineSpacing(5);
		t.setFont(new Font(19));
		root.getChildren().add(t);
		// To make the level choice Bar
		ChoiceBox<String> cb = new ChoiceBox<String>();
		cb.getItems().addAll("Level", "Level 1", "Level 2", "Level 3", "Level 4");// To set the content of this choice
																					// bar.
		cb.setValue("Level");
		cb.setPrefWidth(120);
		cb.setLayoutX(750);
		cb.setLayoutY(107);
		cb.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (newValue.equals("Level 1")) {// When you choose level 1, open the level 1 page.
					ElcBuildingLevel1 open = new ElcBuildingLevel1();

					stage.close();
				} else if (newValue.equals("Level 2")) {
					ElcBuildingLevel2 open = new ElcBuildingLevel2();

					stage.close();

				} else if (newValue.equals("Level 3")) {
					ElcBuildingLevel3 open = new ElcBuildingLevel3();

					stage.close();

				} else if (newValue.equals("Level 4")) {
					ElcBuildingLevel4 open = new ElcBuildingLevel4();

					stage.close();
				}

			}
		});
		root.getChildren().add(cb);
		// Create the go back button
		Button gobackbtn = new Button("Go Back");
		gobackbtn.setShape(new Circle(3.0));
		gobackbtn.setLayoutX(762);
		gobackbtn.setLayoutY(445);
		gobackbtn.setPrefSize(100, 30);
		gobackbtn.setTextFill(Color.BLUEVIOLET);
		gobackbtn.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {// To make the shadow effect.
			gobackbtn.setEffect(shadow);
		});
		gobackbtn.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
			gobackbtn.setEffect(null);
		});
		gobackbtn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {// When you click the go back button, it will go back to previous
													// page.
				Main open = new Main();
				open.start(new Stage());
				stage.close();
			}
		});
		root.getChildren().add(gobackbtn);

	}

}

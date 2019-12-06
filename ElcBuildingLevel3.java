package application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * 
 * 
 * 
 * @author Yingjie He
 * 
 *         This is ELC level 3 class, which inherit from the ElcBuildingLevel
 * 
 *
 *
 *
 */
public class ElcBuildingLevel3 extends ElcBuildingLevel {
	// The construct
	public ElcBuildingLevel3() {
		super("ELC ¡ª Level 3");// To call the superclass construct

		ImageView levelimage = new ImageView("ELCLevel3.jpg");// To add a picture
		levelimage.setX(15);
		levelimage.setY(100);
		levelimage.setFitHeight(700);
		levelimage.setFitWidth(700);
		levelimage.setPreserveRatio(true);
		root.getChildren().add(levelimage);
		// To set the information of this level
		Text t = new Text("There are claasroom.");
		t.setLayoutX(720);
		t.setLayoutY(250);
		t.setWrappingWidth(280);
		t.setLineSpacing(5);
		t.setFont(new Font(18));
		root.getChildren().add(t);
		// To make the choice bar about the level
		ChoiceBox<String> cb = new ChoiceBox<String>();
		cb.getItems().addAll("Level 1", "Level 2", "Level 3", "Level 4");
		cb.setValue("Level 3");// When you open this window, showing level 3 in the choice bar.
		cb.setPrefWidth(120);
		cb.setLayoutX(750);
		cb.setLayoutY(107);
		cb.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			// Add a listener to listen the what you choose of the choice bar.
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (newValue.equals("Level 1")) {
					ElcBuildingLevel1 open = new ElcBuildingLevel1();
					// When you choose the level 1, open the level 1 window and close current
					// window.
					stage.close();
				} else if (newValue.equals("Level 2")) {
					ElcBuildingLevel2 open = new ElcBuildingLevel2();

					stage.close();

				} else if (newValue.equals("Level 4")) {
					ElcBuildingLevel4 open = new ElcBuildingLevel4();

					stage.close();
				}

			}
		});
		root.getChildren().add(cb);
		// Add a "go back" button.
		Button gobackbtn = new Button("Go Back");
		gobackbtn.setShape(new Circle(3.0));
		gobackbtn.setLayoutX(762);
		gobackbtn.setLayoutY(445);
		gobackbtn.setPrefSize(100, 30);
		gobackbtn.setTextFill(Color.BLUEVIOLET);
		// To make the shadow effect
		gobackbtn.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
			gobackbtn.setEffect(shadow);
		});
		gobackbtn.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
			gobackbtn.setEffect(null);
		});
		// When you click the "go back" button, to execute some handles
		gobackbtn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				ElcBuilding open = new ElcBuilding();// To open the ELC Building window.

				stage.close();
			}
		});
		root.getChildren().add(gobackbtn);
		// To add click button
		Button clickbtn = new Button("Click me");
		clickbtn.setStyle("-fx-font: 9 arial");
		clickbtn.setLayoutX(300);
		clickbtn.setLayoutY(350);
		clickbtn.setPrefSize(47, 14);
		clickbtn.setTextFill(Color.BLUEVIOLET);
		// To add the shadow effect
		clickbtn.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
			clickbtn.setEffect(shadow);
		});
		clickbtn.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
			clickbtn.setEffect(null);
		});
		// When the user click the button, to do some handles
		clickbtn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				clickbtn.setVisible(false);
				// To open a picture
				ImageView corridor1 = new ImageView("ELCcorridor 1.jpg");
				// levelimage1.setRotate(90);
				corridor1.setX(102);
				corridor1.setY(445);
				corridor1.setFitHeight(230);
				corridor1.setFitWidth(230);
				corridor1.setPreserveRatio(true);
				root.getChildren().add(corridor1);
				// To create a button "x"
				Button closebtn = new Button("X");
				closebtn.setStyle("-fx-font: 9 arial");
				closebtn.setLayoutX(208);
				closebtn.setLayoutY(580);
				closebtn.setPrefSize(5, 5);
				closebtn.setTextFill(Color.BLUEVIOLET);
				closebtn.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
					closebtn.setEffect(shadow);
				});
				closebtn.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
					closebtn.setEffect(null);
				});
				closebtn.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent event) {
						// When you click the button, close the picture and close the button, showing
						// the "Click me" button.
						corridor1.setVisible(false);
						closebtn.setVisible(false);
						clickbtn.setVisible(true);
					}
				});
				root.getChildren().add(closebtn);
			}
		});
		root.getChildren().add(clickbtn);
		// The same as the button 1
		Button clickbtn2 = new Button("Click me");
		clickbtn2.setStyle("-fx-font: 9 arial");
		clickbtn2.setLayoutX(393);
		clickbtn2.setLayoutY(290);
		clickbtn2.setPrefSize(47, 14);
		clickbtn2.setRotate(90);
		clickbtn2.setTextFill(Color.BLUEVIOLET);
		clickbtn2.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
			clickbtn2.setEffect(shadow);
		});
		clickbtn2.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
			clickbtn2.setEffect(null);
		});
		clickbtn2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				clickbtn2.setVisible(false);

				ImageView corridor2 = new ImageView("ELCcorridor 2.jpg");
				corridor2.setRotate(90);
				corridor2.setX(555);
				corridor2.setY(285);
				corridor2.setFitHeight(230);
				corridor2.setFitWidth(230);
				corridor2.setPreserveRatio(true);
				root.getChildren().add(corridor2);

				Button closebtn = new Button("X");
				closebtn.setStyle("-fx-font: 9 arial");
				closebtn.setLayoutX(665);
				closebtn.setLayoutY(460);
				closebtn.setPrefSize(5, 5);
				closebtn.setTextFill(Color.RED);
				closebtn.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
					closebtn.setEffect(shadow);
				});
				closebtn.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
					closebtn.setEffect(null);
				});
				closebtn.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent event) {
						corridor2.setVisible(false);
						closebtn.setVisible(false);

						clickbtn2.setVisible(true);
					}
				});
				root.getChildren().add(closebtn);

			}
		});
		root.getChildren().add(clickbtn2);

		Button clickbtn3 = new Button("Click me");
		clickbtn3.setStyle("-fx-font: 9 arial");
		clickbtn3.setLayoutX(300);
		clickbtn3.setLayoutY(230);
		clickbtn3.setPrefSize(47, 13);
		clickbtn3.setTextFill(Color.BLUEVIOLET);
		clickbtn3.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
			clickbtn3.setEffect(shadow);
		});
		clickbtn3.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
			clickbtn3.setEffect(null);
		});
		clickbtn3.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				clickbtn3.setVisible(false);

				ImageView corridor3 = new ImageView("ELCcorridor 3.jpg");
				corridor3.setRotate(90);
				corridor3.setX(223);
				corridor3.setY(22);
				corridor3.setFitHeight(210);
				corridor3.setFitWidth(210);
				corridor3.setPreserveRatio(true);
				root.getChildren().add(corridor3);

				Button closebtn = new Button("X");
				closebtn.setStyle("-fx-font: 9 arial");
				closebtn.setLayoutX(318);
				closebtn.setLayoutY(180);
				closebtn.setPrefSize(5, 5);
				closebtn.setTextFill(Color.RED);
				closebtn.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
					closebtn.setEffect(shadow);
				});
				closebtn.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
					closebtn.setEffect(null);
				});
				closebtn.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent event) {
						corridor3.setVisible(false);
						closebtn.setVisible(false);
						clickbtn3.setVisible(true);
					}
				});
				root.getChildren().add(closebtn);

			}
		});
		root.getChildren().add(clickbtn3);
		// The same as the button 1
		Button clickbtn4 = new Button("Click me");
		clickbtn4.setStyle("-fx-font: 9 arial");
		clickbtn4.setLayoutX(200);
		clickbtn4.setLayoutY(290);
		clickbtn4.setPrefSize(47, 14);
		clickbtn4.setRotate(-90);
		clickbtn4.setTextFill(Color.BLUEVIOLET);
		clickbtn4.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
			clickbtn4.setEffect(shadow);
		});
		clickbtn4.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
			clickbtn4.setEffect(null);
		});
		clickbtn4.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				clickbtn4.setVisible(false);

				ImageView corridor4 = new ImageView("ELCcorridor 4.jpg");
				corridor4.setRotate(90);
				corridor4.setX(-25);
				corridor4.setY(240);
				corridor4.setFitHeight(170);
				corridor4.setFitWidth(170);
				corridor4.setPreserveRatio(true);
				root.getChildren().add(corridor4);

				Button closebtn = new Button("X");
				closebtn.setStyle("-fx-font: 9 arial");
				closebtn.setLayoutX(53);
				closebtn.setLayoutY(365);
				closebtn.setPrefSize(5, 5);
				closebtn.setTextFill(Color.RED);
				closebtn.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
					closebtn.setEffect(shadow);
				});
				closebtn.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
					closebtn.setEffect(null);
				});
				closebtn.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent event) {
						corridor4.setVisible(false);
						closebtn.setVisible(false);
						clickbtn4.setVisible(true);
					}
				});
				root.getChildren().add(closebtn);

			}
		});
		root.getChildren().add(clickbtn4);

	}

}

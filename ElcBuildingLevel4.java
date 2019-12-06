package application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Tooltip;
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
 *         This is the ELC Building Level 4 class, it inherit from
 *         ElcBuildingLevel1
 * 
 * 
 * 
 *
 */
public class ElcBuildingLevel4 extends ElcBuildingLevel {
	// The construct
	public ElcBuildingLevel4() {
		super("ELC ¡ª Level 4");// To call the super class construct

		ImageView levelimage = new ImageView("ELCLevel4.jpg");// Add image
		levelimage.setX(25);
		levelimage.setY(100);
		levelimage.setFitHeight(600);
		levelimage.setFitWidth(600);
		levelimage.setPreserveRatio(true);
		root.getChildren().add(levelimage);

		Text t = new Text("There are professor office.");// To set the text
		t.setLayoutX(640);
		t.setLayoutY(250);
		t.setWrappingWidth(280);
		t.setLineSpacing(5);
		t.setFont(new Font(19));
		root.getChildren().add(t);

		ChoiceBox<String> cb = new ChoiceBox<String>();// To add choice bar
		cb.getItems().addAll("Level 1", "Level 2", "Level 3", "Level4");
		cb.setValue("Level4");// Showing the level 4 in the choice bar.
		cb.setPrefWidth(120);
		cb.setLayoutX(750);
		cb.setLayoutY(107);
		cb.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			// To add a listener to the choice bar
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (newValue.equals("Level 1")) {// When the user click the Level 1, open the ELC Building Level 1
													// window.
					ElcBuildingLevel1 open = new ElcBuildingLevel1();

					stage.close();
				} else if (newValue.equals("Level 2")) {
					ElcBuildingLevel2 open = new ElcBuildingLevel2();

					stage.close();

				} else if (newValue.equals("Level 3")) {
					ElcBuildingLevel3 open = new ElcBuildingLevel3();

					stage.close();

				}

			}
		});
		root.getChildren().add(cb);
		// Add a "Click here go to the level 5 button" button.
		Button goLevel5 = new Button("Click here" + "\n" + "    go to" + "\n" + "The Level 5");
		goLevel5.setTextFill(Color.RED);
		goLevel5.setFont(new Font(10));
		goLevel5.setPrefSize(70, 60);
		goLevel5.setLayoutX(328);
		goLevel5.setLayoutY(425);
		goLevel5.setOnAction(new EventHandler<ActionEvent>() {// When you click the button, to do some handles.
			public void handle(ActionEvent event) {
				ImageView levelimage = new ImageView("ELCLevel5.jpg");// Add a pitcure.
				levelimage.setRotate(90);
				levelimage.setX(25);
				levelimage.setY(100);
				levelimage.setFitHeight(600);
				levelimage.setFitWidth(600);
				levelimage.setPreserveRatio(true);
				root.getChildren().add(levelimage);
				// Add the pup-up window to prompt the user
				Alert alert = new Alert(AlertType.WARNING);
				alert.setTitle("Warning ");
				alert.setHeaderText("Attention");
				alert.setContentText("Please enter the password, and you can go to the level 5. ");
				alert.showAndWait();
				// To set the password text box
				PasswordField p = new PasswordField();
				p.setUserData("Q_+[]AZWSX123321Mmji890DHtYBfR63CA!@#$%");// To set the password of this password text
																			// box.
				p.setPromptText("Password");// To set some text in the password text box.
				p.setTooltip(new Tooltip("Please enter the password"));// When you using the mouse close to this
																		// password text box, it will show some text.
				p.setLayoutX(238);
				p.setLayoutY(310);
				p.setOnAction((ActionEvent e) -> {// To set a listener
					if (p.getText().equals("Q_+[]AZWSX123321Mmji890DHtYBfR63CA!@#$%")) {// To determine which one is
																						// correct.
						Alert alert1 = new Alert(AlertType.INFORMATION);
						alert1.setTitle("Correct");
						alert1.setHeaderText("Correct password");
						alert1.setContentText(
								"Although you enter the correct passward, but you also need a permission to go to the Level 5.");
						alert1.showAndWait();
					} else {
						Alert alert3 = new Alert(AlertType.ERROR);
						alert3.setTitle("Error");
						alert3.setHeaderText("Incorrect password");
						alert3.setContentText("Please enter the correct password.Try it again.");
						alert3.showAndWait();
					}
					p.clear();

				});
				root.getChildren().add(p);
				// Create the "x" button
				Button closeButton = new Button("X");
				closeButton.setLayoutX(300);
				closeButton.setLayoutY(520);
				closeButton.setPrefSize(5, 5);
				closeButton.setFont(new Font(13));
				closeButton.setTextFill(Color.RED);
				closeButton.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent event) {// To add a listener to do some handles.
						levelimage.setVisible(false);// To close image, password text box and "x" button.
						closeButton.setVisible(false);
						p.setVisible(false);

					}
				});
				root.getChildren().add(closeButton);

			}
		});
		root.getChildren().add(goLevel5);

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
				ElcBuilding open = new ElcBuilding();

				stage.close();
			}
		});
		root.getChildren().add(gobackbtn);

	}

}

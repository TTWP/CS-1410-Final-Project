package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * 
 * 
 * 
 * @author Changxiang Zeng
 * 
 *         This class is a superclass, every building class inherit it.
 *
 *
 *
 *
 */

public abstract class Building {
	// Create attributes, using the "protected", which the subclass can use it.
	protected final Stage stage = new Stage();
	protected final Group root = new Group();
	protected final DropShadow shadow = new DropShadow();

	// The construct
	public Building(String buildingName) {
		// Create the windows
		Scene scene = new Scene(root, 900, 600);
		stage.setScene(scene);
		stage.setTitle(buildingName);
		stage.getIcons().add(new Image("SUULogo.png"));
		stage.show();
		// Create the search bar label
		Label Searlabel = new Label("Search");
		Searlabel.setLayoutX(598);// Setting the x and y
		Searlabel.setLayoutY(35);
		Searlabel.setStyle("-fx-font: 16 arial");// Using css to set the font size and font.
		root.getChildren().add(Searlabel);
		// Create the search bar.
		TextField search = new TextField();
		search.setTooltip(new Tooltip("Search Building or Classroom logogram here!"));
		search.setPromptText("Search Buidling or Classroom here!");
		search.setLayoutX(651);
		search.setLayoutY(31);
		search.setStyle("-fx-background-radius:5em;" + "-fx-min-height: 29px; " + "-fx-min-width: 230px; ");// Use the
																											// css to
																											// change
																											// the shape
																											// of the
																											// search
																											// bar.
		search.setOnAction(new EventHandler<ActionEvent>() {// To add a listener to listen the what you enter in the
															// search bar.
			@Override
			public void handle(ActionEvent event) {// To execute the handle
				SearchBar se = new SearchBar();// Create a new instance of SearchBar class
				String content = search.getText();// To get what user enter
				content = content.toLowerCase();// To make all content the user enter to be lower case.
				String nameAlp = content.replaceAll("\\d+", "");// To delete all number, just leave alphabet.
				// To determine what is the content in search bar
				String leaveNumString = content.replaceAll("[^0-9]", ""); // To delete all alphabet, just leave number
				if (content.length() > 1 && content.length() < 7) {
					if (leaveNumString.length() > 2) {

						if (nameAlp.equals("elc")) {
							se.isElcclassroom(content);
							stage.close();
						} else if (nameAlp.equals("st")) {
							se.isStBuilding();
							stage.close();
						} else if (nameAlp.equals("gc")) {
							se.isGcBuilding();
							stage.close();
						} else if (nameAlp.equals("pe")) {
							se.isPeBuilding();
							stage.close();
						} else if (nameAlp.equals("lib")) {
							se.isLibBuilding();
							stage.close();
						} else if (nameAlp.equals("tt")) {
							se.isTtBuilding();
							stage.close();
						} else {
							// To make a pop-up window to make user know some information
							Alert alert = new Alert(AlertType.INFORMATION);
							alert.setTitle("Tips");
							alert.setHeaderText("No search results");
							alert.setContentText(
									"Please do not enter illegal characters. Now you just can search \"ELC\" or \"ST\" or \"GC\" or \"PE\" or \"LiB\" or \"TT\"(the theater) or the classroom in ELC");
							alert.showAndWait();
						}
					} else {
						Alert alert = new Alert(AlertType.WARNING);
						alert.setTitle("Warning ");
						alert.setHeaderText("There is no this classroom");
						alert.setContentText("Please check you enter. Try it again.");
						alert.showAndWait();

					}

				} else {
					Alert alert = new Alert(AlertType.WARNING);
					alert.setTitle("Warning ");
					alert.setHeaderText("Please do not enter illegal characters.");
					alert.setContentText(
							"Don't enter too long or too short characters. You need to enter like \"elc\" or \"sc\" or \"elc311\"");
					alert.showAndWait();
				}
			}
		});
		root.getChildren().add(search);
		// Making a button of "Home"
		Button homebtn = new Button("Home");
		homebtn.setShape(new Circle(3.0));
		homebtn.setLayoutX(762);
		homebtn.setLayoutY(500);
		homebtn.setPrefSize(100, 30);
		homebtn.setTextFill(Color.BLUEVIOLET);
		homebtn.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
			homebtn.setEffect(shadow);
		});
		homebtn.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
			homebtn.setEffect(null);
		});
		homebtn.setOnAction(new EventHandler<ActionEvent>() {// When you click the button, you will return the main
																// windows, and close the current page.
			public void handle(ActionEvent event) {
				Main open = new Main();
				open.start(new Stage());
				stage.close();
			}
		});
		root.getChildren().add(homebtn);

	}

}

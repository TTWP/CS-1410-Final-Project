package application;

import javafx.application.Application;
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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * 
 * 
 * @author Changxiang Zeng, Yingjie He
 * 
 *         This class is a main class and the application home screen.
 * 
 * 
 * 
 */

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			// This group code is making a windows and set the icon.
			// Changxiang Zeng code it.
			Group root = new Group();
			Scene scene = new Scene(root, 900, 600);
			primaryStage.setScene(scene);
			primaryStage.setTitle("SUU Classroom Map");
			primaryStage.show();
			primaryStage.getIcons().add(new Image("SUULogo.png"));
			// This one is insert a picture
			// Changxiang Zeng code it.
			ImageView imageview = new ImageView("SUU-Campus.png");
			imageview.setX(0);
			imageview.setY(100);
			imageview.setFitHeight(900);
			imageview.setFitWidth(900);
			imageview.setPreserveRatio(true);
			root.getChildren().add(imageview);
			// Yingjie He code it
			// To make the title
			Text title = new Text(12, 75, "SUU Classroom Map");
			title.setFont(new Font(50));
			title.setFill(Color.RED);
			root.getChildren().add(title);
			// Yingjie He code it
			// To make the title
			Text title1 = new Text(8, 75, "SUU Classroom Map");
			title1.setFont(new Font(50));
			title1.setFill(Color.GOLD);
			root.getChildren().add(title1);
			// Changxiang Zeng code it
			// To make Theater button
			DropShadow shadow = new DropShadow();
			Button Scbtn = new Button("Sharwan Smith Student Center (SC)");
			Scbtn.setShape(new Circle(3.0));
			Scbtn.setLayoutX(155);
			Scbtn.setLayoutY(340);
			Scbtn.setPrefSize(245, 45);
			Scbtn.setTextFill(Color.RED);
			Scbtn.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
				Scbtn.setEffect(shadow);
			});
			Scbtn.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
				Scbtn.setEffect(null);
			});
			Scbtn.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {// Click it opne a st window.
					StudentCenter open = new StudentCenter();
					primaryStage.close();
				}
			});
			root.getChildren().add(Scbtn);
			// Changxiang Zeng code it
			// To make Theater button
			Button Pebtn = new Button("J.L. Sorenson" + "\n" + " PE Building" + "\n" + "      (PEB)");
			Pebtn.setLayoutX(337);
			Pebtn.setLayoutY(128);
			Pebtn.setPrefSize(92, 58);
			Pebtn.setTextFill(Color.ORANGE);
			Pebtn.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
				Pebtn.setEffect(shadow);
			});
			Pebtn.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
				Pebtn.setEffect(null);
			});
			Pebtn.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {// Click it opne a pe window.
					PEbuilding open = new PEbuilding();
					primaryStage.close();
				}
			});

			root.getChildren().add(Pebtn);
			// Yingjie He code it
			// To make Theater button
			Button Libbtn = new Button("Gerald R." + "\n" + " Sherratt" + "\n" + "  Library" + "\n" + "   (LIB)");
			Libbtn.setStyle("-fx-background-radius: 5em;" + "-fx-min-width: 65px; " + "-fx-min-height: 65px; "
					+ "-fx-max-width: 65px; " + "-fx-max-height: 65px;" + "-fx-font: 9 arial");
			Libbtn.setLayoutX(454);
			Libbtn.setLayoutY(424);
			Libbtn.setTextFill(Color.rgb(245, 115, 0));
			Libbtn.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
				Libbtn.setEffect(shadow);
			});
			Libbtn.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
				Libbtn.setEffect(null);
			});
			Libbtn.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {// Click it opne a lib window.
					Library open = new Library();
					primaryStage.close();
				}
			});
			root.getChildren().add(Libbtn);
			// Yingjie He code it
			// To make Theater button
			Button Elcbtn = new Button("Electronic" + "\n" + " Learning" + "\n" + "  Center" + "\n" + "   (ELC)");
			Elcbtn.setStyle("-fx-font: 9 arial");
			Elcbtn.setPrefSize(52, 52);
			Elcbtn.setLayoutX(576);
			Elcbtn.setLayoutY(357);
			Elcbtn.setTextFill(Color.BLUEVIOLET);
			Elcbtn.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
				Elcbtn.setEffect(shadow);
			});
			Elcbtn.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
				Elcbtn.setEffect(null);
			});
			Elcbtn.setOnAction(new EventHandler<ActionEvent>() {// Click it opne a elc window.
				public void handle(ActionEvent event) {
					ElcBuilding open = new ElcBuilding();
					primaryStage.close();
				}
			});
			root.getChildren().add(Elcbtn);
			// Changxiang Zeng code it
			// To make Theater button
			Button Thebtn = new Button("Theater");
			Thebtn.setStyle("-fx-font: 10 arial");
			Thebtn.setPrefSize(49, 25);
			Thebtn.setLayoutX(660);
			Thebtn.setLayoutY(258);
			Thebtn.setTextFill(Color.PURPLE);
			Thebtn.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
				Thebtn.setEffect(shadow);
			});
			Thebtn.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
				Thebtn.setEffect(null);
			});
			Thebtn.setOnAction(new EventHandler<ActionEvent>() {// Click it opne a theater window.
				public void handle(ActionEvent event) {
					Theater open = new Theater();
					primaryStage.close();
				}
			});
			root.getChildren().add(Thebtn);
			// Changxiang Zeng code it
			// To make the button
			Button Gcbtn = new Button("  General" + "\n" + "Classroom" + "\n" + "  Building" + "\n" + "     (GC)");
			Gcbtn.setStyle("-fx-background-radius: 10em; " + "-fx-min-width: 75px; " + "-fx-min-height: 85px; "
					+ "-fx-max-width: 95px; " + "-fx-max-height: 80px;" + "-fx-font: 11 arial");
			Gcbtn.setLayoutX(750);
			Gcbtn.setLayoutY(332);
			Gcbtn.setTextFill(Color.HOTPINK);
			Gcbtn.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
				Gcbtn.setEffect(shadow);
			});
			Gcbtn.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
				Gcbtn.setEffect(null);
			});
			root.getChildren().add(Gcbtn);
			Gcbtn.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					GeneralClassroomsBuilding open = new GeneralClassroomsBuilding();// Click it opne a gc window.
					primaryStage.close();
				}
			});
			// Yingjie He code it
			// To make the search bar, and to make the decision.
			Label Searlabel = new Label("Search");
			Searlabel.setLayoutX(565);
			Searlabel.setLayoutY(54);
			Searlabel.setStyle("-fx-font: 16 arial");
			root.getChildren().add(Searlabel);

			TextField search = new TextField();
			search.setTooltip(new Tooltip("Search Building or Classroom logogram here!"));// When the mouse close to the
																							// text box, it will show
																							// text.
			search.setPromptText("Search Building or Classroom here!");
			search.setLayoutX(618);
			search.setLayoutY(50);
			search.setStyle("-fx-background-radius:5em;" + "-fx-min-height: 29px; " + "-fx-min-width: 230px; ");// Using
																												// css
																												// to
																												// make
																												// this
																												// format.
			search.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {// To handle the content in the text box.
					SearchBar se = new SearchBar();// To creat a new search bar class.
					String content = search.getText();
					content = content.toLowerCase();// To make all input content be a lower case.
					String nameAlp = content.replaceAll("\\d+", "");// To delete all number, just show the alphabet.
					String leaveNumString = content.replaceAll("[^0-9]", ""); // To delete all alphabet, just leave
																				// number
					if (content.length() > 1 && content.length() < 8) {// When the content length is greater than 1 and
																		// less than 8, go to seach.
						if (leaveNumString.length() > 2) {
							if (nameAlp.equals("elc")) {
								se.isElcclassroom(content);// To pass the argument "content" to SearchBar class
															// "isElcclassroom" method.
								primaryStage.close();
							} else if (nameAlp.equals("st")) {
								se.isStBuilding();
								primaryStage.close();
							} else if (nameAlp.equals("gc")) {
								se.isGcBuilding();
								primaryStage.close();
							} else if (nameAlp.equals("pe")) {
								se.isPeBuilding();
								primaryStage.close();
							} else if (nameAlp.equals("lib")) {
								se.isLibBuilding();
								primaryStage.close();
							} else if (nameAlp.equals("tt")) {
								se.isTtBuilding();
								primaryStage.close();
							} else {// If not "elc", "st", "gc", "pe", "lib", "tt", showing the not results.
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

					} else {// If the content less than 1 and greater than 8, it will show some warning in
							// this window.
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
			// Changxiang Zeng code it.
			// To show some information at the bottom
			Text name = new Text(310, 585, "Yingjie He");
			name.setFont(new Font(15));
			root.getChildren().add(name);

			Text name1 = new Text(460, 585, "Changxiang Zeng");
			name1.setFont(new Font(15));
			root.getChildren().add(name1);

			Text version = new Text(838, 595, "Version 1.0");
			version.setFont(new Font(11));
			root.getChildren().add(version);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// The main method, to open the window.
	public static void main(String[] args) {
		launch(args);
	}
}

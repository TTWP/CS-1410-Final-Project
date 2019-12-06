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
 * 
 * @author Changxiang Zeng
 * 
 *         This is ELC level 2 class, which inherit from the ElcBuildingLevel
 *
 *
 *
 *
 *
 */
public class ElcBuildingLevel2 extends ElcBuildingLevel {
	// To call the superclass construct
	public ElcBuildingLevel2() {
		super("ELC ¡ª Level 2");

		ImageView levelimage = new ImageView("ELCLevel2.jpg");// To add a picture
		levelimage.setX(35);
		levelimage.setY(100);
		levelimage.setFitHeight(550);
		levelimage.setFitWidth(550);
		levelimage.setPreserveRatio(true);
		root.getChildren().add(levelimage);
		// To set the information of this level
		Text t = new Text("There are Tutoring center and Testing center.");
		t.setLayoutX(610);
		t.setLayoutY(230);
		t.setWrappingWidth(280);
		t.setLineSpacing(5);
		t.setFont(new Font(20));
		root.getChildren().add(t);
		// To make the choice bar about the level
		ChoiceBox<String> cb = new ChoiceBox<String>();
		cb.getItems().addAll("Level 1", "Leve2", "Level 3", "Level 4");
		cb.setValue("Leve2");// When you open this window, showing level 2 in the choice bar.
		cb.setPrefWidth(120);
		cb.setLayoutX(750);
		cb.setLayoutY(107);
		cb.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			// Add a listener to listen the what you choose of the choice bar.
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (newValue.equals("Level 1")) {
					ElcBuildingLevel1 open = new ElcBuildingLevel1();
					// When you choose the level 2, open the level 2 window and close current
					// window.
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
				ElcBuilding open = new ElcBuilding();
				// To open the ELC Building window.

				stage.close();
			}
		});
		root.getChildren().add(gobackbtn);

	}
}

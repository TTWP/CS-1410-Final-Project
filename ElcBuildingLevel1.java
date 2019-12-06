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
 *         This is ELC level 1 class, which inherit from the ElcBuildingLevel
 *
 * 
 * 
 *
 */
public class ElcBuildingLevel1 extends ElcBuildingLevel {
	// The construct
	public ElcBuildingLevel1() {
		super("ELC ¡ª Level 1");// To call the superclass construct

		ImageView levelimage = new ImageView("ELCLevel1.jpg");// To add a picture
		levelimage.setX(35);
		levelimage.setY(100);
		levelimage.setFitHeight(550);
		levelimage.setFitWidth(550);
		levelimage.setPreserveRatio(true);
		root.getChildren().add(levelimage);

		Text t = new Text(// To set the information of this level
				"There are air-conditioned main engines and some offices. In addition, there are tutors for most CSIS courses.");
		t.setLayoutX(610);
		t.setLayoutY(230);
		t.setWrappingWidth(280);
		t.setLineSpacing(5);
		t.setFont(new Font(20));
		root.getChildren().add(t);

		ChoiceBox<String> cb = new ChoiceBox<String>();// To make the choice bar about the level
		cb.getItems().addAll("Level 1", "Level 2", "Level 3", "Level 4");
		cb.setValue("Level 1");// When you open this window, showing level 1 in the choice bar.
		cb.setPrefWidth(120);
		cb.setLayoutX(750);
		cb.setLayoutY(107);
		cb.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			// Add a listener to listen the what you choose of the choice bar.
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				if (newValue.equals("Level 2")) {// When you choose the level 2, open the level 2 window and close
													// current window.
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

		Button gobackbtn = new Button("Go Back");// Add a "go back" button.
		gobackbtn.setShape(new Circle(3.0));
		gobackbtn.setLayoutX(762);
		gobackbtn.setLayoutY(445);
		gobackbtn.setPrefSize(100, 30);
		gobackbtn.setTextFill(Color.BLUEVIOLET);
		gobackbtn.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {// To make the shadow effect
			gobackbtn.setEffect(shadow);
		});
		gobackbtn.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
			gobackbtn.setEffect(null);
		});
		gobackbtn.setOnAction(new EventHandler<ActionEvent>() {// When you click the "go back" button, to execute some
																// handles
			public void handle(ActionEvent event) {
				ElcBuilding open = new ElcBuilding();// To open the ELC Building window.

				stage.close();
			}
		});
		root.getChildren().add(gobackbtn);

	}
}

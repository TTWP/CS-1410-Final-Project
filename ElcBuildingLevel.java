package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 * 
 * 
 * 
 * @author Yingjie He
 * 
 *         This is ELc Building Level window superclass, which inherit from
 *         building class.
 *
 *
 *
 */

public abstract class ElcBuildingLevel extends Building {
	// This is a one argument construct
	public ElcBuildingLevel(String levelName) {
		super("Electronic Learning Center");// To Call the superclass construct

		Text title = new Text(11, 55, levelName);// To set the title name

		title.setFont(Font.font(null, FontWeight.BOLD, 32));// To set the font size and font
		title.setFill(Color.CORNFLOWERBLUE);// To set the title font color
		root.getChildren().add(title);// Add the title to "Group", which inherit from the stage.

		ImageView levelimage = new ImageView("ELCLevel1.jpg");// To show the level picture.
		levelimage.setX(35);
		levelimage.setY(100);
		levelimage.setFitHeight(550);
		levelimage.setFitWidth(550);
		levelimage.setPreserveRatio(true);
		root.getChildren().add(levelimage);

		Button gobackbtn = new Button("Go Back");// To show the "Go back" button.
		gobackbtn.setShape(new Circle(3.0));// To make the shape of this button.
		gobackbtn.setLayoutX(762);
		gobackbtn.setLayoutY(445);
		gobackbtn.setPrefSize(100, 30);
		gobackbtn.setTextFill(Color.BLUEVIOLET);// To set the text in the button color.
		gobackbtn.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {// To make the shadow effect.
			gobackbtn.setEffect(shadow);
		});
		gobackbtn.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
			gobackbtn.setEffect(null);
		});
		gobackbtn.setOnAction(new EventHandler<ActionEvent>() {// When you click open the ELC Building class.
			public void handle(ActionEvent event) {
				ElcBuilding open = new ElcBuilding();
				stage.close();
			}
		});
		root.getChildren().add(gobackbtn);

	}

}

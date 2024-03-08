import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

/**
 * @ Introduction : JavaFX program which have smiley face on the screen having two eyes and smile.
 * @ Author: Prakash Layo Magar
 * @ Version : 12/14/2023
 */
public class SmileyFace extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a pane to hold the smiley face elements
        Pane root = new Pane();

        // Create a circle for the face
        Circle face = new Circle(150, 150, 100);
        face.setFill(Color.LIGHTBLUE);
        face.setStroke(Color.BLACK);

        // Create two circles for the eyes
        Circle leftEye = new Circle(110, 120, 15);
        Circle rightEye = new Circle(190, 120, 15);
        leftEye.setFill(Color.GOLD);
        rightEye.setFill(Color.GOLD);
        leftEye.setStroke(Color.BLACK);
        rightEye.setStroke(Color.BLACK);

        // Create an arc for the smile
        Arc smile = new Arc(150, 180, 50, 40, 0, -180);
        smile.setType(ArcType.OPEN);
        smile.setFill(Color.TRANSPARENT);
        smile.setStroke(Color.BLACK);
        smile.setStrokeWidth(3);

        // Add all elements to the pane
        root.getChildren().addAll(face, leftEye, rightEye, smile);

        // Create the scene and set it in the stage
        Scene scene = new Scene(root, 300, 300);
        primaryStage.setTitle("Smiley Face ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

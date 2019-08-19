package Exper;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;

public class Experiement extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Key Press");
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300 ,300);
        primaryStage.setScene(scene);
        Text hi = new Text("asf");
        root.getChildren().add(hi);
        scene.setOnKeyTyped(event -> {
            if (event.getCharacter().equals("q"))
                Platform.exit();
            else
                hi.setText("Fuck you" + event.getCharacter());
        });
        primaryStage.show();
    }
    static public void sd (Integer g) {
        g = new Integer(14);
    }
    public static void main(String[] args) {
        // launch(args);
        Experiement ex = new Experiement();
        System.out.println(ex instanceof Experiement);
        System.out.println(Math.pow(2, 0.5));
        System.out.println(Math.ceil(2.000));
        System.out.println(0 % 2);
    }
}

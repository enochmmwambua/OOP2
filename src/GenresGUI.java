import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class GenresGUI extends Application {

    @Override
    public void start(Stage stage) {
        Text name = new Text("Name:");
        Text registered = new Text("Registered:");
        
        TextField Field = new TextField();
        ComboBox<String> registeredCombo = new ComboBox<>();
        registeredCombo.setPrefWidth(150); // Standardize width
        
        Button save = new Button("Save");
        Button remove = new Button("Remove");

        String buttonStyle = "-fx-background-color: #2F4F4F; -fx-text-fill: white; -fx-font-weight: bold;";
        save.setStyle(buttonStyle);
        save.setPrefWidth(150);
        remove.setStyle(buttonStyle);
        remove.setPrefWidth(150);
        
        name.setStyle("-fx-font: normal bold 16px 'serif'");
        registered.setStyle("-fx-font: normal bold 16px 'serif'");

        GridPane gridPane = new GridPane();
        gridPane.setMinSize(400, 300);
        gridPane.setPadding(new Insets(20, 20, 20, 20));
        gridPane.setVgap(15);
        gridPane.setHgap(15);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setStyle("-fx-background-color: #F5F5DC;"); // Beige background


        gridPane.add(name, 0, 0);
        gridPane.add(Field, 1, 0);
        gridPane.add(save, 1, 1);
        gridPane.add(registered, 0, 2);
        gridPane.add(registeredCombo, 1, 2);
        gridPane.add(remove, 1, 3);


        Scene scene = new Scene(gridPane);
        stage.setTitle("Movie Library System - Genres");
        stage.setScene(scene);
        stage.show();
    }

   public static void main(String[] args) {
        launch(args);
    }
}
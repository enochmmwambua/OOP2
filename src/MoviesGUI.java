import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MoviesGUI extends Application {

    @Override
    public void start(Stage stage) {
        // Create Nodes
        Text genreText = new Text("Genre:");
        Text nameText = new Text("Name:");
        Text registeredText = new Text("Registered:");
        
        ComboBox<String> genreCombo = new ComboBox<>();
        TextField nameField = new TextField();
        ComboBox<String> registeredCombo = new ComboBox<>();
        
        genreCombo.setPrefWidth(200);
        registeredCombo.setPrefWidth(200);
        
        Button saveBtn = new Button("Save Movie");
        Button removeBtn = new Button("Remove Movie");

        // Styling
        String buttonStyle = "-fx-background-color: #4682B4; -fx-text-fill: white; -fx-font-weight: bold;";
        saveBtn.setStyle(buttonStyle);
        saveBtn.setPrefWidth(200);
        removeBtn.setStyle(buttonStyle);
        removeBtn.setPrefWidth(200);

        String textStyle = "-fx-font: normal bold 14px 'sans-serif'";
        genreText.setStyle(textStyle);
        nameText.setStyle(textStyle);
        registeredText.setStyle(textStyle);

        // Layout setup
        GridPane grid = new GridPane();
        grid.setMinSize(450, 350);
        grid.setPadding(new Insets(20));
        grid.setVgap(15);
        grid.setHgap(15);
        grid.setAlignment(Pos.CENTER);
        grid.setStyle("-fx-background-color: #F8F8FF;"); // GhostWhite background

        // Arrange nodes
        grid.add(genreText, 0, 0);
        grid.add(genreCombo, 1, 0);
        
        grid.add(nameText, 0, 1);
        grid.add(nameField, 1, 1);
        grid.add(saveBtn, 1, 2);
        
        grid.add(registeredText, 0, 3);
        grid.add(registeredCombo, 1, 3);
        grid.add(removeBtn, 1, 4);

        // Display
        Scene scene = new Scene(grid);
        stage.setTitle("Movie Library System - Movies");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
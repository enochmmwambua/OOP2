import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RentalsGUI extends Application {

    @Override
    public void start(Stage stage) {
        // Nodes
        Text customerText = new Text("Customer:");
        Text genreText = new Text("Genre:");
        Text moviesText = new Text("Movies:");
        Text borrowedText = new Text("Borrowed:");
        Text returnedText = new Text("Returned:");
        
        ComboBox<String> customerCombo = new ComboBox<>();
        ComboBox<String> genreCombo = new ComboBox<>();
        ComboBox<String> moviesCombo = new ComboBox<>();
        ComboBox<String> borrowedCombo = new ComboBox<>();
        ComboBox<String> returnedCombo = new ComboBox<>();
        
        // Uniform width for comboboxes
        double boxWidth = 250;
        customerCombo.setPrefWidth(boxWidth);
        genreCombo.setPrefWidth(boxWidth);
        moviesCombo.setPrefWidth(boxWidth);
        borrowedCombo.setPrefWidth(boxWidth);
        returnedCombo.setPrefWidth(boxWidth);
        
        Button saveBtn = new Button("Save Rental");
        Button returnBtn = new Button("Return Movie");

        // Styling
        String btnStyle = "-fx-background-color: #FF8C00; -fx-text-fill: white; -fx-font-weight: bold;";
        saveBtn.setStyle(btnStyle);
        saveBtn.setPrefWidth(boxWidth);
        returnBtn.setStyle(btnStyle);
        returnBtn.setPrefWidth(boxWidth);

        // Layout
        GridPane grid = new GridPane();
        grid.setMinSize(550, 500);
        grid.setPadding(new Insets(25));
        grid.setVgap(15);
        grid.setHgap(20);
        grid.setAlignment(Pos.CENTER);
        grid.setStyle("-fx-background-color: #E6E6FA;"); // Lavender background for distinction

        // Arrange
        grid.add(customerText, 0, 0);
        grid.add(customerCombo, 1, 0);
        
        grid.add(genreText, 0, 1);
        grid.add(genreCombo, 1, 1);
        
        grid.add(moviesText, 0, 2);
        grid.add(moviesCombo, 1, 2);
        grid.add(saveBtn, 1, 3);
        
        grid.add(borrowedText, 0, 4);
        grid.add(borrowedCombo, 1, 4);
        grid.add(returnBtn, 1, 5);
        
        grid.add(returnedText, 0, 6);
        grid.add(returnedCombo, 1, 6);

        // Show
        Scene scene = new Scene(grid);
        stage.setTitle("Movie Library System - Rentals");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
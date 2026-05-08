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

public class CustomersGUI extends Application {

    @Override
    public void start(Stage stage) {
        // Nodes
        Text nameText = new Text("Name:");
        Text phoneText = new Text("Phone:");
        Text emailText = new Text("Email:");
        Text registeredText = new Text("Registered:");
        
        TextField nameField = new TextField();
        TextField phoneField = new TextField();
        TextField emailField = new TextField();
        ComboBox<String> registeredCombo = new ComboBox<>();
        registeredCombo.setPrefWidth(200);
        
        Button saveBtn = new Button("Save Customer");
        Button removeBtn = new Button("Remove Customer");

        String btnStyle = "-fx-background-color: #3CB371; -fx-text-fill: white; -fx-font-weight: bold;";
        saveBtn.setStyle(btnStyle);
        saveBtn.setPrefWidth(200);
        removeBtn.setStyle(btnStyle);
        removeBtn.setPrefWidth(200);

        GridPane grid = new GridPane();
        grid.setMinSize(500, 400);
        grid.setPadding(new Insets(20));
        grid.setVgap(15);
        grid.setHgap(15);
        grid.setAlignment(Pos.CENTER);
        grid.setStyle("-fx-background-color: #FAFAFA; -fx-border-color: #D3D3D3; -fx-border-width: 2px;");

        grid.add(nameText, 0, 0);
        grid.add(nameField, 1, 0);
        
        grid.add(phoneText, 0, 1);
        grid.add(phoneField, 1, 1);
        
        grid.add(emailText, 0, 2);
        grid.add(emailField, 1, 2);
        grid.add(saveBtn, 1, 3);
        
        grid.add(registeredText, 0, 4);
        grid.add(registeredCombo, 1, 4);
        grid.add(removeBtn, 1, 5);


        Scene scene = new Scene(grid);
        stage.setTitle("Movie Library System - Customers");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
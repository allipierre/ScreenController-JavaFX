/**
 * 
 */
package screenframework;

import java.io.IOException;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * @author yotti
 *
 */
public class ControllerDialog {
	@FXML
	private TextField IDT;

	public ControllerDialog start() {
		try {
			// ModellHome m = new ModellHome();
			// setId(m.getIdm()) ;
			Stage primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Modal.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("MyDialog");
			primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("bal.png")));
			primaryStage.initModality(Modality.WINDOW_MODAL);
			 primaryStage.initOwner(ScreensFramework.getMainStage());
			 primaryStage.show();

			return loader.getController();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void setId(String id) {
		IDT.setText(String.valueOf(id));
	}

}
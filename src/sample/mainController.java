package sample;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class mainController {
    @FXML public TableView tableView;
    @FXML public TableColumn colMatiere;
    @FXML public TableColumn colType;
    @FXML public TableColumn colDate;
    @FXML public TableColumn colHeure;
    @FXML public TableColumn colFin;
    @FXML public TableColumn colDuree;
    @FXML public TableColumn colSalle;
    @FXML public TableColumn colProf;
    @FXML public ChoiceBox cbMatiere;

    public mainController(){
        //cbMatiere = new ChoiceBox(FXCollections.observableArrayList(Matiere.AP.nom, Matiere.BD.nom, Matiere.CDIN.nom, Matiere.SI.nom));
    }

}

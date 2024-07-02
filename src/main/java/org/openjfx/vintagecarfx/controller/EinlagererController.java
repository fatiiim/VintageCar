package org.openjfx.vintagecarfx.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.openjfx.vintagecarfx.einlagerer.Einlagerer;
import org.openjfx.vintagecarfx.einlagerer.Fahrzeug;

public class EinlagererController {
    private final Einlagerer einlagerer;
    private final Stage stage;
    @FXML
    private TableView<Fahrzeug> fahrzeugTable;
    @FXML
    private TableColumn<Fahrzeug, String> fahrzeugName;
    @FXML
    private TableColumn<Fahrzeug, String> fahrzeugStatus;

    public EinlagererController(Einlagerer einlagerer, Stage stage) {
        this.einlagerer = einlagerer;
        this.stage = stage;
    }


    @FXML
    public void initialize(){
        fahrzeugName.setCellValueFactory(new PropertyValueFactory<>("Fahrzeug"));
        fahrzeugStatus.setCellValueFactory(new PropertyValueFactory<>("Status"));
    }

    @FXML
    public void fahrzeugeAnzeigen(){

        ObservableList<Fahrzeug> observableList = FXCollections.observableList(einlagerer.getFahrzeuge());
        fahrzeugTable.setItems(observableList);
    }

}

package org.openjfx.vintagecarfx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;
import org.openjfx.vintagecarfx.enums.Marke;
import org.openjfx.vintagecarfx.ersatzteilanbieter.Ersatzteil;
import org.openjfx.vintagecarfx.ersatzteilanbieter.Ersatzteilanbieter;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.List;

public class ErsatzteilanbieterController {
    private final Ersatzteilanbieter ersatzteilanbieter;
    private final Stage stage;

        @FXML
        private TableView<Ersatzteil> ersatzteilTable;
        @FXML
        private TableColumn<Ersatzteil, Integer> ersatzteilIDColumn;
        @FXML
        private TableColumn<Ersatzteil, String> ersatzteilNameColumn;
        @FXML
        private TableColumn<Ersatzteil, Integer> ersatzteilGewichtColumn;
        @FXML
        private TableColumn<Ersatzteil, String> ersatzteilMaterialColumn;
        @FXML
        private TableColumn<Ersatzteil, Integer> ersatzteilGarantieColumn;
        @FXML
        private TableColumn<Ersatzteil, String> ersatzteilHerstellerColumn;
        @FXML
        private TableColumn<Ersatzteil, String> ersatzteilZustandColumn;

    public ErsatzteilanbieterController(Ersatzteilanbieter ersatzteilanbieter, Stage stage) {
        this.ersatzteilanbieter = ersatzteilanbieter;
        this.stage = stage;
    }

        @FXML
        public void initialize() {
            List<Ersatzteil> ersatzteile = ersatzteilanbieter.getErsatzteile(Marke.AUDI);
            ersatzteilIDColumn.setCellValueFactory(new PropertyValueFactory<>("ersatzteil_ID"));
            ersatzteilNameColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));
            ersatzteilGewichtColumn.setCellValueFactory(new PropertyValueFactory<>("Gewicht"));
            ersatzteilMaterialColumn.setCellValueFactory(new PropertyValueFactory<>("Material"));
            ersatzteilGarantieColumn.setCellValueFactory(new PropertyValueFactory<>("Garantie"));
            ersatzteilHerstellerColumn.setCellValueFactory(new PropertyValueFactory<>("Hersteller"));
            ersatzteilZustandColumn.setCellValueFactory(new PropertyValueFactory<>("Zustand"));

            ersatzteilTable.getItems().setAll(ersatzteilanbieter.getErsatzteile(Marke.AUDI));
        }

    //public String zeigInfos() {return ersatzteilanbieter.zeigInfos();}

    //public boolean isInfosVollstaendig() {return ersatzteilanbieter.isInfosVollstaendig();}

}

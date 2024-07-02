package org.openjfx.vintagecarfx.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.openjfx.vintagecarfx.enums.Marke;
import org.openjfx.vintagecarfx.ersatzteilanbieter.Ersatzteil;
import org.openjfx.vintagecarfx.ersatzteilanbieter.Ersatzteilanbieter;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
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
        @FXML
        private TableColumn<Ersatzteil, Float> ersatzteilPreisColumn;
        @FXML
        private TableColumn<Ersatzteil, Void> reservierenColumn;


    public ErsatzteilanbieterController(Ersatzteilanbieter ersatzteilanbieter, Stage stage) {
        this.ersatzteilanbieter = ersatzteilanbieter;
        this.stage = stage;
    }

    @FXML
    public void initialize() {
            ersatzteilIDColumn.setCellValueFactory(new PropertyValueFactory<>("Ersatzteil_ID"));
            ersatzteilNameColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));
            ersatzteilGewichtColumn.setCellValueFactory(new PropertyValueFactory<>("Gewicht"));
            ersatzteilMaterialColumn.setCellValueFactory(new PropertyValueFactory<>("Material"));
            ersatzteilGarantieColumn.setCellValueFactory(new PropertyValueFactory<>("Garantie"));
            ersatzteilZustandColumn.setCellValueFactory(new PropertyValueFactory<>("Zustand"));
            ersatzteilHerstellerColumn.setCellValueFactory(new PropertyValueFactory<>("Hersteller"));
            ersatzteilPreisColumn.setCellValueFactory(new PropertyValueFactory<>("Preis"));




            reservierenColumn.setCellFactory(param -> new TableCell<>() {
                private final Button reservierenButton = new Button("Reservieren");

                @Override
                protected void updateItem(Void item, boolean empty) {
                    super.updateItem(item, empty);
                    if (empty) {
                        setGraphic(null);
                    } else {
                        Ersatzteil ersatzteil = getTableView().getItems().get(getIndex());
                        reservierenButton.setOnAction(event -> {
                            // Hier können Sie den Code hinzufügen, der ausgeführt wird, wenn der Reservieren-Knopf gedrückt wird.
                            // Zum Beispiel:
                            System.out.println("Ersatzteil " + ersatzteil.getErsatzteil_ID() + " wurde reserviert.");
                        });
                        setGraphic(reservierenButton);
                    }
                }
            });

            ersatzteilTable.getItems().setAll(ersatzteilanbieter.getErsatzteile(Marke.AUDI));
    }

    public void showErsatzteilDetails(Ersatzteil ersatzteil) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/openjfx/vintagecarfx/ersatzteil-details.fxml"));
            VBox detailsBox = fxmlLoader.load();

            detailsBox.getChildren().add(new Label("Preis: " + ersatzteil.getPreis()));
            detailsBox.getChildren().add(new Label("Hersteller: " + ersatzteil.getHersteller()));
            detailsBox.getChildren().add(new Label("Garantie: " + ersatzteil.getGarantie()));
            // Fügen Sie hier weitere Attribute hinzu...

            Scene scene = new Scene(detailsBox);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //public String zeigInfos() {return ersatzteilanbieter.zeigInfos();}

    //public boolean isInfosVollstaendig() {return ersatzteilanbieter.isInfosVollstaendig();}

}

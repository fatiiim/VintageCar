package org.openjfx.vintagecarfx.controller;

import javafx.stage.Stage;
import org.openjfx.vintagecarfx.lagerhalter.Lagerhalter;

public class LagerhalterController {
    private final Lagerhalter lagerhalter;
    private final Stage stage;

    public LagerhalterController(Lagerhalter lagerhalter, Stage stage) {
        this.lagerhalter = lagerhalter;
        this.stage = stage;
    }

}

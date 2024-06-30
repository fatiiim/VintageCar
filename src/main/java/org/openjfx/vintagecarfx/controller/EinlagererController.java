package org.openjfx.vintagecarfx.controller;

import javafx.stage.Stage;
import org.openjfx.vintagecarfx.einlagerer.Einlagerer;

public class EinlagererController {
    private final Einlagerer einlagerer;
    private final Stage stage;

    public EinlagererController(Einlagerer einlagerer, Stage stage) {
        this.einlagerer = einlagerer;
        this.stage = stage;
    }


}

package controller;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;
import model.Event;

import java.util.ArrayList;

public class EventListController {
    @FXML private ListView<String> eventListView;
    private final ArrayList<Event> events = new ArrayList<>();

    public void initialize() {
        // Placeholder for list loading
        eventListView.getItems().add("Sample Event on App Load");
    }
}
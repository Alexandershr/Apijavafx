package com.example.apiapp;

import com.example.apiapp.view.AppView;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * The Main class serves as the entry point for the JavaFX application.
 * It extends the Application class, which is required for JavaFX applications.
 */
public class Main extends Application {

    /**
     * The start method is the main entry point for the JavaFX application.
     * It sets up the primary stage and initializes the application's UI.
     *
     * @param primaryStage the main window of the JavaFX application
     */
    @Override
    public void start(Stage primaryStage) {
        // Create an instance of AppView, which manages the UI components
        AppView appView = new AppView();

        // Start the AppView, passing in the primary stage to set up the UI
        appView.start(primaryStage);
    }

    /**
     * The main method serves as the standard entry point for the Java application.
     * It launches the JavaFX application by calling the launch method,
     * which internally calls the start method.
     *
     * @param args command-line arguments (not used in this application)
     */
    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }
}


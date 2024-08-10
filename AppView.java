package com.example.apiapp.view;

import com.example.apiapp.controller.MainController;
import com.example.apiapp.model.Movie;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * The AppView class is responsible for creating and displaying the JavaFX user interface
 * for the Movie Info App. It connects the view with the controller to handle user interactions.
 */
public class AppView {

    // Controller instance to manage the application's business logic
    private final MainController controller = new MainController();

    // ListView to display the list of movies retrieved from the API
    private ListView<String> movieListView;

    /**
     * The start method is the entry point for setting up the primary stage (window)
     * and initializing the UI components.
     *
     * @param primaryStage the main window of the JavaFX application
     */
    public void start(Stage primaryStage) {
        // Button to trigger the fetching of movie information
        Button getInfoButton = new Button("Get Movie Info");

        // Initializing the ListView to display movie titles and release years
        movieListView = new ListView<>();

        // Setting up the event handler for the button click
        // When clicked, it will load the movies into the ListView
        getInfoButton.setOnAction(e -> loadMovies());

        // VBox layout with spacing of 10 pixels between elements
        VBox root = new VBox(10, getInfoButton, movieListView);

        // Creating a Scene with the root VBox, specifying width and height
        Scene scene = new Scene(root, 400, 300);

        // Adding a stylesheet for additional UI styling
        scene.getStylesheets().add("styles.css");

        // Setting the scene, title, and application icon for the primary stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Movie Info App");
        primaryStage.getIcons().add(new javafx.scene.image.Image("application-icon.png"));

        // Displaying the stage
        primaryStage.show();
    }

    /**
     * The loadMovies method fetches movies from the controller and updates the ListView.
     * It clears any existing items in the ListView before adding new movie data.
     */
    private void loadMovies() {
        // Fetching movies using the controller
        Movie[] movies = controller.fetchMovies();

        // Clearing the ListView to remove old movie entries
        movieListView.getItems().clear();

        // Iterating over the fetched movies and adding each to the ListView
        for (Movie movie : movies) {
            movieListView.getItems().add(movie.getTitle() + " (" + movie.getYear() + ")");
        }
    }
}

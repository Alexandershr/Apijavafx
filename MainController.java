package com.example.apiapp.controller;

import com.example.apiapp.model.Movie;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * The MainController class handles the logic for interacting with the external API.
 * It is responsible for fetching movie data and converting it into Movie objects.
 */
public class MainController {

    // The API URL for fetching movie data. Replace with a valid API key for actual use.
    private static final String API_URL = "live_RoSEYglv2rWRzhQHXQV9dXU3j0pTn532WADs4xaFERNwynRnQj8KpEqvewCockmm";

    /**
     * Fetches movie data from the API and returns an array of Movie objects.
     *
     * @return an array of Movie objects parsed from the API response;
     *         returns an empty array if an error occurs.
     */
    public Movie[] fetchMovies() {
        try {
            // Create a URL object from the API URL
            URL url = new URL(API_URL);

            // Open a connection to the URL and cast it to an HttpURLConnection
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // Set the request method to GET, as we are retrieving data
            conn.setRequestMethod("GET");

            // Create an InputStreamReader to read the API response
            InputStreamReader reader = new InputStreamReader(conn.getInputStream());

            // Parse the JSON response using JsonParser to get a JsonObject
            JsonObject jsonResponse = JsonParser.parseReader(reader).getAsJsonObject();

            // Use Gson to convert the JSON array of movies into an array of Movie objects
            Movie[] movies = new Gson().fromJson(jsonResponse.get("Search"), Movie[].class);

            // Return the array of Movie objects
            return movies;
        } catch (Exception e) {
            // Print the stack trace if an error occurs during the API call
            e.printStackTrace();

            // Return an empty array of movies in case of an error
            return new Movie[0];
        }
    }
}

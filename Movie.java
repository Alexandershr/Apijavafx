package com.example.apiapp.model;

import com.google.gson.annotations.SerializedName;

/**
 * The Movie class represents a movie object with its basic attributes.
 * It is used to map JSON data received from an API into a Java object.
 */
public class Movie {

    /**
     * The title of the movie.
     * This field is automatically mapped to the JSON field "title" when deserializing.
     */
    private String title;

    /**
     * The year the movie was released.
     * The @SerializedName annotation indicates that this field is mapped to the "Year" field in the JSON data.
     */
    @SerializedName("Year")
    private String year;

    /**
     * The unique IMDb identifier for the movie.
     * This field is mapped to the "imdbID" field in the JSON data.
     */
    @SerializedName("imdbID")
    private String imdbID;

    /**
     * Retrieves the title of the movie.
     *
     * @return the movie title as a String
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the movie.
     *
     * @param title the title to set for the movie
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retrieves the year the movie was released.
     *
     * @return the release year as a String
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the release year of the movie.
     *
     * @param year the year to set for the movie
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * Retrieves the IMDb ID of the movie.
     *
     * @return the IMDb ID as a String
     */
    public String getImdbID() {
        return imdbID;
    }

    /**
     * Sets the IMDb ID of the movie.
     *
     * @param imdbID the IMDb ID to set for the movie
     */
    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }
}

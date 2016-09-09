package model;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by mario on 09-09-16.
 */
@Entity
@Table(name = "film")
@NamedQuery(name="Film.findAll", query="SELECT a FROM Film a")
public class Film implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="film_id", unique=true, nullable=false)
    private int filmId;

    @Column(name="title", nullable = false)
    private String title;

    @Column(name="description", length=500)
    private String description;

    @Column(name="release_year")
    private int release_year;

    @Column(name="language_id", nullable=false)
    private int language_id;

    @Column(name="original_language_id")
    private int original_language_id;

    @Column(name="rental_duration", nullable=false)
    private int rental_duration;

    @Column(name="rental_rate", nullable=false)
    private double rental_rate;

    @Column(name="length")
    private int length;

    @Column(name="replacement_cost", nullable=false)
    private double replacement_cost;

    @Column(name="rating")
    private String rating;

    @Column(name="special_features")
    private String special_features;

    @Column(name="last_update", nullable=false)
    private Timestamp lastUpdate;

    public Film(){
    }


    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public int getOriginal_language_id() {
        return original_language_id;
    }

    public void setOriginal_language_id(int original_language_id) {
        this.original_language_id = original_language_id;
    }

    public int getRental_duration() {
        return rental_duration;
    }

    public void setRental_duration(int rental_duration) {
        this.rental_duration = rental_duration;
    }

    public double getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(double rental_rate) {
        this.rental_rate = rental_rate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(double replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSpecial_features() {
        return special_features;
    }

    public void setSpecial_features(String special_features) {
        this.special_features = special_features;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}

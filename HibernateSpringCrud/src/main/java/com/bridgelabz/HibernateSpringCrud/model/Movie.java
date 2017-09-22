package com.bridgelabz.HibernateSpringCrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="movies")
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="mygen")
	@GenericGenerator(name="mygen", strategy="native")
	private long movieId;

	@Column(name="title")
	private String title;

	@Column(name="release_year")
	private long releaseYear;

	@Column(name="director")
	private String director;

	public long getMovieId() {
		return movieId;
	}

	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(long releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

}

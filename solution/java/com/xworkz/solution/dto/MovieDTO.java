package com.xworkz.solution.dto;

public class MovieDTO {
	private String name;
	private Double rating;
	private Double duration;
	private String genre;

	public MovieDTO(String name, Double rating, Double duration, String genre) {
		this.name = name;
		this.rating = rating;
		this.duration = duration;
		this.genre = genre;

	}

	

	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", rating=" + rating + ", duration=" + duration + ", genre=" + genre + "]";
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}



	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}



	@Override
	public boolean equals(Object obj) {
		System.out.println("called equals method");
		return super.equals(obj);
	}

}

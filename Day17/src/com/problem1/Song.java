package com.problem1;

public class Song {

	private String movieName;
	private String songName;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
		result = prime * result + ((songName == null) ? 0 : songName.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		if (songName == null) {
			if (other.songName != null)
				return false;
		} else if (!songName.equals(other.songName))
			return false;
		return true;
	}

	public Song(String movieName, String songName) {
		super();
		this.movieName = movieName;
		this.songName = songName;
	}
	
	public void play() {
		
		System.out.println(songName+"of"+movieName+"is playing...!");
		
	}
	
}

package com.problem1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class PlayList {

	public List<Song> songs=new ArrayList<>();
	
	public void addSong(Song song) {
		
		songs.add(song);
		int listsize=songs.size();
		LinkedHashSet<Song> Ulist=new LinkedHashSet<>(songs);
		int UlistS=Ulist.size();
		if(listsize==UlistS) {
		System.out.println("Song added to the playlist successfully.");
		}
		else {
			System.out.println("Song is already added in the playlist");
		}
		songs.removeAll(songs);
		for (Song U:Ulist) {
			songs.add(U);
		}
	}
	
}

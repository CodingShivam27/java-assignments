package com.problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		ArrayList<Song> song=new ArrayList<>();
		int count=1;
		while (true) {
			System.out.println("Enter Song Details :-"+count++);
			System.out.println("Enter Movie Name ");
			String movie=input.next();
			System.out.println("Enter Song Name ");
			String songName=input.next();
			Song S=new Song(movie, songName);
			song.add(S);
			
			System.out.println("Do you want to add more (y/n)");
			String c=input.next();
			
			if(c.equalsIgnoreCase("n")) {
				break;
			}
			
		}
		
		PlayList play=new PlayList();
		
		for (Song s:song) {
			play.addSong(s);
		}
		
		List<Song> list=play.songs;
		for(Song s:list) {
			s.play();
		}
		
	}

}

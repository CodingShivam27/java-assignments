package com.masai;

public class VowelAndConsonant {
	
	void vowel(String vowel) {
		System.out.println(vowel);
	}
	
	void consonant(String consonant) {
		System.out.println(consonant);
	}
	
	public static void main(String[] arg) {
		
		VowelAndConsonant fun= new VowelAndConsonant();
		
		String word="Masai";
		
		String vowel="";
		String consonant="";
		
		for(int y=0;y<word.length();y++) {
			
			if(word.charAt(y)=='a'||word.charAt(y)=='e'||word.charAt(y)=='i'||word.charAt(y)=='o'||word.charAt(y)=='u'||word.charAt(y)=='E'||word.charAt(y)=='E'||word.charAt(y)=='I'||word.charAt(y)=='O'||word.charAt(y)=='U') {
				vowel+=word.charAt(y);
			}
			else{
				consonant+=word.charAt(y);
			}
			
		}
		
		
		
		fun.vowel(vowel);
		fun.vowel(consonant);
		//System.out.println(vowel);
		//if()
		
		
		
		
		
		
		//fun.vowel();
	}
	
}

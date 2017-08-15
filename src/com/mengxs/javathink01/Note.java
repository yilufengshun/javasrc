package com.mengxs.javathink01;

public class Note {
			//note音符被乐器演奏
		private String noteName;
		private Note(String noteName){
			this.noteName=noteName;
		}
		public String toString(){
			return noteName;
		}
		public static final Note
			MINDDLE_C=new Note("Middle C"),
			C_SHARP = new Note("C Sharp"),
			B_FLAT=new Note("B Flat");
}

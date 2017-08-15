package com.mengxs.javathink01;


//import com.mengxs.demo09.Test;

class Instrument{
	void play(Note n){
		System.out.println("Instrument.play() "+n);
	}
	String what(){return "Instrument";}
	void adjust(){};
}
class Wind extends Instrument{
	void play(Note n){
		System.out.println("Wind.play() "+n);
	}
	String what(){return "Wind";}
	void adjust(){};
}
class Percussion extends Instrument{
	void play(Note n){
		System.out.println("Percussion.play() "+n);
	}
	String what(){return "Percussion";}
	void adjust(){};
}
class Stringed extends Instrument{
	void play(Note n){
		System.out.println("Stringed.play() "+n);
	}
	String what(){return "Stringed";}
	void adjust(){};
}
class Woodwind extends Wind{
	void play(Note n){
		System.out.println("Woodwind.play() "+n);
	}
	String what(){return "Woodwind";}
	void adjust(){};
}
class Brass extends Wind{
	void play(Note n){
		System.out.println("Brass.play() "+n);
	}
	String what(){return "Brass";}
	void adjust(){};
}
public class Music3 {
		//private static Test monitor = new Test();
		public static void tune(Instrument i){
			i.play(Note.MINDDLE_C);
		}
		public static void tuneAll(Instrument[] e){
			for (int i=0;i<e.length;i++){
				tune(e[i]);
				}
			}
	public static void main(String[] args){
			Instrument[] orchestra={
					new Wind(),
					new Percussion(),
					new Stringed(),
					new Brass(),
					new Woodwind()
			};
			tuneAll(orchestra);
		
		}
}

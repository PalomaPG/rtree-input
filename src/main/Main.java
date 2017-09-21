package main;
import genrect.SynthGen;

public class Main {

		public static void main(String[] args) {
			
			synthgenRutine();
		}
		
		public static void synthgenRutine() {
			System.err.println("Synthetic data generation");
			SynthGen sg = new SynthGen(2);
			sg.writeFile();
		}
}

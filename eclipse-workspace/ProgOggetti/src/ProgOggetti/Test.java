package ProgOggetti;

import java.io.IOException;

public class Test {
	public static void main(String[] args) {
			String percorso = "/Users/denisbernovschi/eclipse-workspace/ProgOggetti/src/ProgOggetti/file.csv";
			String percorso2 = "/Users/denisbernovschi/eclipse-workspace/ProgOggetti/src/ProgOggetti/file2.xml";
			Volontario [] volontari = new Volontario [12];
			Parser p = new Parser(percorso,percorso2,volontari);
			System.out.println("apertura file");
			try {
				p.aperturaFile();
			}catch(IOException e) {
				System.out.println("eccezzione : "+e );
			}
			System.out.println(volontari[2].toString());
			try {
				p.scritturaXML();
			} catch (IOException e) {
				System.out.println("IOException : "+e);
				e.printStackTrace();
			}
	}
}

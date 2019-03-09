package ProgOggetti;

import java.io.*;
//import java.util.Scanner; 

public class Parser {
	private String percorso;
	private String percorso2;
	private Volontario [] volontari = new Volontario [12]; 

	
	BufferedReader fileReader = null;
	BufferedWriter filewriter = null; 
	
	File file = null; 
	File filew = null;
	
	private String line ="";

	public Parser (String percorso, String percorso2, Volontario [] volontari) {
		this.percorso = percorso;
		this.percorso2 = percorso2;
		this.volontari = volontari ; 
	}

	public String getPercorso() {
		return percorso;
	}
	public void setPercorso(String percorso) {
		this.percorso = percorso;
	}
	public String getPercorso2() {
		return percorso2;
	}

	public void setPercorso2(String percorso2) {
		this.percorso2 = percorso2;
	}
	public Volontario[] getVolontari() {
		return volontari;
	}

	public void setVolontari(Volontario[] volontari) {
		this.volontari = volontari;
	}
	public void setVolontario(Volontario v, int posizione) {
		this.volontari[posizione]= v; 
	}
	public Volontario recuperaCampo(String s) {	
		Volontario v = null; 
		//uso la classe String in fattispecie uso la funzione split della classe String 
		String [] campi = s.split(";");
		v = new Volontario(Integer.parseInt(campi[0]),campi[1],campi[2],campi[3],campi[4],
				campi[5],Integer.parseInt(campi[6]),campi[7],campi[8],campi[9],campi[10],campi[11], campi[12], campi[13]);
		return v;
	}
	public void aperturaFile() throws IOException {
		file = new File (this.getPercorso());
		fileReader = new BufferedReader(new FileReader(file));
		try {
			for(int i = 0; i<13 && ((line = fileReader.readLine()) != null) ; i++){
				this.volontari[i] = recuperaCampo(line);
				this.setVolontario(volontari[i], i);
			}
		}catch(IOException e) {
			System.out.println("IOException : "+e);
		}
	}
	public void scritturaXML() throws IOException{
		filew = new File (this.getPercorso2());
		filewriter = new BufferedWriter(new FileWriter(filew,true));
		try {
			System.out.println(volontari[2].toXML());
			filewriter.write(volontari[2].toXML());
			filewriter.flush();
			filewriter.close();
		}catch(IOException e) {
			System.out.println("");
		}
	}
	
}



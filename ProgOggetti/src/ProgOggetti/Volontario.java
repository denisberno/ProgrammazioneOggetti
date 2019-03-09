package ProgOggetti;

public class Volontario{
	private int ID_Volontario;
	private String nome;
	private String cognome;
	private String dataNascita;
	private String CF; 
	private String via; 
	private int nCivico; 
	private String citta; 
	private String cap; 
	private String provincia;
	private String idComitato; 
	private String email; 
	private String breveTermine;
	private String lungoTermine;
	
	
	public Volontario(int iD_Volontario, String nome, String cognome, String dataNascita, String cF, String via,
			int nCivico, String citta, String cap, String provincia, String idComitato, String email,
			String breveTermine, String lungoTermine) {
		ID_Volontario = iD_Volontario;
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.CF = cF;
		this.via = via;
		this.nCivico = nCivico;
		this.citta = citta;
		this.cap = cap;
		this.provincia = provincia;
		this.idComitato = idComitato;
		this.email = email;
		this.breveTermine = breveTermine;
		this.lungoTermine = lungoTermine;
	}
	
	
	
	public Volontario( Volontario v) {
		this.ID_Volontario = v.getID_Volontario();
		this.nome = v.getNome();
		this.cognome = v.getCognome();
		this.dataNascita = v.getDataNascita();
		this.CF = v.getCF();
		this.via = v.getVia();
		this.nCivico = v.getnCivico();
		this.citta = v.getCitta();
		this.cap = v.getCap();
		this.provincia = v.getProvincia();
		this.idComitato = v.getIdComitato();
		this.email = v.getEmail();
		this.breveTermine = v.getBreveTermine();
		this.lungoTermine = v.getLungoTermine();
	}



	public int getID_Volontario() {
		return ID_Volontario;
	}
	public void setID_Volontario(int iD_Volontario) {
		ID_Volontario = iD_Volontario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}
	public String getCF() {
		return CF;
	}
	public void setCF(String cF) {
		CF = cF;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public int getnCivico() {
		return nCivico;
	}
	public void setnCivico(int nCivico) {
		this.nCivico = nCivico;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public String getCap() {
		return cap;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getIdComitato() {
		return idComitato;
	}
	public void setIdComitato(String idComitato) {
		this.idComitato = idComitato;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBreveTermine() {
		return breveTermine;
	}
	public void setBreveTermine(String breveTermine) {
		this.breveTermine = breveTermine;
	}
	public String getLungoTermine() {
		return lungoTermine;
	}
	public void setLungoTermine(String lungoTermine) {
		this.lungoTermine = lungoTermine;
	}

	
	public String toString() {
		return "Volontario [ID_Volontario=" + ID_Volontario + ", nome=" + nome + ", cognome=" + cognome
				+ ", dataNascita=" + dataNascita + ", CF=" + CF + ", via=" + via + ", nCivico=" + nCivico + ", citta="
				+ citta + ", cap=" + cap + ", provincia=" + provincia + ", idComitato=" + idComitato + ", email="
				+ email + ", breveTermine=" + breveTermine + ", lungoTermine=" + lungoTermine + "]";
	}
	
	public String toXML() {
		String s=null; 
		s="<Volontario>"+"\n";
			s+="<nome>"+this.nome+"</nome>"+"\n";
			s+="<cognome>"+this.cognome+"</cognome>"+"\n";
			s+="<dataNascita>"+this.dataNascita+"</dataNascita>"+"\n";
			s+="<CF>"+this.CF+"</CF>"+"\n";
			s+="<via>"+this.via+"</via>"+"\n";
			//mancano alcuni campi
		s+="</Volontario>"+"\n";
		return s;
	}
	
	public static void main(String[] args) {
		Volontario v = new Volontario (12, "Mario", "Rossi", "27-01-2019", "MRNRSS", "Via Don Antonio",
				57, "Fano", "11143", "PU", "1", "Mario@Rossi.it","SI","NO");
		System.out.println(v.toString());
		System.out.println("XML : "+v.toXML());
}


}

package sistema.modelos;

public class Campeonato {

	private int codigoCampeonato; 
	private int anoCampeonato;
	private String nomeCampeonato;
	private int dataInicioCampeonato;
	private int dataFimCampeonato;
	
	public int getCodigoCampeonato() {
		return codigoCampeonato;
	}
	public void setCodigoCampeonato(int codigoCampeonato) {
		this.codigoCampeonato = codigoCampeonato;
	}
	public int getAnoCampeonato() {
		return anoCampeonato;
	}
	public void setAnoCampeonato(int anoCampeonato) {
		this.anoCampeonato = anoCampeonato;
	}
	public String getNomeCampeonato() {
		return nomeCampeonato;
	}
	public void setNomeCampeonato(String nomeCampeonato) {
		this.nomeCampeonato = nomeCampeonato;
	}
	public int getDataInicioCampeonato() {
		return dataInicioCampeonato;
	}
	public void setDataInicioCampeonato(int dataInicioCampeonato) {
		this.dataInicioCampeonato = dataInicioCampeonato;
	}
	public int getDataFimCampeonato() {
		return dataFimCampeonato;
	}
	public void setDataFimCampeonato(int dataFimCampeonato) {
		this.dataFimCampeonato = dataFimCampeonato;
	}
}

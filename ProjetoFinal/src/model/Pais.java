package model;

public class Pais {
	private int 	id;
	private String 	nome;
	private int 	populacao;
	private double 	area;
	
		// Constructor
	public Pais() {
		super();
	}
	public Pais(int id, String nome, int populacao, double area) {
		setId(id);
		setNome(nome);
		setPopulacao(populacao);
		setArea(area);
	}
	
		// Getters And Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPopulacao() {
		return populacao;
	}
	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		if (area != other.area)
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (populacao != other.populacao)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
}

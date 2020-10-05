package semaforo;

public class Filosofo extends Thread {
	private int numero;
	private String nome;
	private int estado;
	Filosofo[] filosofos = new Filosofo[5];

	public Filosofo(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.estado = 0;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public void run() {
		FilosofoSemaforo filosofoSemaforo = new FilosofoSemaforo(this.filosofos);
		while (true) {
			filosofoSemaforo.pegarGarfo(this.numero);
			filosofoSemaforo.devolverGarfo(this.numero);
		}
	}

	public void setFilosofos(Filosofo[] filosofos) {
		this.filosofos = filosofos;
	}
}

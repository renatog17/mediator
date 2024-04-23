package mediator;

public class ClienteConcreto implements Cliente {

	private Mediador mediador;

	public ClienteConcreto(Mediador mediador) {
		super();
		this.mediador = mediador;
	}

	@Override
	public void enviarMensagem(String mensagem) {
		this.mediador.enviarMensagem(mensagem, this);
		
	}
	@Override
	public void receberMensagem(String mensagem) {
		System.out.println("Recebendo mensagem: "+mensagem);

	}


}

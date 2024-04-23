package mediator;

public class Main {

	public static void main(String[] args) {
		MediadorConcreto mediador = new MediadorConcreto();
		Cliente joao = new ClienteConcreto(mediador);
		Cliente renato = new ClienteConcreto(mediador);
		Cliente ana = new ClienteConcreto(mediador);
		
		mediador.adicionarClientes(ana);
		mediador.adicionarClientes(joao);
		mediador.adicionarClientes(renato);
		
		ana.enviarMensagem("Ana falando");
		renato.enviarMensagem("Renato falando");
		joao.enviarMensagem("Joao falando");
	}

}

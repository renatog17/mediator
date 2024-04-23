package mediator;

import java.util.ArrayList;
import java.util.List;

public class MediadorConcreto implements Mediador{

	private List<Cliente> clientes;
	
	
	public MediadorConcreto() {
		this.clientes = new ArrayList<Cliente>();
	}

	public void adicionarClientes(Cliente cliente) {
		this.clientes.add(cliente);
	}

	@Override
	public void enviarMensagem(String mensagem, Cliente remetente) {
		for (Cliente cliente : clientes) {
			if(cliente != remetente) {
				cliente.receberMensagem(mensagem);
			}
		}
		
	}

}

package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {

	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;

	public void procurarPorNumero(int numero) {

	}

	public void listarTodas() {
		for (var conta : listaContas) {
			conta.visualizar();
		}
		
	}

	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("\nA Conta Numero: " + conta.getNumero() + "Foi criada com sucesso!");
	}

	public void atualizar(Conta conta) {

	}

	public void deletar(int numero) {

	}

	public void sacar(int numero, float valor) {

	}

	public void depositar(int numero, float valor) {

	}

	public void transferir(int numeroOrigem, int numeroDestino, float valor) {

	}
	public int gerarNumero() {
		return ++ numero;
	}
}

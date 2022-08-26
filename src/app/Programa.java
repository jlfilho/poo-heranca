package app;

import entidades.Conta;
import entidades.ContaEmpresarial;

public class Programa {

	public static void main(String[] args) {
		Conta contaComum = new Conta(1005,"Bruno",1000.00);
		
		ContaEmpresarial contaEmpresarial = new ContaEmpresarial(1010,"Alex",1000.00, 500.00);
		
		System.out.println(contaComum);
		System.out.println(contaEmpresarial);

	}

}

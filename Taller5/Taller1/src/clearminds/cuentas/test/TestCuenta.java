package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		
		Cuenta cuenta1 = new Cuenta("03476");
		cuenta1.setSaldo(675);
		Cuenta cuenta2 = new Cuenta("03476", "C", 98);
		Cuenta cuenta3 = new Cuenta("03476");
		cuenta3.setTipo("C");
		Cuenta cuenta4 = new Cuenta("023394");
		cuenta4.setTipo("B");
		cuenta4.setSaldo(502.3);
		Cuenta cuenta5 = new Cuenta("036475");
		cuenta5.setSaldo(630.61);
		Cuenta cuenta6 = new Cuenta("0364758", "C", 574);
		Cuenta cuenta1M = new Cuenta("045245");
		cuenta1M.setSaldo(624.86);
		Cuenta cuenta2M = new Cuenta("037659", "B", 98);
		Cuenta cuenta3M  = new Cuenta("07463");
		cuenta3.setTipo("D");
		
		System.out.println("-------- VALORES INICIALES ---------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		cuenta4.imprimir();
		cuenta5.imprimir();
		cuenta6.imprimir();
		
		System.out.println("-------- VALORES INICIALES(MODIFICADOS) ---------");
		
		cuenta1M.imprimir();
		cuenta2M.imprimir();
		cuenta3M.imprimir();
		
		System.out.println("-------- VALORES INICIALES(ESTILO PROPIO) ---------");
		cuenta1.imprimirConMiEstilo();
		cuenta2.imprimirConMiEstilo();
		cuenta3.imprimirConMiEstilo();
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
		cuenta1M.imprimirConMiEstilo();
		cuenta2M.imprimirConMiEstilo();
		cuenta3M.imprimirConMiEstilo();
	}

}

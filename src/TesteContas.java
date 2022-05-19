
public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		
		ContaPoupanca cp = new ContaPoupanca(111, 222);
		
		cc.deposita(100.0);
		cp.deposita(200.0);
		
		cc.transfere(110, cp);
		
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		
		cc.saca(20.0);
		System.out.println(cc.getSaldo());
		

	}

}

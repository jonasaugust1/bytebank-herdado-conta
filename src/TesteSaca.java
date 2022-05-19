
public class TesteSaca {

	public static void main(String[] args) {

		Conta cc = new ContaCorrente(123, 321);
		cc.deposita(200.0);
		
		try {
			cc.saca(210.0);
		} catch(SaldoInsuficienteException e) {
			System.out.println("Exception " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println(cc.getSaldo());
	}
	


}

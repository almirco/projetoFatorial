public class Fatorial{

	//Versão Iterativa do calculo do fatorial. Incluindo o teste de N! igual a zero.
	public static int calcularFatorial(int n) throws IllegalArgumentException{
		if(n < 0) {
			throw new IllegalArgumentException("Não existe fatorial para números negativos");
		}

		int resultado = 1;
		if(n != 0) {
			for (int i =2; i <=n; i++) {
				resultado*=i;			
			}
		}
		return resultado;
		
	}
}
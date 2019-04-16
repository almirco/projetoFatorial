public class FatorialRecursivo{
	public static int calculaFatorialRecursivo(int n) throws IllegalArgumentException {
		if(n==0)
			return 1;
		return n * calculaFatorialRecursivo(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(calculaFatorialRecursivo(5));		
	}

}
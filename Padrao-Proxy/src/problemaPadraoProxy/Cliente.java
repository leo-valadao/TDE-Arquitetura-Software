package problemaPadraoProxy;

public class Cliente {
	public static void main(String[] args) throws Exception {

		// Método SEM Proxy
		System.out.println("\n\n\n\n\nExemplo SEM Proxy");

		// Instância o ServidorVideo
		ServidorVideo vp = new ServidorVideo();

		for (int i = 1; i <= 5; i++) {
			vp.carregarVideo(1);
		}
	}
}

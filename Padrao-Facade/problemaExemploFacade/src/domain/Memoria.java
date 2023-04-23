package domain;

public class Memoria {
    public void adicionarMemoria() {
        System.out.println("Adiciona 2.0 GB de memória!");
    }
    public void carregar(int position, String info) {
        System.out.println("carrega dados na memória");
     }
     public void liberar(int position, String info) {
        System.out.println("libera dados da memória");
     }
}

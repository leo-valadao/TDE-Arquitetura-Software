package domain;
public class Principal {
    public static void main(String[] args) throws Exception {
        
        Cpu cpu = new Cpu();
        cpu.iniciar();
        cpu.executar();
        cpu.carregar();
        cpu.liberar();

        Acessorios acessorios = new Acessorios();
        acessorios.adicionarMouse();
        acessorios.adicionarTeclado();
        acessorios.adicionarMonitor();

        HardDrive hardDrive = new HardDrive();
        hardDrive.ler(15, 8);
        hardDrive.escrever(4, "sistema em operação");
        
        Memoria memoria = new Memoria();
        memoria.adicionarMemoria();
        memoria.carregar(6,"Dados");
        memoria.liberar(40, "Dados");

        SistemaOperacional sistemaOperacional = new SistemaOperacional();
        sistemaOperacional.inicializarSistemaOperacional();
    }
}

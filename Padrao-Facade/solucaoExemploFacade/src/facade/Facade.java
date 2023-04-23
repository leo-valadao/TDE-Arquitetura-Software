package facade;

import domain.Acessorios;
import domain.Cpu;
import domain.HardDrive;
import domain.Memoria;
import domain.SistemaOperacional;

public class Facade {
    private Cpu cpu;
    private Acessorios acessorios;
    private HardDrive hardDrive;
    private Memoria memoria;
    private SistemaOperacional sistemaOperacional;
    
    public Facade() {
        this.cpu = new Cpu();
        this.acessorios = new Acessorios();
        this.hardDrive = new HardDrive();
        this.memoria = new Memoria();
        this.sistemaOperacional = new SistemaOperacional();
    }
    
    public void ligarComputador() {

        System.out.println("Ligando computador\n");
        cpu.iniciar();
        cpu.executar();
        cpu.carregar();
        cpu.liberar();

        acessorios.adicionarMouse();
        acessorios.adicionarTeclado();
        acessorios.adicionarMonitor();

        hardDrive.ler(15, 8);
        hardDrive.escrever(4, "sistema em operação");
        
        memoria.adicionarMemoria();
        memoria.carregar(6,"Dados");
        memoria.liberar(40, "Dados");

        sistemaOperacional.inicializarSistemaOperacional();

        System.out.println("Computador ligado");
    }
    
}

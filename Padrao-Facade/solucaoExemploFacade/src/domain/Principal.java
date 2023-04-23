package domain;

import facade.Facade;

public class Principal {
    public static void main(String[] args) throws Exception {
        
        Facade facade = new Facade();
        facade.ligarComputador();
    }
}

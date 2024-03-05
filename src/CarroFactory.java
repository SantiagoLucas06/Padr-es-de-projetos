
interface Carro {
    void exibirInfo();
}

interface Motor {
    void tipo();
}

interface Roda {
    void tamanho();
}
interface CarroFactory {
    Carro criarCarro();
    Motor criarMotor();
    Roda criarRoda();
}
class CarroEsportivo implements Carro {
    @Override
    public void exibirInfo() {
        System.out.println("Carro Esportivo");
    }
}

class MotorV8 implements Motor {
    @Override
    public void tipo() {
        System.out.println("Motor V8");
    }
}

class RodaAro18 implements Roda {
    @Override
    public void tamanho() {
        System.out.println("Roda Aro 18");
    }
}

class FabricaCarroEsportivo implements CarroFactory {
    @Override
    public Carro criarCarro() {
        return new CarroEsportivo();
    }

    @Override
    public Motor criarMotor() {
        return new MotorV8();
    }

    @Override
    public Roda criarRoda() {
        return new RodaAro18();
    }
}
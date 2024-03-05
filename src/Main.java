public class Main {
        public static void main(String[] args) {
            CarroFactory fabrica = new FabricaCarroEsportivo();
            Carro carro = fabrica.criarCarro();
            Motor motor = fabrica.criarMotor();
            Roda roda = fabrica.criarRoda();

            carro.exibirInfo();
            motor.tipo();
            roda.tamanho();
        }
}
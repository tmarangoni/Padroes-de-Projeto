public class Cliente {
    public static void main(String[] args) {
        FabricaDeCarro fabrica = FabricaDeCarro.getInstancia();
        System.out.println(fabrica.criarCarroFiat());
        System.out.println(fabrica.criarCarroFiat());
        System.out.println(fabrica.criarCarroFiat());
        System.out.println(fabrica.criarCarroFord());
        System.out.println(fabrica.criarCarroVolks());
        System.out.println(fabrica.gerarRelatorio());

        fabrica = FabricaDeCarro.getInstancia();
        System.out.println(fabrica.gerarRelatorio());

    }
}

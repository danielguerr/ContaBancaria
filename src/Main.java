import classes.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();

        conta1.abrirConta("Daniel Guerra", "CC");
        System.out.println(conta1.getInformacoesConta());
        conta1.depositar(5000);
        System.out.println(conta1.getInformacoesConta());
        conta1.sacar(2000);
        System.out.println(conta1.getInformacoesConta());
        conta1.pagarMensalidade();
        System.out.println(conta1.getInformacoesConta());
        conta1.fecharConta();

        ContaBancaria conta2 = new ContaBancaria();
        conta2.abrirConta("Cláudio", "CC");
        System.out.println(conta2.getInformacoesConta());
        conta2.depositar(5000);
        System.out.println(conta2.getInformacoesConta());
        conta2.sacar(5048);
        System.out.println(conta2.getInformacoesConta());
        conta2.pagarMensalidade();
        System.out.println(conta2.getInformacoesConta());
        conta2.fecharConta();

    }

}

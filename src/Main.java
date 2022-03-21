import classes.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaCorrente = new ContaBancaria();

        contaCorrente.abrirConta("Daniel Guerra", "Cp");
        System.out.println(contaCorrente.getInformacoesConta());
    }

}

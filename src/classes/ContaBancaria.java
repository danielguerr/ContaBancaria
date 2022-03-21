package classes;

public class ContaBancaria {
    public String numConta;
    protected String tipoConta;
    private String donoConta;
    private double saldoConta;
    private boolean statusConta;

    // CONSTRUCTOR
    public ContaBancaria() {
        saldoConta = 0;
        statusConta = false;
    }

    // SETTERS
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }

    // GETTERS
    public String getNumConta() {
        return numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public String getDonoConta() {
        return donoConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public boolean getStatusConta() {
        return statusConta;
    }

    public String getInformacoesConta() {
        return "Titular: " + donoConta + "\n" + "Número da conta: " + numConta + "\n" + "Saldo: " + saldoConta + "\n";
    }

    // METHODS

    public void abrirConta(String donoConta, String tipoConta) {
        setDonoConta(donoConta);
        setTipoConta(tipoConta);
        if (getTipoConta().equalsIgnoreCase("CC")) {
            setStatusConta(true);
            System.out.println("Você ganhou 50 reais por abrir sua conta corrente!");
            setSaldoConta(50);
        } else if (tipoConta.equalsIgnoreCase("CP")) {
            setStatusConta(true);
            System.out.println("Você ganhou 150 reais por abrir sua conta poupança!");
            setSaldoConta(150);
        }
    }

    public void fecharConta() {
        if (getStatusConta()) {
            if (getSaldoConta() > 0) {
                System.out.println("Você não pode encerrar sua conta! Ainda tem saldo na mesma!");
            } else if (getSaldoConta() < 0) {
                System.out.println("Você está em débito, não poderá encerrar sua conta.");
            } else {
                setStatusConta(false);
                System.out.println("Sua conta foi encerrada.");
            }
        } else {
            System.out.println("Você aida não tem uma conta.");
        }
    }

    public void depositar(double valorDeposito) {
        if (getStatusConta()) {
            setSaldoConta(getSaldoConta() + valorDeposito);
        } else {
            System.out.println("Você precisa criar uma conta.");
        }
    }

    public void sacar(double valorSaque) {
        if (getStatusConta()) {
            setSaldoConta(getSaldoConta() - valorSaque);
        } else {
            System.out.println("Você precisa criar uma conta.");
        }
    }

    public void pagarMensalidade() {
        double valorMensalidade;
        if (getStatusConta()) {
            if (getTipoConta().equalsIgnoreCase("CC")) {
                valorMensalidade = 12;
                setSaldoConta(getSaldoConta() - valorMensalidade);
            } else if (getTipoConta().equalsIgnoreCase("CP")) {
                valorMensalidade = 20;
                setSaldoConta(getSaldoConta() - valorMensalidade);
            }
        }
    }

}

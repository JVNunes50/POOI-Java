public class Loja {
    private int lojaId;
    private String nomeFantasia;
    private String cnpj;
    private double valorDeMercado;
    private Funcionario funcionario;

    public Loja(int lojaId, String nomeFantasia, String cnpj, double valorDeMercado, Funcionario funcionario) {
        this.lojaId = lojaId;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.valorDeMercado = valorDeMercado;
        this.funcionario = funcionario;
    }

    public int getLojaId() {
        return lojaId;
    }

    public void setLojaId(int lojaId) {
        this.lojaId = lojaId;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getValorDeMercado() {
        return valorDeMercado;
    }

    public void setValorDeMercado(double valorDeMercado) {
        this.valorDeMercado = valorDeMercado;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}

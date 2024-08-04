import java.math.BigDecimal;

public class Produto {
  private Integer codigo;
  private String nome;
  private Integer quantidadeEmEstoque;
  private BigDecimal precoUnitarioDeCusto;
  private Integer quantidadeVendida;
  private BigDecimal precoUnitarioDeVenda;

  private Produto(Builder builder) {
    this.codigo = builder.codigo;
    this.nome = builder.nome;
    this.quantidadeEmEstoque = builder.quantidadeEmEstoque;
    this.precoUnitarioDeCusto = builder.precoUnitarioDeCusto;
    this.quantidadeVendida = builder.quantidadeVendida;
    this.precoUnitarioDeVenda = builder.precoUnitarioDeVenda;
  }

  public static class Builder {
    private Integer codigo;
    private String nome;
    private Integer quantidadeEmEstoque;
    private BigDecimal precoUnitarioDeCusto;
    private Integer quantidadeVendida;
    private BigDecimal precoUnitarioDeVenda;

    public Builder() {}

    public Builder codigo(Integer codigo) {
      this.codigo = codigo;
      return this;
    }

    public Builder nome(String nome) {
      this.nome = nome;
      return this;
    }

    public Builder quantidadeEmEstoque(Integer quantidadeEmEstoque) {
      this.quantidadeEmEstoque = quantidadeEmEstoque;
      return this;
    }

    public Builder precoUnitarioDeCusto(BigDecimal precoUnitarioDeCusto) {
      this.precoUnitarioDeCusto = precoUnitarioDeCusto;
      return this;
    }

    public Builder quantidadeVendida(Integer quantidadeVendida) {
      this.quantidadeVendida = quantidadeVendida;
      return this;
    }

    public Builder precoUnitarioDeVenda(BigDecimal precoUnitarioDeVenda) {
      this.precoUnitarioDeVenda = precoUnitarioDeVenda;
      return this;
    }

    public Produto build() {
      return new Produto(this);
    }
  }

  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getQuantidadeEmEstoque() {
    return quantidadeEmEstoque;
  }

  public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {
    this.quantidadeEmEstoque = quantidadeEmEstoque;
  }

  public BigDecimal getPrecoUnitarioDeCusto() {
    return precoUnitarioDeCusto;
  }

  public void setPrecoUnitarioDeCusto(BigDecimal precoUnitarioDeCusto) {
    this.precoUnitarioDeCusto = precoUnitarioDeCusto;
  }

  public Integer getQuantidadeVendida() {
    return quantidadeVendida;
  }

  public void setQuantidadeVendida(Integer quantidadeVendida) {
    this.quantidadeVendida = quantidadeVendida;
  }

  public BigDecimal getPrecoUnitarioDeVenda() {
    return precoUnitarioDeVenda;
  }

  public void setPrecoUnitarioDeVenda(BigDecimal precoUnitarioDeVenda) {
    this.precoUnitarioDeVenda = precoUnitarioDeVenda;
  }

  @Override
  public String toString() {
    return "Produto{" +
            "codigo=" + codigo +
            ", nome='" + nome + '\'' +
            ", quantidadeEmEstoque=" + quantidadeEmEstoque +
            ", precoUnitarioDeCusto=" + precoUnitarioDeCusto +
            ", quantidadeVendida=" + quantidadeVendida +
            ", precoUnitarioDeVenda=" + precoUnitarioDeVenda +
            '}';
  }


}

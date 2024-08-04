import java.util.Date;
import java.util.List;

public class Pedido {
    private int pedidoId;
    private Date dataEmissao;
    private float valorTotalCalculado;
    private List<ItemPedido> listaDeItem;

    public Pedido(int pedidoId, Date dataEmissao, float valorTotalCalculado, List<ItemPedido> listaDeItem) {
        this.pedidoId = pedidoId;
        this.dataEmissao = dataEmissao;
        this.valorTotalCalculado = valorTotalCalculado;
        this.listaDeItem = listaDeItem;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public float getValorTotalCalculado() {
        return valorTotalCalculado;
    }

    public void setValorTotalCalculado(float valorTotalCalculado) {
        this.valorTotalCalculado = valorTotalCalculado;
    }

    public List<ItemPedido> getListaDeItem() {
        return listaDeItem;
    }

    public void setListaDeItem(List<ItemPedido> listaDeItem) {
        this.listaDeItem = listaDeItem;
    }
}

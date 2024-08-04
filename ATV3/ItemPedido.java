public class ItemPedido {
    private int itemPedidoId;
    private int item;
    private int quantidade;
    private float precoUnitario;

    public ItemPedido(int itemPedidoId, int item, int quantidade, float precoUnitario) {
        this.itemPedidoId = itemPedidoId;
        this.item = item;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public int getItemPedidoId() {
        return itemPedidoId;
    }

    public void setItemPedidoId(int itemPedidoId) {
        this.itemPedidoId = itemPedidoId;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}

package Estructura;

public class OrderDetalls {
    private int orderid;
    private int productoid;
    private String productoNomb;
    private int amount;
    private float Unitary;
    private float Total;
    private Ordenador order;

    public OrderDetalls(int orderid, int producotid, String productoNomb, int amount, float unitary, float Total) {
        this.orderid = orderid;
        this.productoid = producotid;
        this.productoNomb = productoNomb;
        this.amount = amount;
        Unitary = unitary;
        this.Total = Total;
    }

    public void calcPrice(){

    }
}

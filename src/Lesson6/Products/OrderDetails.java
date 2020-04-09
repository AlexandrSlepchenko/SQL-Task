package Lesson6.Products;

public class OrderDetails {
    private long ID;
    private Products product;
    private int UnitPrice;
    private int Quantity;
    private int Discount;

    public OrderDetails(long ID, Products product, int unitPrice, int quantity, int discount) {
        this.ID = ID;
        this.product = product;
        UnitPrice = unitPrice;
        Quantity = quantity;
        Discount = discount;
    }

    public long getID() {
        return ID;
    }

    public Products getProduct() {
        return product;
    }

    public int getUnitPrice() {
        return UnitPrice;
    }

    public int getQuantity() {
        return Quantity;
    }

    public int getDiscount() {
        return Discount;
    }
}

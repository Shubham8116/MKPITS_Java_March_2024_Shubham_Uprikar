//Customer class to add orders and manage orders
package CustomerOrderManagement.data;

import java.util.*;

public class Customer {
    int orderId;
    String customerName;
    String product;
     int quantity;
     Date orderDate;

    public Customer(int orderId, String customerName, String product, int quantity, Date orderDate) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.product = product;
        this.quantity = quantity;
        this.orderDate = orderDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", product='" + product + '\'' +
                ", quantity=" + quantity +
                ", orderDate=" + orderDate +
                '}';
    }
}

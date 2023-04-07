package Task3;

import java.util.List;

public class Order {
    private int id;
    private String date;
    private List<OrderItem> items;

    public Order(int id, String date, List<OrderItem> items) {
        this.id = id;
        this.date = date;
        this.items = items;
    }
    public Order() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", items=" + items +
                '}';
    }
}

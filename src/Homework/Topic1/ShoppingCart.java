package Homework.Topic1;

public class ShoppingCart {
    private Item[] items;
    private int itemCount;
    private int capacity;
    private double totalCost;
    private boolean isFull;

    public ShoppingCart(int capacity) {
        this.capacity = capacity;
        items = new Item[capacity];
        itemCount = 0;
        totalCost = 0;
        isFull = false;
    }

    public void addItem(Item item) {
        if (!isFull) {
            items[itemCount] = item;
            itemCount++;
            totalCost += item.getPrice();
            if (itemCount >= capacity) {
                isFull = true;
            }
        } else {
            System.out.println("Shopping cart is full. Cannot add more items.");
        }
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public boolean getIsFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void displayItems() {
        System.out.println("Shopping Cart Contents:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("- " + items[i].getName() + " ($" + items[i].getPrice() + ")");
        }
        System.out.println("Total Cost: $" + totalCost);
    }
}

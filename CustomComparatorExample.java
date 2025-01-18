import java.util.*;

 class Item {
    private int capacity;
    private String name;

    public Item(int capacity, String name) {
        this.capacity = capacity;
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "capacity=" + capacity +
                ", name='" + name + '\'' +
                '}';
    }

 
}


class CustomComparatorExample{
public static void main(String[] args) {
    List<Item> items = new ArrayList<>();
    items.add(new Item(10, "Apple"));
    items.add(new Item(5, "Banana"));
    items.add(new Item(15, "Orange"));
    items.add(new Item(5, "Mango"));

    // Sort by name using a Comparator with explicit -1, 0, 1 returns
    Comparator<Item> nameComparator = new Comparator<Item>() {
        @Override
        public int compare(Item o1, Item o2) {
            // Explicitly using -1, 0, 1 for comparison
            return o1.getName().compareTo(o2.getName());
        }
    };

    Collections.sort(items, nameComparator);

    System.out.println("Sorted by name:");
    for (Item item : items) {
        System.out.println(item);
    }

    // Sort by capacity using a Comparator with explicit -1, 0, 1 returns
    Comparator<Item> capacityComparator = new Comparator<Item>() {
        @Override
        public int compare(Item o1, Item o2) {
            // Explicitly using -1, 0, 1 for comparison
            if (o1.getCapacity() < o2.getCapacity()) return -1;
            if (o1.getCapacity() > o2.getCapacity()) return 1;
            return 0;
        }
    };

    Collections.sort(items, capacityComparator);

    System.out.println("\nSorted by capacity:");
    for (Item item : items) {
        System.out.println(item);
    }
}
}

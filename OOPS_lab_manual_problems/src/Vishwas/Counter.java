package Vishwas;

class Counter {
    static int count = 0; // Static data member to count the number of objects

    // Constructor to increment count whenever an object is created
    Counter() {
        count++;
        System.out.println("Counter object created.");
    }

    // Static method to display the count of objects created
    static void showCount() {
        System.out.println("Number of Counter objects created: " + count);
    }

    public static void main(String[] args) {
        System.out.println("Before creating objects:");
        Counter.showCount();

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("After creating 3 objects:");
        Counter.showCount();
    }
}


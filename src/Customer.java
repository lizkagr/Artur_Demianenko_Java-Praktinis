class Customer {
    private final int id;
    private final String name;
    private final int age;

    public Customer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return id + ": " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        Customer customer = new Customer(101, "Evelyn", 27);
        System.out.println(customer);
    }
}

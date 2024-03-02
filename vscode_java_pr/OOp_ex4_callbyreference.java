
class Cat {
    String name;

    Cat(String name) {
        this.name = name;
    }

    // Method that modifies the name of the given cat
    static void changeName(Cat cat, String newName) {
        cat.name = newName;
    }

    // Method that prints the name of the given cat
    static void printName(Cat cat) {
        System.out.println("Cat's name: " + cat.name);
    }
}

public class OOp_ex4_callbyreference {
    public static void main(String[] args) {
        Cat myCat = new Cat("Tom");

        // Original name
        Cat.printName(myCat);  // Output: Cat's name: Tom

        // Modifying the name using call by reference
        Cat.changeName(myCat, "Jerry");

        // Updated name after modification
        Cat.printName(myCat);  // Output: Cat's name: Jerry
    }
}

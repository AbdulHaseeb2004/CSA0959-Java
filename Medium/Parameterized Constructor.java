class SuperClass {
    int value;

    SuperClass(int value) {
        this.value = value;
    }

    void display() {
        System.out.println("SuperClass value: " + value);
    }
}

class SubClass extends SuperClass {
    int value; // Hides value of SuperClass

    SubClass(int superValue, int subValue) {
        super(superValue); // Calls the constructor of the superclass
        this.value = subValue;
    }

    void display() {
        super.display(); // Calls SuperClass's display method
        System.out.println("SubClass value: " + value);
    }
}

public class MainClass {
    public static void main(String[] args) {
        SubClass obj = new SubClass(100, 200);
        obj.display();
    }
}

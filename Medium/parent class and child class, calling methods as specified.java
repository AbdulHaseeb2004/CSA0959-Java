class Parent {
    public void print() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    public void print() {
        System.out.println("This is child class");
    }
}

public class ParentChildTest {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        Parent parentRefToChild = new Child();

        // 1. Method of parent class by object of parent class
        parent.print();

        // 2. Method of child class by object of child class
        child.print();

        // 3. Method of parent class by object of child class
        parentRefToChild.print();
    }
}

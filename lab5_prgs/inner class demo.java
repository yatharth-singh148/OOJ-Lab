
class OuterClass {
    private String outerField = "Outer class field";

    class InnerClass {
        void displayInner() {
            System.out.println("This is the Inner class.");
            System.out.println("Accessing Outer class field from Inner class: " + outerField);
        }
    }
    static class StaticNestedClass {
        void displayStaticNested() {
            System.out.println("This is the Static Nested class.");
            System.out.println("Static nested class cannot access non-static fields directly.");
        }
    }
    void methodWithLocalClass() {
        class LocalInnerClass {
            void displayLocalInner() {
                System.out.println("This is the Local Inner class inside a method.");
                System.out.println("Accessing Outer class field from Local Inner class: " + outerField);
            }
        }
        LocalInnerClass localInner = new LocalInnerClass();
        localInner.displayLocalInner();
    }
}
public class InnerClassDemo {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass(); 
        inner.displayInner();
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.displayStaticNested();
        outer.methodWithLocalClass();
    }
}

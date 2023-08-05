package com.driver;
class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        B objB = new B();

        // Task 3: Call method meth of class A from an object of class B
        String resultA = objB.meth();
        System.out.println(resultA);

        // Task 5: Call overridden method from an object of class B
        String resultB = objB.meth();
        System.out.println(resultB);
    }
}

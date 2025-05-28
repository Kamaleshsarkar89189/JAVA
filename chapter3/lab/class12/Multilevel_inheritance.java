package lab.class12;

class GrandFather {
    void showGrandFather() {
        System.out.println("I am GrandFather");
    }
}

class GrandMother extends GrandFather {
    void showGrandMother() {
        System.out.println("I am GrandMother");
    }
}

class Child extends GrandMother {
    void showChild() {
        System.out.println("I am Child");
    }
}

public class Multilevel_inheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.showGrandFather();
        c.showGrandMother();
        c.showChild();
    }
}

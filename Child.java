interface Father {
    void showFather();
}
interface Mother {
    void showMother();
}
class Child implements Father, Mother {

    public void showFather() {
        System.out.println("This is Father's method.");
    }

    public void showMother() {
        System.out.println("This is Mother's method.");
    }

    public void display() {
        System.out.println("Child inherits properties from both interfaces.");
    }

    public static void main(String[] args) {
        Child obj = new Child();

        obj.showFather();
        obj.showMother();
        obj.display();
    }
}
interface Father {
    void fatherProperty();
}

interface Mother {
    void motherProperty();
}

class Child implements Father, Mother {
    public void fatherProperty() {
        System.out.println("Child gets property from Father");
    }

    public void motherProperty() {
        System.out.println("Child gets property from Mother");
    }
}

class GrandChild extends Child {
    public void ownProperty() {
        System.out.println("GrandChild has its own property");
    }

    public static void main(String[] args) {
        GrandChild obj = new GrandChild();

        obj.fatherProperty();
        obj.motherProperty();
        obj.ownProperty();
    }
}
class Grandfather {
    void company() {
        System.out.println("Grandfather owns a company.");
    }
}

class Father extends Grandfather {
    void car() {
        System.out.println("Father has a car.");
    }
}

class Son extends Father {
    void hobby() {
        System.out.println("Son loves to play football.");
    }

    public static void main(String[] args) {
        Son s = new Son();
        s.company();
        s.car();
        s.hobby();
    }
}

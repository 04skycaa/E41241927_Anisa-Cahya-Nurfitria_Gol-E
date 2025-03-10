package Abstract;

public abstract class A {
    abstract public void method2(); // Deklarasi method abstrak.
    
    // Method konkret yang memiliki implementasi
    public void method1() {
        System.out.println("Method konkrit dari class A");
    }
}

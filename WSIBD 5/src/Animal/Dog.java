package Animal;

class Dog extends Animal {

    public void makeNoise() {
        System.out.println("Bark");
    }

    public static void main(String[] args) {
        Dog a = new Dog();
        Animal b = new Animal();

        a.makeNoise();
        b.makeNoise();

        Animal animaldog = new Dog();
        animaldog.makeNoise();

        if (b instanceof Animal) {
            System.out.println("animal is Animal");
        }
        if (a instanceof Animal) {
            System.out.println("Dog is Animal");
        }
        if (animaldog instanceof Animal) {
            System.out.println("animaldog is Animal");
        }
        if (b instanceof Dog) {
            System.out.println("Animal is Dog");
}
    }
}
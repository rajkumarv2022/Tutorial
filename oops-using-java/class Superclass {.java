class Superclass {
    Superclass(int x) {
        // Parameterized constructor in Superclass
    }
}

class Subclass extends Superclass {
    Subclass() {
        super(42); // Explicitly calling the superclass constructor with an integer argument
        
    }
}

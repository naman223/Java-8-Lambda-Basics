// Java program implementing Singleton class
// with using getInstance() method

// Class 1
// Helper class
class Singleton {
    // Static variable refereence of single_instance
    // of type Singleton
    private static Singleton single_instance = null;

    // Constructor
    // Here we will be creating private constructor
    // restricted to this class itself
    private Singleton()
    {
    }

    // Static method
    // Static method to create instance of Singleton class
    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }
}

// Class 2
// Main class
class SingletonTest {
    // Main driver method
    public static void main(String args[])
    {
        // Instantiating Singleton class with variable x
        Singleton x = Singleton.getInstance();

        // Instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();

        // Instantiating Singleton class with variable z
        Singleton z = Singleton.getInstance();

        // Printing the hash code for above variable as
        // declared
        System.out.println("Hashcode of x is "
                + x.hashCode());
        System.out.println("Hashcode of y is "
                + y.hashCode());
        System.out.println("Hashcode of z is "
                + z.hashCode());

    }
}

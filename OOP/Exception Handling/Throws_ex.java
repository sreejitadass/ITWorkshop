import java.io.IOException;

class M {
    void method() throws IOException {
        throw new IOException("Device I/O error");
    }
}

public class Throws_ex {
    public static void main(String[] args) {
        // handled in caller method of method()
        try {
            // call method here
            M m = new M();
            m.method();
        } catch (IOException e) {
            System.out.println("Exception handled");
        }
        System.out.println("Normal flow");
    }
}

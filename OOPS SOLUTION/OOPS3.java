import java.util.Random;
abstract class Compartment {
    abstract String notice();
}
class FirstClass extends Compartment {
    String notice() {
        return "First Class";
    }
}
class Ladies extends Compartment {
    String notice() {
        return "Ladies";
    }
}
class General extends Compartment {
    String notice() {
        return "General";
    }
}
class Luggage extends Compartment {
    String notice() {
        return "Luggage";
    }
}
public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] c = new Compartment[10];
        for (int i = 0; i < 10; i++) {
            int n = (int)(Math.random() * 4) + 1;
            if (n == 1)
                c[i] = new FirstClass();
            else if (n == 2)
                c[i] = new Ladies();
            else if (n == 3)
                c[i] = new General();
            else
                c[i] = new Luggage();
            System.out.println(c[i].notice());
        }
    }
}
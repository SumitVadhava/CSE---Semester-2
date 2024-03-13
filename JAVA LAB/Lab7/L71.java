abstract class Vegetable {
    String color;

    public abstract String toString();

}

class Potato extends Vegetable {
    Potato(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return ("Potato color:" + color);

    }
}

class Brinjal extends Vegetable {
    Brinjal(String color) {
        this.color = color;

    }

    @Override
    public String toString() {
        return ("Brinajal color:" + color);

    }
}

class Tomato extends Vegetable {
    Tomato(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return ("Tomato color:" + color);

    }
}

public class L71 {
    public static void main(String[] args) {
        Tomato t1 = new Tomato("Red");
        Potato p1 = new Potato("Yellow");
        Brinjal b1 = new Brinjal("Purple");
        System.out.println(t1);
        System.out.println(p1);
        System.out.println(b1);
    }
}
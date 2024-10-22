abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
}

class Lion extends Animal {
    public void eat() {
        System.out.println("Lion eats meat");
    }

    public void sleep() {
        System.out.println("Lion sleeps in den");
    }
}

class Tiger extends Animal {
    public void eat() {
        System.out.println("Tiger eats meat");
    }

    public void sleep() {
        System.out.println("Tiger sleeps in cave");
    }
}

class Deer extends Animal {
    public void eat() {
        System.out.println("Deer eats grass");
    }

    public void sleep() {
        System.out.println("Deer sleeps in forest");
    }
}

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();   // Changed L to lion
        Tiger tiger = new Tiger(); // Changed T to tiger
        Deer deer = new Deer();   // Changed D to deer
        
        lion.eat();
        lion.sleep();
         
        tiger.eat();
        tiger.sleep();
        
        deer.eat();
        deer.sleep();
    }
}

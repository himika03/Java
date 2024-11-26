class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}

class SonAgeException extends Exception {
    public SonAgeException(String message) {
        super(message);
    }
}

class Father {
    int age;

    public Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father's age cannot be less than 0.");
        }
        this.age = age;
        System.out.println("Father's age is: " + this.age);
    }
}

class Son extends Father {
    int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAge, SonAgeException {
        super(fatherAge);

        if (sonAge >= fatherAge) {
            throw new SonAgeException("Son's age cannot be greater than or equal to Father's age.");
        }
        this.sonAge = sonAge;
        System.out.println("Son's age is: " + this.sonAge);
    }
}

public class Exceptions {
    public static void main(String[] args) {
        try {
            System.out.println("Test Case 1");
            int fatherAge = 40;
            int sonAge = 30;
            Son son = new Son(fatherAge, sonAge);

            System.out.println("Test Case 2");
            try {
                Son invalidSon = new Son(30, 35); // Invalid case
            } catch (SonAgeException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.println("Test Case 3");
            try {
                Father invalidFather = new Father(-10); // Invalid case
            } catch (WrongAge e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (WrongAge e) {
            System.out.println("Error: " + e.getMessage());
        } catch (SonAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

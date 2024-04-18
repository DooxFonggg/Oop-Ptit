package ExamMiddle;

import java.util.Scanner;

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class AgeNotValidException extends Exception {
    public AgeNotValidException(String message) {
        super(message);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws NameNotValidException, AgeNotValidException {
        if (name == null || name.isEmpty() || name.length() > 40) {
            throw new NameNotValidException("Name is not valid");
        }
        if (age < 0 || age > 120) {
            throw new AgeNotValidException("Age is not valid");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < testCases; i++) {
            String name = scanner.nextLine();
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            try {
                Person person = new Person(name, age);
                System.out.println("Name: " + person.getName() + "--Age: " + person.getAge());
            } catch (NameNotValidException e) {
                System.out.println(e.getMessage());
            } catch (AgeNotValidException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}

package sk.tuke.register;

import java.util.Scanner;

/**
 * User interface of the application.
 */
public class ConsoleUI {
    /**
     * register.Register of persons.
     */
    private Register register;

    /**
     * scanner
     */
    private Scanner scanner = new Scanner(System.in);

    /**
     * Menu options.
     */
    private enum Option {
        PRINT, ADD, UPDATE, REMOVE, FIND, SORT, EXIT
    }

    public ConsoleUI(Register register) {
        this.register = register;
    }

    public void run() {
        while (true) {
            switch (showMenu()) {
                case PRINT:
                    printRegister();
                    break;
                case ADD:
                    addToRegister();
                    break;
                case UPDATE:
                    updateRegister();
                    break;
                case REMOVE:
                    removeFromRegister();
                    break;
                case FIND:
                    findInRegister();
                    break;
                case SORT:
                    sortRegister();
                    break;
                case EXIT:
                    return;
            }
        }
    }

    private String readLine() {
        return scanner.nextLine();
    }

    private Option showMenu() {
        System.out.println("Menu.");
        for (var option : Option.values()) {
            System.out.printf("%d. %s%n", option.ordinal() + 1, option);
        }
        System.out.println("-----------------------------------------------");

        var selection = -1;
        do {
            System.out.println("Option: ");
            try {
                selection = Integer.parseInt(readLine());
            } catch (NumberFormatException e) {
                selection = -1;
            }
        } while (selection <= 0 || selection > Option.values().length);

        return Option.values()[selection - 1];
    }

    private void printRegister() {
        for (var index = 0; index < register.getCount(); index++) {
            var person = register.getPerson(index);
            System.out.printf("%d. %s %s%n", index + 1, person.getName(), person.getPhoneNumber());
        }
    }

    private void addToRegister() {
        if (register.getCount() < register.getSize()) {
            System.out.println("Enter Name: ");
            var name = readLine();
            System.out.println("Enter Phone Number: ");
            var phoneNumber = readLine();

            try {
                register.addPerson(new Person(name, phoneNumber));
            } catch (RegisterException e) {
                System.err.println("Invalid phone number!");
            }
        } else {
            System.err.println("Register is full!");
        }
    }

    private void updateRegister() {
        var person = getPersonByIndex();
        if (person != null) {
            System.out.printf("Enter Name [%s]: ", person.getName());
            var name = readLine();
            if (!"".equals(name))
                person.setName(name);

            System.out.printf("Enter Phone Number [%s]: ", person.getPhoneNumber());
            var phoneNumber = readLine();
            if (!"".equals(phoneNumber))
                try {
                    person.setPhoneNumber(phoneNumber);
                } catch (RegisterException e) {
                    System.err.println("Invalid phone number!");
                }
        }
    }

    private void findInRegister() {
        System.out.print("Enter text: ");
        var text = readLine();
        var person = register.findPersonByName(text);
        if (person == null)
            person = register.findPersonByPhoneNumber(text);
        if (person != null)
            System.out.println(person);
        else
            System.out.println("Person not found.");
    }

    private void removeFromRegister() {
        var person = getPersonByIndex();
        if (person != null)
            register.removePerson(person);
    }

    private Person getPersonByIndex() {
        while (true) {
            try {
                System.out.println("Enter index: ");
                var text = readLine();
                if ("".equals(text))
                    return null;
                var index = Integer.parseInt(text);
                if (index > 0 && index <= register.getCount())
                    return register.getPerson(index - 1);
            } catch (NumberFormatException e) {
                System.err.println("Bad index!");
            }
        }
    }

    private void sortRegister() {
        register.sort();
    }
}

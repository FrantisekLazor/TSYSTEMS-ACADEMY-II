package sk.tuke.register;

public class Main {

    public static void main(String[] args) throws Exception {
        var register = new Register(20);

        register.addPerson(new Person("Janko Hrasko", "0900123456"));
        register.addPerson(new Person("Marienka Plana", "0900654321"));
        register.addPerson(new Person("Jozef Zly", "0900555555"));
        register.addPerson(new Person("Peter Ukrutny", "0900565656"));
        var ui = new ConsoleUI(register);
        ui.run();
    }
}

package sk.tuke.register;

public class Main {

    public static void main(String[] args) throws Exception {
        var register = new Register(4);

        register.addPerson(new Person("Janko Hrasko", "112"));
        register.addPerson(new Person("Zuzka Pekna", "158"));
        register.addPerson(new Person("Katka Mudra", "150"));

        var ui = new ConsoleUI(register);
        ui.run();
    }
}

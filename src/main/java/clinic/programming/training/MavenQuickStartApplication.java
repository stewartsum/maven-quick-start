package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

public class MavenQuickStartApplication {

    public void greet() {
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello");

        for (String greeting : greetings) {
            System.out.println("Greeting: " + greeting);
        }
    }

    public MavenQuickStartApplication() {
        System.out.println("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main(String[] args) {
        System.out.println("Starting Application");
        MavenQuickStartApplication app = new MavenQuickStartApplication();
        app.greet();
    }
}

package clinic.programming.training;

public class MavenQuickStartApplication {

    public MavenQuickStartApplication() {
        System.out.println("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main(String[] args) {
        System.out.println("Starting Application");
        new MavenQuickStartApplication();
    }
}

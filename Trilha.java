package trilha;
public class TrilhaJava {
    private String name;
    private String[] topics;

    public TrilhaJava(String name, String[] topics) {
        this.name = name;
        this.topics = topics;
    }

    public void displayTrack() {
        System.out.println("Study Track: " + name);
        System.out.println("Topics:");
        for (String topic : topics) {
            System.out.println("- " + topic);
        }
    }

    public static void main(String[] args) {
        String[] javaCoreTopics = {
            "Java 1: Introduction to Java (without OOP)",
            "Java 2: Basic Object-Oriented Concepts",
            "Java 3: In-depth OOP, Polymorphism, and Inheritance",
            "Java 4: Exception Handling",
            "Java 5: Code Organization",
            "Java 6: Exploring Collections (Lists, Sets, Maps)",
            "Refactoring: Continuous Code Improvement",
            "SOLID Principles",
            "Design Patterns"
        };

        TrilhaJava javaCoreTrack = new TrilhaJava("Java Core", javaCoreTopics);

        javaCoreTrack.displayTrack();
    }
}
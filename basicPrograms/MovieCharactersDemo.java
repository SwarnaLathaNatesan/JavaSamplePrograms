// Base class representing a Movie Character
class MovieCharacter {
    String name;

    public MovieCharacter(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Hello, I'm " + name + ".");
    }
}

// Subclass inheriting from MovieCharacter
class Superhero extends MovieCharacter {
    String superpower;

    public Superhero(String name, String superpower) {
        super(name);
        this.superpower = superpower;
    }

    public void useSuperpower() {
        System.out.println(name + " uses " + superpower + "!");
    }
}

// Main class to demonstrate inheritance
public class MovieCharactersDemo {
    public static void main(String[] args) {
        Superhero ironMan = new Superhero("Iron Man", "Repulsor Beams");
        ironMan.introduce();
        ironMan.useSuperpower();
    }
}

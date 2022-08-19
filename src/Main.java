import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Shark shark = new Shark();
        Eagle eagle = new Eagle();
        Turtle turtle = new Turtle();
        Animal[] animals = {animal, shark, eagle, turtle};
        Shark[] sharks = new Shark[1];
        Eagle[] eagles = new Eagle[1];
        Turtle[] turtles = new Turtle[1];
        for (Animal i: animals) {
            if (i.getClass().getSimpleName().equals("Animal")) {
                i.animalMethod();
            }
            else if (i instanceof Eagle) {
                ((Eagle) i).fly();
                eagles[0] = (Eagle) i;
            }
            else if (i instanceof Shark) {
                ((Shark) i).attack();
                sharks[0] = (Shark) i;
            }
            else if (i instanceof Turtle) {
                ((Turtle) i).swim();
                turtles[0] = (Turtle) i;
            }
        }
    }
}
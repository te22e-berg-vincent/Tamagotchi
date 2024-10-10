import java.util.ArrayList;
import java.util.List;

public class Tamagotchi {
    public String name;
    private int boredom =0;
    private int hunger =0;
    private Boolean isAlive;
    private List<String> words = new ArrayList<>();

    public Tamagotchi(){
        isAlive = true;
    }


    public  void Feed (String[] args) {
        System.out.println("[" + name + "] äter och är mindre hungrig");

        hunger -= 2;
        if (hunger < 0)
        {
            hunger = 0;
        }
    }
    public void hi() {
        int wordNum = (int) (Math.random() * words.size()); // Cast to int for compatibility
        System.out.println("[" + name + "] says: " + words.get(wordNum));
        reduceBoredom();
    }

    public void teach(String word) {
        System.out.println("[" + name + "] learns: " + word);
        words.add(word);
        reduceBoredom();
    }

    public void tick() {
        boredom++;
        hunger++;
        if (hunger > 10 || boredom > 10) {
            isAlive = false;
        }
    }

    public void printStats()
    {
        System.out.println("Name: " + name + " || Hunger: " + hunger + " || Boredom: " + boredom + " || Vocabulary: " + words.size() + " words");
    }

    private void reduceBoredom() {
        System.out.println("[" + name + "] is now less bored!");
        boredom -= 2;
        if (boredom < 0) {
            boredom = 0;
        }
    }
}
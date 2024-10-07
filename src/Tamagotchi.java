import java.util.ArrayList;
import java.util.List;
public class Tamagotchi {
    public String name;
    int boredom =0;
    int hunger =0;
    private Boolean isAlive = true;
    private List<String> words = new ArrayList<>();

    public  void Feed (String[] args) {
        int hunger;
    }

    public  void Teach (String[] args) {
        List<String> list = new ArrayList<>();
    }

    public  void Tick (int hunger, int boredom, boolean isAlive) {
        if (hunger == 10 || boredom == 10) {
            isAlive = false;
        }
    }

    public  void getStats (int hunger, int boredom, boolean isAlive) {

//Hi
    }
}

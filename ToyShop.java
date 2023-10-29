import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

public class ToyShop {

    private PriorityQueue<Toys> toysQueue;
    private Random random;

    public ToyShop() {
        toysQueue = new PriorityQueue<>((t1, t2) -> t2.weight - t1.weight);
        random = new Random();
    }

    public void addToys(String name, int weight) {
        int id = toysQueue.size() + 1;
        Toys toys = new Toys(id, name, weight);
        toysQueue.add(toys);
    }

    public void run() {
        try {
            File outputFile = new File("File.txt");
            FileWriter writer = new FileWriter(outputFile);

            for (int i = 0; i < 10; i++) {
                Toys selectedToys = getRandomToys();
                if (selectedToys != null) {
                    String result = selectedToys.name + "\n";
                    writer.write(result);
                }
            }

            writer.close();
            System.out.println("Результат записан в файл File.txt!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Toys getRandomToys() {
        List<Toys> toysList = new ArrayList<>(toysQueue);
        if (toysList.isEmpty()) {
            return null;
        }
        int randomIndex = random.nextInt(toysList.size());
        return toysList.get(randomIndex);
    }

}

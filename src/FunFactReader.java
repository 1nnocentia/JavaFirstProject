import com.google.gson.Gson; //https://mvnrepository.com/artifact/com.google.code.gson/gson/2.12.1
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class FunFactReader {
    private String filePath;

    public FunFactReader(String filePath) {
        this.filePath = filePath;
}
public String getRandomFact() {
    Gson gson = new Gson();
    try (FileReader reader = new FileReader(filePath)) {
        // Parse JSON menjadi Map
        Map<String, List<String>> data = gson.fromJson(reader, Map.class);
        List<String> funfacts = data.get("funfacts");

        if (funfacts != null && !funfacts.isEmpty()) {
            Random random = new Random();
            return funfacts.get(random.nextInt(funfacts.size()));
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return "Tidak ada fakta yang ditemukan.";
}
}
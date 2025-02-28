import com.google.gson.Gson; //https://mvnrepository.com/artifact/com.google.code.gson/gson/2.12.1
import com.google.gson.reflect.TypeToken; //to read characters that are not alphabetical
import java.io.FileReader; //read Json to system
import java.io.IOException; //Error handling if file is not found
import java.lang.reflect.Type; //data type
import java.util.List; 
import java.util.Map; //data structure to store key-value pairs
import java.util.Random; 

public class FunFactReader {
    private String filePath; //Read filepath from variable in Main

    public FunFactReader(String filePath) {
        this.filePath = filePath; //filepath as param and store in filePath var, will be read with getRandomFact() method
}
public String getRandomFact() {
    Gson gson = new Gson(); //Make Gson object
    try (FileReader reader = new FileReader(filePath)) {
        Type type = new TypeToken<Map<String, List<String>>>() {}.getType();     
        Map<String, List<String>> data = gson.fromJson(reader, type);
        List<String> funfacts = data.get("funfacts"); //get the funfact list from the json file

        if (funfacts != null && !funfacts.isEmpty()) {
            Random random = new Random(); //get random number
            return funfacts.get(random.nextInt(funfacts.size())); //get random number 0 to n-1 from sum of element in JSON
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return "There's error and couldn't read the data.";
}
}
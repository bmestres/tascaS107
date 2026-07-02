package nivell02.exercice01;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class SerializationToJSON {

    public static void serializeUser(String filePath, User user) throws IOException {
        File file = new File(filePath);
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(file, user);
    }

    public static Object deserializeUser(String filePath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(filePath), User.class);
    }
}

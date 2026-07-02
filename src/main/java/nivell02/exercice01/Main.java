package nivell02.exercice01;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        User user = new User();
        user.setId(314);
        user.setName("Joseph");

        try {
            SerializationToJSON.serializeUser("src/main/resources/user.json", user);
            User deserializedUser = (User) SerializationToJSON.deserializeUser("src/main/resources/user.json");
            System.out.println(deserializedUser);
        } catch (IOException e) {
            System.out.println("Not able to serialize");
        }
    }
}

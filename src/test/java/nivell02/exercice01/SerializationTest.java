package nivell02.exercice01;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class SerializationTest {

    @Test
    void inputObjectIsSameAsSerializedObject(){

        User user = new User();
        user.setId(314);
        user.setName("Joseph");

        try{
            SerializationToJSON.serializeUser("/Users/bernat/IdeaProjects/tascaS107/user.json", user);
            User deserializedUser = (User)SerializationToJSON.deserializeUser("/Users/bernat/IdeaProjects/tascaS107/user.json");
            System.out.println(deserializedUser);

            assertThat(user).usingRecursiveComparison().isEqualTo(deserializedUser);

        }catch(IOException e){
            System.out.println("Not able to serialize");
        }
    }
}

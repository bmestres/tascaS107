package nivell02.exercice01;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class SerializationTest {
// Check that the content of the unserialized and the serialized/deserialized User instances is equal
    @Test
    void inputObjectIsSameAsSerializedObject() throws IOException {

        User user = new User();
        user.setId(314);
        user.setName("Joseph");

            SerializationToJSON.serializeUser("src/main/resources/user.json", user);
            User deserializedUser = (User)SerializationToJSON.deserializeUser("src/main/resources/user.json");
            System.out.println(deserializedUser);

            assertThat(user).usingRecursiveComparison().isEqualTo(deserializedUser);
        }
    }


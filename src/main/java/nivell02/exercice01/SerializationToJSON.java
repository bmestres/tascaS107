package nivell02.exercice01;


import tools.jackson.databind.ObjectMapper;

import java.io.File;

public class SerializationToJSON {

    private final String filePath;
    private Object o;

    public SerializationToJSON(String filePath, Object o){
        this.filePath = filePath;
        this.o = o;
    }

    public void serialize(){
        File file = new File(this.filePath);
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(file, this.o);
    }
}

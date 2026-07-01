package nivell02.exercice01;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    @JsonProperty
    private int id;
    private String name;

public void setId(int id){
    this.id = id;
}
public void setName(String name){
    this.name = name;
}
public int getId(){
    return this.id;
}
public String getName(){
    return this.name;
}

}

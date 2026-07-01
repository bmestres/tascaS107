package nivell02.exercice01;

public class User {

    private int id;

    private String name;

    public User(){
        this.id = -1;
        this.name = "";
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return String.format("User Info:\nId: %d\nName: %s\n", this.id, this.name);
    }
}

package Day_k_tweleve.Serializable_Deserializable;

import java.io.Serializable;
public class ExampleObject implements Serializable {
    String name;
    int id;
    ExampleObject(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id=id;
    }
}

package Day_k_tweleve.Externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExampleObject implements Externalizable {
    private static final long serialVersionUID = 9147589421428516995L; // Keep this value consistent
    private String name;
    private int id;
    public ExampleObject() {
    }
    public ExampleObject(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
    }
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = in.readInt();
    }
}

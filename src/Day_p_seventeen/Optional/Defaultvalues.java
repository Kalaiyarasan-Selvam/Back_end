package Day_p_seventeen.Optional;

import java.util.Optional;

public class Defaultvalues {
    public Defaultvalues() {
        String name[]={"optional",null};
        for(String i:name) {
            Optional<String> os = Optional.ofNullable(i);
            String r=os.orElse("Guest");
            System.out.println(r);
        }
    }

    public static void main(String[] args) {
        Defaultvalues owdv=new Defaultvalues();
    }
}

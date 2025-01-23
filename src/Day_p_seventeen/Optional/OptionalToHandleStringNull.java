package Day_p_seventeen.Optional;

import java.util.Optional;

public class OptionalToHandleStringNull {
    public OptionalToHandleStringNull() {
        String s[]={"Opt ",null};
        for(String i:s)
        {
            Optional<String> os=Optional.ofNullable(i);
            if(os.isPresent()){
                System.out.println("String  :"+os.get().toUpperCase());
            }else {
                System.out.println("Empty input");
            }
        }

    }

    public static void main(String[] args) {
        OptionalToHandleStringNull obj=new OptionalToHandleStringNull();

    }
}
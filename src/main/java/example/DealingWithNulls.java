package example;

import java.util.Optional;

/**
 * Created by relango on 3/24/2014.
 */
public class DealingWithNulls {

    private static String nullReturningMethod(String param){
        return param;
    }

    private static Optional<String> optionalReturningMethod(String param){
        return Optional.ofNullable(param);
    }

    private static Optional<String> optionalReturningMethodNonNull(String param){
        return Optional.of(param);
    }


    private static void oldWayToHandleNull(String param){
        String result = nullReturningMethod(param);
        if (result == null){
            System.out.println("ERROR: Got null input");
        }
        else{
            System.out.println(param.toUpperCase());
        }
    }

    private static void usingOptionsCheckToHandleNull(String param){
        Optional<String> result = optionalReturningMethod(param);
        if (result.isPresent()){
            System.out.println(result.get().toUpperCase());
        }else{
            System.out.println("ERROR2: Got null input");
        }
    }

    private static void usingOptionsToHandleNull(String param){
        Optional<String> result = optionalReturningMethod(param);
        result.ifPresent(val -> System.out.println(val.toUpperCase()));
    }

    private static void usingOptionsDefaultValueToHandleNull(String param){
        Optional<String> result = optionalReturningMethod(param);
        String val = result.orElse("default");
        System.out.println(val.toUpperCase());
    }

    public static void main(String[] args) {
        oldWayToHandleNull(null);
        oldWayToHandleNull("test1");

        usingOptionsCheckToHandleNull(null);
        usingOptionsCheckToHandleNull("test2");

        usingOptionsToHandleNull(null);
        usingOptionsToHandleNull("test3");

        usingOptionsDefaultValueToHandleNull(null);
        usingOptionsDefaultValueToHandleNull("test4");

        optionalReturningMethodNonNull(null);

    }
}

package jakob;

import java.util.List;

public class ForMoops {

    public static void main(String[] args) {

        List<String> strings = List.of("Hallo", "Thasdkljf", "dalföjsdf", "fjjfe");

        System.out.println("Normale For Loops");
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

        System.out.println();
        System.out.println("Enhanced For Loop");
        for (String s : strings) {
            System.out.println(s);
        }

        System.out.println();
        System.out.println("ForEachFunctionalInterfaceMethod");
        strings.forEach(System.out::println);


    }

}

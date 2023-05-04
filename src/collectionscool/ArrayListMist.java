package collectionscool;


import com.sun.source.tree.Tree;

import java.util.*;

public class ArrayListMist {

    public static void main(String[] args) {


        TreeMap<String, Integer> resultMap = wordCount("'Sup nigga\n" +
                "(Gangsta Rap, nigga!)\n" +
                "Nigga\n" +
                "Nigga, nigga, nigga, nigga, nigga, nigga, nigga\n" +
                "I'm 100% nigga\n" +
                "Nigga, nigga, nigga, nigga, nigga, nigga, nigga,\n" +
                "I'm 200% nigga\n" +
                "Nigga, nigga, nigga, nigga, nigga, nigga, nigga,\n" +
                "Why do police hate niggas?\n" +
                "Nigga, nigga, nigga, nigga, nigga, nigga, nigga,\n" +
                "They hate us 'cause our dicks is bigga\n" +
                "Nigga, nigga, nigga, nigga, nigga, nigga, nigga,\n" +
                "Why you call yourself a nigga?\n" +
                "Nigga, nigga, nigga, nigga, nigga, nigga, nigga,\n" +
                "'Cause im a mother fucking nigga!\n" +
                "Nigga, nigga, nigga, nigga, nigga, nigga, nigga,\n" +
                "Why you drink so much beer?\n" +
                "Nigga, nigga, nigga, nigga, nigga, nigga, nigga,\n" +
                "I dont drink beer, I drink malt liquor\n" +
                "'Cause I'm a nigga!\n" +
                "Motherfuckin' nigga man, I ain't all that African American shit\n" +
                "Fuck that I'm a nigga, I ain't mixed, I'm a nigga\n" +
                "N-i-g-g-a, nigga, you already know\n" +
                "Nigga, nigga, nigga, nigga, nigga, nigga, nigga,\n" +
                "Why you eat so much chicken?\n" +
                "Nigga, nigga, nigga, nigga, nigga, nigga, nigga,\n" +
                "Why won't you make it in my kitchen?\n" +
                "Nigga, nigga, nigga, nigga, nigga, nigga, nigga,\n" +
                "Why you call them hoes bitches?\n" +
                "Nigga, nigga, nigga, nigga, nigga, nigga, nigga,\n" +
                "'Cause them hoes is bitches!\n" +
                "Nigga, nigga, nigga, nigga, nigga, nigga, nigga,\n" +
                "Why you stay in the hood?\n" +
                "Nigga, nigga, nigga, nigga, nigga, nigga, nigga,\n" +
                "'Cause I dont like livin' by peckerwoods\n" +
                "Nigga, nigga, nigga, nigga, nigga, nigga, nigga,\n" +
                "Why you ain't got no job?\n" +
                "Nigga, nigga, nigga, nigga, nigga, nigga, nigga,\n" +
                "Seven dollars an hour won't feed my dog\n" +
                "Nigga, nigga, nigga, nigga, nigga, nigga, nigga,\n" +
                "Why yo' pants gotta sag?\n" +
                "Nigga, nigga, nigga, nigga, nigga, nigga, nigga,\n" +
                "'Cause hand-me-downs downs is all a nigga has!\n" +
                "Nigga, nigga, nigga, nigga, nigga, nigga, nigga,\n" +
                "Why you scared to go to court?\n" +
                "Shit, 'cause the judge look just like motherfucka' that put our ass on the boat and made me a nigga\n" +
                "Mama Rag is a nigga\n" +
                "Durag is a nigga\n" +
                "Ballistics is a nigga\n" +
                "And I'm Uretha's nigga\n" +
                "Nigga!");



        HashSet<String> results = new HashSet<>();

        resultMap.forEach((word, occurrence) -> {
            if (occurrence > 1) {
                results.add(word + " " + occurrence);
            }
        });
        results.forEach(System.out::println);


    }

    public String encrypt(String string, HashMap<String, String> map) {

        StringBuilder encrypted = new StringBuilder();

        for (String s : string.split("")) {
            encrypted.append(map.get(s));
        }

        return encrypted.toString();
    }

    public String decrypt(String s) {

        return "";
    }


    public static TreeMap<String, Integer> wordCount(String sentence) {

        sentence = sentence.toUpperCase();
        sentence = sentence.replaceAll("^[^a-zA-Z0-9]+|[^a-zA-Z0-9]+$", "").trim();

        TreeMap<String, Integer> map = new TreeMap<>(); // erstellt eine HashMap

        String[] words = sentence.split("[^\\w']+"); // erstellt einen Array an Strings



        for (String word : words) { // for loop, die words durchgeht

            word = word.trim();
            if (!map.containsKey(word)) { // gucken ob das wort bereits in der Map ist

                map.put(word, 1); // steckt das wort in die map mit value 1
            } else {

                int occurrences =  map.get(word) + 1; // erhöht den alten value um 1

                map.put(word, occurrences); // steckt den neuen value in die Map
            }
        }

        return map;
    }
}



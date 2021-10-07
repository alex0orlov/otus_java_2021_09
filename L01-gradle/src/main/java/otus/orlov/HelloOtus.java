package otus.orlov;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * To start the application:
 * ./gradlew build
 * java -jar ./L01-gradle/build/libs/gradleHelloWorld-0.1.jar
 *
 * To unzip the jar:
 * unzip -l L01-gradle.jar
 * unzip -l gradleHelloWorld-0.1.jar
 *
 */
public class HelloOtus {
    public static void main(String... args) {
        List<Integer> example = new ArrayList<>();
        int min = 0;
        int max = 100;
        for (int i = min; i < max; i++) {
            example.add(i);
        }
        System.out.println(Lists.reverse(example));

        String str1 = "Hello";
        String str2 = "World";
        StringBuilder sb = new StringBuilder();
        String str = sb.append(str1).append(" ").append(str2).toString();
        System.out.println(str);
    }
}

package com.jdqm.kotlin;

/**
 * Created By Jdqm on 2020/7/2
 */
public class JavaBasicType {
    public static void main(String[] args) {
        int a = 2;
        String b = "Hello Java";

        long c = 123456l; //Ok but no good
        long d = 123456L; //Ok

        int e = 10;
        float f = e; //implicit conversion

        //no unsigned numbers

        String j = "I❤️China";
        System.out.println("Value of String 'j' is: " + j);
        System.out.println("Length of String 'j' is: " + j.length());
        System.out.printf("Length of String 'j' is: %d\n",  j.length());

        String k = "Today is a sunny Day.";
        String m = new String("Today is a sunny day.");
        System.out.println(k == m); //compare the reference
        System.out.println(k.endsWith(m)); // compare value

        String n = "<!doctype html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\"/>\n" +
                "    <title>Hello World</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div id=\"container\">\n" +
                "        <H1>Hello World</H1>\n" +
                "        <p>This is a demo page.</p>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";

        System.out.println(n);

    }
}

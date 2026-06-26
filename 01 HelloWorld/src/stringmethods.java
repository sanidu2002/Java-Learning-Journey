public class stringmethods {
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println("Original : " + str);

        System.out.println("Concat : " + str.concat(" Java"));

        System.out.println("Is Empty : " + str.isEmpty());

        System.out.println("Replace : " + str.replace("World", "Java"));

        System.out.println("Replace First : " +
                "Apple Apple Apple".replaceFirst("Apple", "Orange"));

        System.out.println("Contains : " + str.contains("Hello"));

        System.out.println("Upper : " + str.toUpperCase());

        System.out.println("Lower : " + str.toLowerCase());

        System.out.println("Substring : " + str.substring(6));

        System.out.println("Starts With : " + str.startsWith("Hello"));

        System.out.println("Ends With : " + str.endsWith("World"));
    }
}

package Lecture07;

public class MoreBuilderExamples{
    public static void main(String[] args) {

        int value1 = 300;
        double value2 = 3.14;
        short value3 = 5;
        char value4 = 'A';

        // Part A: create StringBuilder and add 4 values to it.
        StringBuilder builder = new StringBuilder();
        builder.append(value1).append("\n");
        builder.append(value2).append("\n");
        builder.append(value3).append("\n");
        builder.append(value4);

        // Part B: display results.
        String result = builder.toString();
        System.out.println(result);
        
        builder = new StringBuilder("abc");

        // Insert this substring at position 2.
        builder.insert(2, "XYZ");
        System.out.println(builder);
        
        // Try to find this substring.
        int res = builder.indexOf("Zc");
        System.out.println(res);

        // This substring does not exist.
        res = builder.indexOf("de");
        System.out.println(res);
        
        builder = new StringBuilder("carrot");

        // Delete characters from index 2 to index 5.
        builder.delete(2, 5);
        System.out.println(builder);
        
        StringBuilder pom = new StringBuilder("abc");

        // Replace second character with "xyz".
        pom.replace(1, 2, "XYZ");
        System.out.println(pom);
        
        builder = new StringBuilder("magic");
        // Loop over the characters in this StringBuilder.
        for (int i = 0; i < builder.length(); i++) {
            System.out.println(builder.charAt(i));
        }
    }
}

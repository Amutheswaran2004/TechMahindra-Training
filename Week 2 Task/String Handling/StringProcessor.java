public class StringProcessor {

    public static void main(String[] args) {
        String text = "hello world, hello everyone";
        StringProcessor processor = new StringProcessor();

        System.out.println("Reversed String: " + processor.reverseString("hello"));
        System.out.println("Occurrences of 'hello': " + processor.countOccurrences(text, "hello"));
        System.out.println("Capitalized String: " + processor.splitAndCapitalize("hello world, how are you"));
    }

    public String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public int countOccurrences(String text, String sub) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public String splitAndCapitalize(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word.substring(0, 1).toUpperCase())
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }
        return result.toString().trim();
    }
}


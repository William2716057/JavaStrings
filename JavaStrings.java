public class JavaStrings {
        public static void main(String[] args) {
                String str = "   This is a string     ";
                System.out.println("Length: " + str.length());
                System.out.println("Uppercase: " +str.toUpperCase());
                System.out.println("Substring: " + str.substring(7)); //will beging from the index d>
		System.out.println("Contains 'This': " + str.contains("This")); //will check if contains string in contains() and print true or false
		System.out.println("Trimmed: " + str.trim());
		System.out.println("replaced: " + str.replace("This", "That"));
		System.out.println("index: " + str.indexOf("a")); //will show the index of the given character
	}
}

import java.util.Scanner;

public class soal5 {
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        int len_str1 = (int) str1.length();
        int len_str2 = (int) str2.length();

        int retval = str1.compareTo(str2);

        System.out.println(len_str1+len_str2);

        if(retval < 0){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }

        String capStr1 = capitalizeWords(str1);
        String capStr2 = capitalizeWords(str2);

        System.out.println(capStr1+" "+capStr2);
    }

    public static String capitalizeWords(String input) {

        String[] words = input.split("\\s");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(Character.toTitleCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }
        return result.toString().trim();
    }
}

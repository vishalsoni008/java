package interview.ont_to_ten;

public class CheckVowelPresent_3 {
    public static void main(String[] args) {
        String str = "vishal";

        for (int i=0;i<str.length();i++){
            switch (str.charAt(i)){
                case 'a':
                    System.out.println("vowel is prent " + str.charAt(i));
                    break;
                case 'e':
                    System.out.println("vowel is prent " + str.charAt(i));
                    break;
                case 'i':
                    System.out.println("vowel is prent " + str.charAt(i));
                    break;
                case 'o':
                    System.out.println("vowel is prent " + str.charAt(i));
                    break;
                case 'u':
                    System.out.println("vowel is prent " + str.charAt(i));
                    break;
            }
        }
    }
}

public class String_remove_character {
    public static void main(String[] args) {
        String str = "Aditya";
        System.out.println(charRemoveAt(str,2));
    }
    public static String charRemoveAt(String str, int p){
        return str.substring(0,p)+str.substring(p+1);
    }
}

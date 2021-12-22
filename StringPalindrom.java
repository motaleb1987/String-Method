package palindromDemo;

public class StringPalindrom {
    public static void main(String[] args) {
        String str="madama";
        StringBuilder sb=new StringBuilder(str);
        String str2=sb.reverse().toString();
        if (str.equals(str2)){
            System.out.println(str2+" is Palindrome Number");
        }else{
            System.out.println(str2+" is Not Palindrome Number");
        }
    }

}

package arrays;

public class P1_6_StringCompression {
    public static String stringCompression(String str){
        StringBuilder sb = new StringBuilder();
        int count =1;
        for(int i=0;i<str.length()-1;i++) {
            if(str.charAt(i+1) == str.charAt(i)) {
                count++;
            } else {
                if(count != 1) {
                    sb.append(str.charAt(i)).append(count);
                } else {
                    sb.append(str.charAt(i));
                }
                count =1;
            }
        }

        if (count != 1) {
            sb.append(str.charAt(str.length()-1)).append(count);
        } else {
            sb.append(str.charAt(str.length()-1));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(stringCompression("aaabc"));
    }
}

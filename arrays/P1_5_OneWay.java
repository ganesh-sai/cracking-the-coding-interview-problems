package arrays;

public class P1_5_OneWay {
    public boolean oneWay(String s1, String s2) {
        if(s1 == null || s2 == null) {
            return false;
        }
        if (s1.length() == s2.length()) {
            // If the length of string are equal only one char should be different
            return replace(s1,s2);
        } else if(s1.length() +1 == s2.length()) {
            return insert(s1,s2);
        }  else if (s1.length() -1 == s2.length()) {
            return insert(s2, s1);
        }
        return false;
    }

    private boolean insert(String s1, String s2) {
        int idx1 =0;
        int idx2 = 0;
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        while(idx1 < s1.length() && idx2< s2.length()) {
            // If both the char doesnot match then check for indices if indieces doesnt match then you cannot insert a char
            if(chars1[idx1] != chars2[idx2]) {
                if(idx1 != idx2) {
                    return false;
                }
                idx2++;
            } else {
                idx1++;
                idx2++;
            }
        }
        return true;
    }

    private boolean replace(String s1, String s2) {
        boolean diff = false;
        char[] s = s1.toCharArray();
        char[] t = s2.toCharArray();
        for(int i=0;i<s.length;i++) {
            if(s[i] != t[i]) {
                if(diff) {
                    return false;
                }
                diff = true;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        P1_5_OneWay pWay = new P1_5_OneWay();
        System.out.println(pWay.oneWay("abcd", "abc"));
        System.out.println(pWay.oneWay("abcd", "ace"));
        System.out.println(pWay.oneWay("ab", "ac"));
        System.out.println(pWay.oneWay("abc", "ac"));
    }
}

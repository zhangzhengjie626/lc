package topInterview150.week4.addBinary67;

/**
 * 67.二进制求和
 */
public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        boolean up = false;
        while (i >= 0 && j >= 0) {
            if (a.charAt(i) == '0' && b.charAt(j) == '0') {
                if (up) {
                    sb.append("1");
                } else {
                    sb.append("0");
                }
                up = false;
            } else if ((a.charAt(i) == '1' && b.charAt(j) == '0') || (a.charAt(i) == '0' && b.charAt(j) == '1')) {
                if (up) {
                    sb.append("0");
                    up = true;
                } else {
                    sb.append("1");
                    up = false;
                }
            } else {
                if (up) {
                    sb.append("1");
                } else {
                    sb.append("0");
                }
                up = true;
            }
            i--;
            j--;
        }

        if (i >= 0) {
            for (int k = i; k >= 0; k--) {
                if (up) {
                    if (a.charAt(k) == '1') {
                        sb.append("0");
                        up = true;
                    } else {
                        sb.append("1");
                        up = false;
                    }
                } else {
                    sb.append(a.charAt(k));
                }
            }
        }

        if (j >= 0) {
            for (int k = j; k >= 0; k--) {
                if (up) {
                    if (b.charAt(k) == '1') {
                        sb.append("0");
                        up = true;
                    } else {
                        sb.append("1");
                        up = false;
                    }
                } else {
                    sb.append(b.charAt(k));
                }
            }
        }

        if (up) {
            sb.append("1");
        }
        char[] res = sb.toString().toCharArray();
        i = 0;
        j = res.length - 1;
        while (i < j) {
            char tmp = res[i];
            res[i] = res[j];
            res[j] = tmp;
            i++;
            j--;
        }
        return new String(res);
    }
}
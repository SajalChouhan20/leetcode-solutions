class Solution {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();

        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; Math.max(i, j) <= n - i - j; j++) {

                String a = num.substring(0, i);
                String b = num.substring(i, i + j);

                // leading zero check
                if ((a.length() > 1 && a.charAt(0) == '0') ||
                    (b.length() > 1 && b.charAt(0) == '0')) continue;

                if (check(num, i + j, a, b)) return true;
            }
        }
        return false;
    }

    private boolean check(String num, int start, String a, String b) {
        if (start == num.length()) return true;

        String sum = add(a, b);

        if (!num.startsWith(sum, start)) return false;

        return check(num, start + sum.length(), b, sum);
    }

    // String addition (no overflow issue)
    private String add(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            res.append(sum % 10);
            carry = sum / 10;
        }

        return res.reverse().toString();
    }
}
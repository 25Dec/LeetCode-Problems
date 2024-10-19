/*
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
 */

package easy;

public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public int tinhSoChuSo(int value) {
        return String.valueOf(value).length();
    }

    public int findNumbers(int[] nums) {
        int result = 0;
        for (int item : nums) {
            if (tinhSoChuSo(item) % 2 == 0)
                result++;
        }
        return result;
    }
}

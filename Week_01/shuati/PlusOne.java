package shuati;

/**
 方法: YHHZW同学的解法
 复杂度分析:
     时间复杂度: O(n)
     空间复杂度: O(1)
*/	 
class PlusOne {

	public int[] plusOne2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

}
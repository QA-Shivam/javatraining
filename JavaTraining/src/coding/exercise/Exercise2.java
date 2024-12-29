//Problem: Finding the Longest Repeating Subsequence java- LRS
//Problem: Finding the Longest Repeating Subsequence java- LCS
package coding.exercise;

public class Exercise2 {

	public int LRS(String str) {
		String str1=str;
		String str2=str;
		int n = str.length() + 1;
//		System.out.println(str.length());

		int lcs[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0) {
					lcs[i][j] = 0;
				} else if (str1.charAt(i - 1) == str2.charAt(j - 1) && i - 1 != j - 1) {
					lcs[i][j] = 1 + lcs[i - 1][j - 1];
				} else {
					lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);

				}
			}
		}
		return lcs[n - 1][n - 1];
	}

	public static void main(String[] args) {
		Exercise2 ex=  new Exercise2();
		System.out.println(ex.LRS("ATAKTKGGA"));
	}
}

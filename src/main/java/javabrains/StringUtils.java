package javabrains;

public class StringUtils {

	public static boolean isPalindrome(String candidate) {
		for (int i = 0, j = candidate.length() - 1; i < j; i++, j--) {
			if (candidate.charAt(i) != candidate.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean containsAllTypes(String input) {
        return input.matches(".*[a-z].*") // Kiểm tra chữ cái thường
                && input.matches(".*[A-Z].*") // Kiểm tra chữ cái hoa
                && input.matches(".*\\d.*") // Kiểm tra số
                && input.matches(".*[^a-zA-Z\\d].*"); // Kiểm tra chữ cái đặc biệt
    }
}

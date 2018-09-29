import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Array and String practice
 * 
 * @author jaiminipatel
 *
 */
public class arrayPractice {
	/**
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			int temp = target - nums[i];
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == temp)
					;
				result[1] = j;
				result[0] = i;
			}
		}
		return result;
	}

	/**
	 * 
	 * @param s
	 * @return
	 */
	public String reverseString(String s) {
		String reverse = "";
		if (s != null && s.length() > 1) {
			for (int i = s.length(); i >= 0; i--) {
				reverse = reverse + s.charAt(i);
			}
		}
		return reverse;
	}

	/**
	 * 
	 * @param s
	 * @return
	 */
	public static boolean isUnique(String s) {

		if (s.length() <= 1) {
			return true;
		} else {
			HashMap<Integer, Character> map = new HashMap<Integer, Character>();
			for (int i = 0; i < s.length(); i++) {
				if (map.containsValue(s.charAt(i)))
					return false;
				else {
					map.put(i, s.charAt(i));
				}
			}
			return true;
		}
	}

	public static String reverseString1(String s) {

		char[] sTemp = s.toCharArray();
		int right = s.length() - 1;

		for (int i = 0; i < right; i++) {

			char temp = sTemp[i];
			sTemp[i] = sTemp[right];
			sTemp[right] = temp;
			right--;

		}
		return sTemp.toString();

	}

	/**
	 * verifies if two strings are anagrams
	 * 
	 * @param s1
	 * @param s2
	 * @return boolean
	 */
	public static boolean anagramCheck(String s1, String s2) {
		// initial edge cases
		if (s1.length() != s2.length())
			return false;

		else if (s1 == null || s2 == null)
			return false;

		else {
			// create two hashmaps
			HashMap<Character, Integer> s1map = createsHashMap(s1);
			HashMap<Character, Integer> s2map = createsHashMap(s2);
			if (s1map.equals(s2map)) {
				return true;
			}
			return false;
		}
	}

	/**
	 * 
	 * @param s
	 * @return
	 */
	private static HashMap<Character, Integer> createsHashMap(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i)) == true) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else
				map.put(s.charAt(i), 1);
		} // end of for
		return map;
	}

	/**
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isPalindrome(String str) {

		int n = str.length();
		for (int i = 0; i < n / 2; i++)
			if (str.charAt(i) != str.charAt(n - i - 1))
				return false;
		return true;

	}

	/*
	 * Fib (0) = 0; Fib (1) = 1 Fib (n) = Fib(n-1)+Fib(n-2)
	 */
	public static int fib(int x) {

		// base condition
		if (x == 0) {
			return 0;
		} else if (x == 1) {
			return 1;

		} else
			return fib(x - 1) + fib(x - 2);

	}

	/**
	 * 
	 * @param x
	 * @return
	 */
	public static int fibParallel(int x) {

		int[] arr = new int[x + 1];
		arr[0] = 0;
		arr[1] = 1;

		for (int i = 2; i <= x; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[x];

	}

	/*
	 * Have to make queue from stack queue = FiFo Stack = Lifo
	 * 
	 * |4| stack == 4 |5| |8| temp1 = 4,5,8 output = 8, 5, 4
	 */

	public static Stack<Integer> enqueue(Stack<Integer> s) {
		return s;

	}

	/**
	 * 
	 * @param s
	 * @return
	 */
	public static int implementCalculator(String s) {

		int result = 0;
		// identify Bodmas - divison, multiplication, addion, subtraction; and update
		char[] arr = s.toCharArray();

		while (arr != null) {
			int i = 0;
			int prv = 0;
			if (Character.isDigit(arr[i])) {
				prv = arr[i];
			} else

				// result = evaluate(prv, arr[i + 1], arr[i]);

				i++;
		}
		// evaluate the two numbers
		return result;
	}

	public static void main1(String[] args) {

		System.out.println("Hello World");
		System.out.println(isUnique("jai"));
		System.out.println(reverseString1("jai"));
		System.out.println(isPalindrome("jaiajjjjjj"));

		System.out.println(fib(30));
		System.out.println(fibParallel(30));

		System.out.println(anagramCheck("abc", "AAbc"));

		System.out.println(implementCalculator("3+2*2"));

		int[] nums = new int[] { 3, 4, 5, 6, 1, 2 };

		// System.out.println(findMin(nums));

	}
}

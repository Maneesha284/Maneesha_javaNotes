
public class NaturalNumbers {

	public static void main(String[] args) {
		String values = "12,3-56,78,9,10-20";
		values = values.replaceAll("-", ",");
		System.out.println(values);

		String nums[] = values.split(",");
		int num[] = new int[nums.length];

		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(nums[i]);
		}

		int big = num[0];
		int small = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > big) {
				big = num[i];
			}
			if (num[i] < small) {
				small = num[i];
			}
		}

		String result = "";
		for (int i = small; i <= big; i++) {
			result += i;
			if (i < big) {
				result += ",";
			}
		}
		System.out.println(result);

	}

}

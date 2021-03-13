public class Chapter05 {
	public static void main(String[] args) {
		// プリミティブ型
		long long1 = 9223372036854775807L;
		System.out.println(long1);
		double double1 = 1234567.89;
		System.out.println(double1);
		boolean boolean1 = true;
		System.out.println(boolean1);

		// ラッパークラス
		Integer int1 = 10;
		System.out.println(int1);
		Float float1 = 1.11111f;
		System.out.println(float1);
		Character str1 = 'あ';
		System.out.println(str1);

		//配列
		int[] array1 = { 5, 10, 15, 20, 25, 30 };
		System.out.println(array1[3]);
	}
}
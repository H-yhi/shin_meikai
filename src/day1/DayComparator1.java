package day1;
import java.util.Scanner;
public class DayComparator1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		int y, m, d;
		System.out.println("日付１を入力せよ。");
		System.out.println("年："); y = stdIn.nextInt();
		System.out.println("月："); m = stdIn.nextInt();
		System.out.println("日："); d = stdIn.nextInt();
		Day day1 = new Day(y, m, d);

		System.out.println("日付２を入力せよ。");
		System.out.println("年："); y = stdIn.nextInt();
		System.out.println("月："); m = stdIn.nextInt();
		System.out.println("日："); d = stdIn.nextInt();
		Day day2 = new Day(y, m, d);

		// クラス型変数の比較
		if(day1 == day2) {
			System.out.println("比較1：等しいです。");
		}else {
			System.out.println("比較1：等しくありません。");
		}

		// ゲッターを呼び出して比較するパターン
		if(day1.getYesr()  == day2.getYesr()  &&
		   day1.getMonth() == day2.getMonth() &&
		   day1.getDate()  == day2.getDate()) {
			System.out.println("比較2：等しいです");
		}else {
			System.out.println("比較2：等しくありません。");
		}
	}

}

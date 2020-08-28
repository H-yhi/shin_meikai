package Chap08;

// Accountsクラスをテストするクラス
public class AccountTester {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Accounts adachi = new Accounts(); // 足立君の口座情報
		Accounts nakata = new Accounts(); // 仲田君の口座情報

		adachi.name     = "足立幸一";
		adachi.no       = "123456";
		adachi.balance  = 1000;

		nakata.name     = "仲田真二";
		nakata.no       = "654321";
		nakata.balance  = 200;

		adachi.balance  -= 200;
		nakata.balance  += 100;

		System.out.println("■足立君の口座");
		System.out.println("　口座名義：" + adachi.name);
		System.out.println("　口座番号：" + adachi.no);
		System.out.println("　口座残高：" + adachi.balance + "円");

		System.out.println("■仲田君の口座");
		System.out.println("　口座名義：" + nakata.name);
		System.out.println("　口座番号：" + nakata.no);
		System.out.println("　口座残高：" + nakata.balance + "円");
	}

}

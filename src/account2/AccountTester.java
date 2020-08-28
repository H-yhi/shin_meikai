package account2;

public class AccountTester {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 足立君の口座
		Account adachi = new Account("足立幸一", "123456", 1000);

		// 仲田君の口座
		Account nakata = new Account("仲田真二", "654321", 200);

		adachi.withdraw(200);
		nakata.deposit(100);

		System.out.println("■足立君の口座");
		System.out.println("　口座名義：" + adachi.getNeme());
		System.out.println("　口座番号：" + adachi.getNo());
		System.out.println("　預金残高：" + adachi.getBalance());

		System.out.println("■仲田君の口座");
		System.out.println("　口座名義：" + nakata.getNeme());
		System.out.println("　口座番号：" + nakata.getNo());
		System.out.println("　預金残高：" + nakata.getBalance());
	}

}

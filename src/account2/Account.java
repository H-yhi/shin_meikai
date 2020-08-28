package account2;

// 銀行口座クラス
public class Account {
	private String name; // 口座名義
	private String no; // 口座番号
	private long balance; // 預金残高

	Account(String n, String num, long z){
		name = n;
		no = num;
		balance = z;
	}

	String getNeme() {
		return name;
	}

	String getNo() {
		return no;
	}

	long getBalance() {
		return balance;
	}

	// k円預ける
	void deposit(long k) {
		balance += k;
	}

	// k円おろす
	void withdraw(long k) {
		balance -= k;
	}
}

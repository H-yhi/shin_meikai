package validation;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginValidation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Email
	@Size(max = 50)
	@NotEmpty(message = "ログインIDは必須入力です")
	private String sLoginId;

	@Pattern(regexp = "^[a-zA-Z0-9!-/:-@¥[-`{-~]*$") // 半角英数記号の正規表現
	@Size(max = 50)
	@NotEmpty(message = "ログインPWは必須入力です")
	private String sLoginPw;

	public String getsLoginId() {
		return sLoginId;
	}
	public void setsLoginId(String sLoginId) {
		this.sLoginId = sLoginId;
	}
	public String getsLoginPw() {
		return sLoginPw;
	}
	public void setsLoginPw(String sLoginPw) {
		this.sLoginPw = sLoginPw;
	}

}

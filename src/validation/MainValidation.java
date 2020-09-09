package validation;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class MainValidation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Pattern(regexp = "^[0-9]{4}/(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])$") // 日付にマッチする正規表現
	@Size(max = 10)
	@NotEmpty
	private String sApplicationDate;

	public String getsApplicationDate() {
		return sApplicationDate;
	}

	public void setsApplicationDate(String sApplicationDate) {
		this.sApplicationDate = sApplicationDate;
	}
}
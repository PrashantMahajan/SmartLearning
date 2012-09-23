package math;

public enum AnswerChoices {
	A(0), B(1), C(2), D(3);
	
	private int g_iCode;
	private AnswerChoices (int prm_iOp) {
		this.g_iCode = prm_iOp;
	}
	public int getCode() {
		return this.g_iCode;
	}
}

package math;

/**
 * This class represents an Question. It contains an Mathematical Equation and 4 choices. It also contains the correct answer.
 * @author prashant
 */
public class MathQuestion {

	private String g_sEquation;
	private String[] g_arrChoices;
	private AnswerChoices g_iCorrectAnswer;

	/**
	 * Returns all the choices - only one would be correct
	 */
	public String[] getChoices () {
		return g_arrChoices;
	}
	/**
	 * Returns the Correct Answer.
	 */
	public AnswerChoices getCorrectAnswer () {
		return g_iCorrectAnswer;
	}
	/**
	 * Returns the Equation - to be displayed as the Question Statement.
	 */
	public String getEquation () {
		return g_sEquation;
	}
	/**
	 * Sets all the choices - only one would be correct.
	 */
	public void setChoices (String[] prm_arrChoices) {
		this.g_arrChoices = prm_arrChoices;
	}
	/**
	 * Sets the Correct Answer.
	 */
	public void setCorrectAnswer (AnswerChoices g_iCorrectAnswer) {
		this.g_iCorrectAnswer = g_iCorrectAnswer;
	}
	/**
	 * Sets the Problem Statement.
	 */
	public void setEquation (String g_sEquation) {
		this.g_sEquation = g_sEquation;
	}
}

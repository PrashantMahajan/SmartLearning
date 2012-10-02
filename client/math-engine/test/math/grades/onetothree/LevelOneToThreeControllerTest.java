package math.grades.onetothree;

import math.MathQuestion;

import org.junit.Test;

public class LevelOneToThreeControllerTest {

	private LevelOneToThreeController g_objControllerToTest = LevelOneToThreeController.getInstance();
	@Test
	public void testGetQuestion() {
		this.printQuestions();
		this.validateDivideByZero();
		this.validatePerfectDivision();
		this.validateNoNegativeOptions();
		this.validateNoNegativeResults();
	}
	private void printQuestions() {
		int v_iI = 0;
		MathQuestion v_objQuestion;
		for (v_iI = 0; v_iI < 100; v_iI++) {
			v_objQuestion = this.g_objControllerToTest.getLevel1Question();
			System.out.println("-------Question" + v_iI + "-------");
			System.out.println(v_objQuestion.getEquation());
			System.out.println("A." + v_objQuestion.getChoices()[0] + "\tB." + v_objQuestion.getChoices()[1] + "\nC." + v_objQuestion.getChoices()[2] + "\tD." + v_objQuestion.getChoices()[3]);
			System.out.println("Answer: " + v_objQuestion.getCorrectAnswer());
		}
	}
	private void validateDivideByZero() {
		
	}
	private void validateNoNegativeOptions() {
		
	}
	private void validateNoNegativeResults() {
		
	}
	private void validatePerfectDivision() {
		
	}
}

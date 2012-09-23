package math.grades.onetothree;

import math.MathQuestion;

import org.junit.Test;

public class LevelOneControllerTest {

	private LevelOneController g_objControllerToTest = LevelOneController.getInstance();
	@Test
	public void testGetQuestion() {
		this.printQuestions();
	}
	private void printQuestions() {
		int v_iI = 0;
		MathQuestion v_objQuestion;
		for (v_iI = 0; v_iI < 10; v_iI++) {
			v_objQuestion = this.g_objControllerToTest.getQuestion();
			System.out.println("-------Question" + v_iI + "-------");
			System.out.println(v_objQuestion.getEquation());
			System.out.println("A." + v_objQuestion.getChoices()[0] + "\tB." + v_objQuestion.getChoices()[1] + "\nC." + v_objQuestion.getChoices()[2] + "\tD." + v_objQuestion.getChoices()[3]);
			System.out.println("Answer: " + v_objQuestion.getCorrectAnswer());
		}
	}
}

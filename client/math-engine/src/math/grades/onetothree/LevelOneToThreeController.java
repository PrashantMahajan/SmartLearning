package math.grades.onetothree;

import math.MathQuestion;

/**
 * This class deals with all the Math related question for the Grades 1 to 3
 * @author prashant
 */
public class LevelOneToThreeController {

	private static LevelOneToThreeController g_objInstance = null;
	public static LevelOneToThreeController getInstance () {
		if (null == LevelOneToThreeController.g_objInstance) {
			LevelOneToThreeController.g_objInstance = new LevelOneToThreeController();
		}
		return LevelOneToThreeController.g_objInstance;
	}
	
	private LevelOneToThreeController () {
	}
	
	/**
	 * This method is responsible for generating the most basic Equations. The generated Equations would be of the format:
	 * 2 + 3 = 5
	 * 2 - 1 = 1
	 * 6 / 2 = 3
	 * 2 * 3 = 6
	 */
	public MathQuestion getLevel1Question () {
		LevelOneFuncGetQuestion v_fn;
		v_fn = new LevelOneFuncGetQuestion();
		v_fn.startFunction();
		return v_fn.getQuestion();
	}
	
	/**
	 * This method is responsible for generating the Equations for . The generated Equations would be of the format:
	 * 2 + 3 = 5
	 * 2 - 1 = 1
	 * 6 / 2 = 3
	 * 2 * 3 = 6
	 */
	public MathQuestion getLevel2Question () {
		LevelTwoFuncGetQuestion v_fn;
		v_fn = new LevelTwoFuncGetQuestion();
		v_fn.startFunction();
		return v_fn.getQuestion();
	}
	public MathQuestion getLevel3Question () {
		return null;
	}
}

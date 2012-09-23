package math.grades.onetothree;

import math.MathQuestion;

/**
 * This class deals with all the Math related question for the Grades 1 to 3
 * @author prashant
 */
public class LevelOneController {

	private static LevelOneController g_objInstance = null;
	public static LevelOneController getInstance () {
		if (null == LevelOneController.g_objInstance) {
			LevelOneController.g_objInstance = new LevelOneController();
		}
		return LevelOneController.g_objInstance;
	}
	
	private LevelOneController () {
	}
	
	public MathQuestion getQuestion () {
		LevelOneFuncGetQuestion v_fn;
		v_fn = new LevelOneFuncGetQuestion();
		v_fn.startFunction();
		return v_fn.getQuestion();
	}
	
}

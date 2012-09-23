package math.algebra.equationengine;

import math.MathQuestion;
import math.grades.onetothree.LevelOneController;

public class AlgebricEquationController {
	
	public MathQuestion getLevel1Question () {
		return LevelOneController.getInstance().getQuestion();
	}

}

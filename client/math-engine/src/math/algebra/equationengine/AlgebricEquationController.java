package math.algebra.equationengine;

import math.MathQuestion;
import math.grades.onetothree.LevelOneToThreeController;

public class AlgebricEquationController {
	
	public MathQuestion getLevel1Question () {
		return LevelOneToThreeController.getInstance().getLevel1Question();
	}

}

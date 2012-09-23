package math.grades.onetothree;

import java.util.Random;

import math.AnswerChoices;
import math.MathQuestion;

/**
 * This Class is responsible for generating the most basic Equations. The generated Equations would be of the format:
 * 2 + 3 = 5
 * 
 * BODMAS:
 * B : Bracket
 * O : Order
 * D : Divide
 * M : Multiply
 * A : Addition
 * S : Subtraction
 * 
 */
public class LevelOneFuncGetQuestion extends LevelOneFunc {

	private enum Operators {
		Add(0),
		Subtract(1),
		Multiply(2),
		Divide(3);
		
		private int g_iCode;
		private Operators (int prm_iOp) {
			this.g_iCode = prm_iOp;
		}
		public int getCode() {
			return this.g_iCode;
		}
	};

	private MathQuestion g_Return = null;
	private int g_iOperand1 = 0;
	private int g_iOperand2 = 0;
	private int g_iSolution = 0;
	private String[] g_arrChoices = new String[4];
	private Operators g_iOperator = Operators.Add;
	private Random g_objRandomNumberGenerator = new Random();

	public MathQuestion getQuestion() {
		return this.g_Return;
	}

	@Override
	public void startFunction() {
		try {
			this.g_Return = new MathQuestion();
			this.g_Return.setChoices(this.g_arrChoices);
			this.generateOperator();
			this.generateOperand1();
			this.generateOperand2();
			this.solveQuestion();
			this.generateWrongChoices();
			this.setEquation();
			this.setAllChoices();
		} catch (Exception v_exException) {
			v_exException.printStackTrace();
		}
	}

	private void generateOperand1() {
		this.g_iOperand1 = this.g_objRandomNumberGenerator.nextInt(10);
	}

	private void generateOperand2() {
		this.g_iOperand2 = this.g_objRandomNumberGenerator.nextInt(10);
	}

	private void generateOperator() {
		int v_iResult;
		v_iResult = (int) (this.hashCode() % 4);
		switch (v_iResult) {
		case 0:
			this.g_iOperator = Operators.Add;
			break;
		case 1:
			this.g_iOperator = Operators.Subtract;
			break;
		case 2:
			this.g_iOperator = Operators.Multiply;
			break;
		case 3:
			this.g_iOperator = Operators.Divide;
			break;
		}
	}

	private void generateWrongChoices() {
		this.g_arrChoices[0] = "" + this.g_iSolution;
		switch (this.g_iOperator) {
		case Add:
			this.g_arrChoices[1] = "" + (this.g_iOperand1 - this.g_iOperand2);
			break;
		case Subtract:
			this.g_arrChoices[1] = "" + (this.g_iOperand1 + this.g_iOperand2);
			break;
		case Multiply:
			this.g_arrChoices[1] = "" + (this.g_iSolution +  (1 + this.g_objRandomNumberGenerator.nextInt(10)));
			break;
		case Divide:
			this.g_arrChoices[1] = "" + (this.g_iSolution +  (1 + this.g_objRandomNumberGenerator.nextInt(10)));
			break;
		}
		this.g_arrChoices[2] = this.g_arrChoices[3] = "0";
		while (this.g_arrChoices[2].equals(this.g_arrChoices[0]) || this.g_arrChoices[2].equals(this.g_arrChoices[1])) {
			this.g_arrChoices[2] = "" + (this.g_iSolution + this.g_objRandomNumberGenerator.nextInt(7));
		}
		while (this.g_arrChoices[3].equals(this.g_arrChoices[0]) || this.g_arrChoices[3].equals(this.g_arrChoices[1]) || this.g_arrChoices[3].equals(this.g_arrChoices[2])) {
			this.g_arrChoices[3] = "" + (this.g_iSolution + this.g_objRandomNumberGenerator.nextInt(5));
		}
	}

	private void setAllChoices () {
		int v_iPosition;
		String v_sChoice1;
		String v_sChoice2;
		v_iPosition = (int) (this.g_objRandomNumberGenerator.nextInt(4));
		v_sChoice1 = this.g_arrChoices[0];
		v_sChoice2 = this.g_arrChoices[v_iPosition];
		this.g_arrChoices[0] = v_sChoice2;
		this.g_arrChoices[v_iPosition] = v_sChoice1;
		switch (v_iPosition) {
		case 0:
			this.g_Return.setCorrectAnswer(AnswerChoices.A);
			break;
		case 1:
			this.g_Return.setCorrectAnswer(AnswerChoices.B);
			break;
		case 2:
			this.g_Return.setCorrectAnswer(AnswerChoices.C);
			break;
		case 3:
			this.g_Return.setCorrectAnswer(AnswerChoices.D);
			break;
		}
	}

	private void setEquation() {
		String v_sEquation;
		v_sEquation = "";
		switch (this.g_iOperator) {
		case Add: //+
			v_sEquation = "" + this.g_iOperand1 + " + " + this.g_iOperand2 + " = ?";
			break;
		case Subtract: //-
			v_sEquation = "" + this.g_iOperand1 + " - " + this.g_iOperand2 + " = ?";
			break;
		case Multiply: //*
			v_sEquation = "" + this.g_iOperand1 + " * " + this.g_iOperand2 + " = ?";
			break;
		case Divide: // %
			v_sEquation = "" + this.g_iOperand1 + " / " + this.g_iOperand2 + " = ?";
			break;
		}
		this.g_Return.setEquation(v_sEquation);
	}

	private void solveQuestion() {
		switch (this.g_iOperator) {
		case Add: //+
			this.g_iSolution = this.g_iOperand1 + this.g_iOperand2;
			break;
		case Subtract: //-
			this.g_iSolution = this.g_iOperand1 - this.g_iOperand2;
			break;
		case Multiply: //*
			this.g_iSolution = this.g_iOperand1 * this.g_iOperand2;
			break;
		case Divide: //%
			this.g_iSolution = this.g_iOperand1 / this.g_iOperand2;
			break;
		}
	}

}

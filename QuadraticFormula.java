import java.util.Scanner;
import java.lang.Math;

public class QuadraticFormula{
	//Insatnce Valriables
	double a;
	double b; 
	double c;
	double equation; 
	Scanner userInput;
	String positiveNegative;
	double squareRoot;
	double positiveQuad;
	double negativeQuad;
	public static void main(String[] args){
		QuadraticFormula formula = new QuadraticFormula();
		formula.discriminant();
	}
	public void discriminant(){
		userInput = new Scanner(System.in);
		System.out.println("Please enter the 'a' value for the quadratic formula");
		a = userInput.nextInt();
		System.out.println("Please enter the 'b' value for the quadratic formula");
		b = userInput.nextInt();
		System.out.println("Please enter the 'c' value for the quadratic formula");
		c = userInput.nextInt();
		System.out.print("The discriminant of the equation is ");
		equation = (b*b)-4*a*c;
		System.out.print(equation);
		if(equation < 0)
		{
			positiveNegative = "less than 0 meaning there is no real solution";
		}
		squareRoot = Math.sqrt(equation);
		positiveQuad = (-b+squareRoot)/(2*a);
		negativeQuad = (-b-squareRoot)/(2*a);
		if(equation == 0)
		{
			positiveNegative = "equal to zero it means there is one x value and it is " + negativeQuad;
		}
		if(equation > 0){
			positiveNegative = "greater than 0 which means the values of x are " + positiveQuad + " and " + negativeQuad;
		}
		System.out.println(" and since the discriminant is " + positiveNegative);
	}

}
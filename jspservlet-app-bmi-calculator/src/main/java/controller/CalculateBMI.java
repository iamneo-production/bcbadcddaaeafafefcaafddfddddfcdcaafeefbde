package controller;

public class CalculateBMI {

	//Enter the code here....
	public static void main(String[] args) {
        // Test the BMI Calculator
        double height = 1.75; // in meters
        double weight = 65.5; // in kilograms

        double bmi = CalculateBMI.calculate(height, weight);
        String description = CalculateBMI.description(bmi);

        System.out.println("BMI: " + bmi);
        System.out.println("Description: " + description);
    }

    // Method to calculate BMI
    public static double calculate(double height, double weight) {
        return weight / (height * height);
    }

    // Method to get BMI description
    public static String description(double bmi) {
        if (bmi < 18.5) {
            return "Under Weight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Over Weight";
        } else if (bmi >= 30 && bmi < 34.9) {
            return "Obese";
        } else {
            return "Extremely Obese";
        }
    }
}

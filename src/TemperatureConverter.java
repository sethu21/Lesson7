import java.util.Scanner;

public class TemperatureConverter {
    private double value;
    private String fromUnit;
    private String toUnit;
    private double result;

    public TemperatureConverter(double value, String fromUnit, String toUnit) {
        this.value = value;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
    if (fromUnit.equals("C")) {
            if (toUnit.equals("K")) {
                result = value + 273.15;
            } else if (toUnit.equals("F")) {
                result = (value * 9.0 / 5.0) + 32.0;
            } else {
                result = value;
            }
        } else if (fromUnit.equals("K")) {
            if (toUnit.equals("C")) {
                result = value - 273.15;
            } else if (toUnit.equals("F")) {
                result = (value - 273.15) * 9.0 / 5.0 + 32.0;
            } else {
                result = value;
            }
        } else if (fromUnit.equals("F")) {
            if (toUnit.equals("C")) {
                result = (value - 32.0) * 5.0 / 9.0;
            } else if (toUnit.equals("K")) {
                result = (value - 32.0) * 5.0 / 9.0 + 273.15;
            } else {
                result = value;
            }
        }
    }

    public double getResult() {
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature value: ");
        double value = input.nextDouble();
        System.out.print("Convert from (C)elsius, (K)elvin, or (F)ahrenheit: ");
        String fromUnit = input.next();
        System.out.print("Convert to (C)elsius, (K)elvin, or (F)ahrenheit: ");
        String toUnit = input.next();
        TemperatureConverter tc = new TemperatureConverter(value,fromUnit,toUnit);
        System.out.println("Result: " + tc.getResult() + " " + toUnit);
    }
}

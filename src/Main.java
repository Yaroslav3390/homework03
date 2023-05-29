                //Task 1
class Square {
    public static void main(String[] args) {
        int a = 2, b = 5;
        int  sqrt;
        sqrt = a * b;
        System.out.println("Square root is:" + sqrt);
    }
}
                //Task 2
class BMI {
                    public static void main(String[] args) {
                        double weight = 77;
                        double height = 1.76;
                        double BMI;
                        BMI = weight/ (height * height);
                        System.out.println("BMI for weight " + weight + "kg");
                        System.out.println("and height " + height + "m");
                        System.out.println("is equivalent to " + BMI + ".");

                    }
                }
                        //Task 3
class TemperatureConverter {
                            public static void main(String[] args) {
                                double degreeCelsius = 32;
                                double degreesFahrenheit;
                                degreesFahrenheit = (9d/5d) * 32 + 32;
                                System.out.println("Temperature in Fahrenheit is: " + degreesFahrenheit);
                            }
                        }

                            //Task 4
   class Task4 {
                                public static void main(String[] args) {
                                    int a = 2147483647;
                                    int b = 1;
                                    int c;
                                    c = a + b;
                                    System.out.println("Result is: " + c);

                                }
}
                            //Task 5
                class RoundingNumber {
                                public static void main(String[] args) {
                                    double myDouble = 8.5;
                                    int myInt = (int) myDouble;
                                    System.out.println("fractional value: " + myDouble );
                                    System.out.println("rounded number: " + myInt);

                                }
                            }

                            //Task 6
                class AgeCheck {
                                public static void main(String[] args) {
                                    int firstAge = 32;
                                    int secondAge = 18;

                                    boolean isAge;
                                    isAge = firstAge >= secondAge;
                                    System.out.println(isAge);
                                }
                            }
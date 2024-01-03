package varargs;

public class VarargsExample {

    public static void main(String[] args) {

        VarargsExample object = new VarargsExample();
        System.out.println(object.calculateSum(2, 20));
        System.out.println(object.calculateSum(2, 20, 5));
        System.out.println(object.sum());
        System.out.println(object.sum(5));
        System.out.println(object.sum(5, 10, 52));
        System.out.println(object.sum(10, 85, 2, 54));
        System.out.println(object.sum(2, 10));

        object.showAverageOfStudent("Adrian", 8, 10, 9, 7);

        System.out.println("----------------------------------------");
        System.out.println(object.findTheLongestName("Andrei", "Violeta", "Dan", "Paul", "Caine"));
    }
    public int calculateSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int calculateSum(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }

    public int sum(int... numbers) {
        int sum = 0;

        for (int i = 0; i <numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public void showAverageOfStudent(String studentName, int... grades) {

        int sum = 0;

        for (int grade : grades) {
            sum = sum + grade;
        }
        float average = (float) sum / grades.length;

        System.out.println("Media aritmetica a notelor pentru studentul " + studentName + " este: " + average);
    }

    public String findTheLongestName(String... names) {
        String longestName = names[0];

        for (String name : names) {
            if (longestName.length() < name.length()) {
                longestName = name;
            }
        }
        return longestName;
    }
}

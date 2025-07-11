package jf.practice;

public class ConditionalPractice {
    public static void main(String[] args) {
        String day = dayOfWeek(5);
        System.out.println(day);
    }

    public static String dayOfWeek(int day) {
        return switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid Day";
        };

//        switch (day) {
//            case 1:
//                return "Monday";
//            case 2:
//                return "Tuesday";
//            case 3:
//                return "Wednesday";
//            case 4:
//                return "Thursday";
//            case 5:
//                return "Friday";
//            case 6:
//                return "Saturday";
//            case 7:
//                return "Sunday";
//        }
//        return "Invalid Day";
    }

    public static String calculateGrade(int marks) {
        if (marks < 0 || marks > 100) {
            return "Invalid marks";
        } else if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

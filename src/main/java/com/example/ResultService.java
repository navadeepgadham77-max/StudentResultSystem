package com.example;

public class ResultService {

    public int calculateTotal(Student s) {
        return s.getMarks1() + s.getMarks2() + s.getMarks3();
    }

    public double calculateAverage(Student s) {
        return calculateTotal(s) / 3.0;
    }

    public String calculateGrade(Student s) {
        double avg = calculateAverage(s);

        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 50) return "C";
        else return "Fail";
    }
}

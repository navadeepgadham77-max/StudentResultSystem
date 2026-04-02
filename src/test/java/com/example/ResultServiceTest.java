package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ResultServiceTest {

    ResultService service = new ResultService();

    @Test
    void testTotal() {
        Student s = new Student(80, 70, 90);
        assertEquals(240, service.calculateTotal(s));
    }

    @Test
    void testAverage() {
        Student s = new Student(90, 90, 90);
        assertEquals(90.0, service.calculateAverage(s));
    }

    @Test
    void testGradeA() {
        Student s = new Student(95, 92, 93);
        assertEquals("A", service.calculateGrade(s));
    }

    @Test
    void testFail() {
        Student s = new Student(30, 40, 45);
        assertEquals("Fail", service.calculateGrade(s));
    }
}

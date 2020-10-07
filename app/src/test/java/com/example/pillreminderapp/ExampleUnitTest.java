package com.example.pillreminderapp;

import org.junit.Test;

import com.example.pillreminderapp.Medication;

import java.sql.Time;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        Time time = new Time(10, 10, 10);

        Medication medication = new Medication("Yeah", time);

    }
}
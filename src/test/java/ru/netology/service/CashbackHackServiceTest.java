package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainIfHalfOFBoundary() {

        int expected = 500;
        int actual = service.remain(500);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWithoutOneRuble() {

        int expected = 1;
        int actual = service.remain(999);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainIfNull() {

        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(actual, expected);
    }
}
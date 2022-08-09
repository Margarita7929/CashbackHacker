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
   public void testRemainIfFullSum() {
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }
}
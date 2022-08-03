package ru.netology.service;

import junit.framework.TestCase;

public class CashbackHackServiceTest extends TestCase {

    CashbackHackService service = new CashbackHackService();

    public void testRemainIfHalf() {
        int expected = 600;
        int actual = service.remain(400);
        assertEquals(expected, actual);
    }

    public void testRemainIfOneRuble() {
        int expected = 999;
        int actual = service.remain(1);
        assertEquals(expected, actual);
    }

    public void testRemainIfFullSum() {
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }
}
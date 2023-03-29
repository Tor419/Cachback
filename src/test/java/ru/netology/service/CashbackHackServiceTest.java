package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainTwo() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainThree() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainFour() {
        CashbackHackService service = new CashbackHackService();

        int amount = 3110300;
        int expected = 700;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainError() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}

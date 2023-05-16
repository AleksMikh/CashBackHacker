package ru.netology.service;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testWhenAmount500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    public void testWhenAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    public void testWhenAmountZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    public void testWhenAmount2000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int expected = 0;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    public void testWhenAmount999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    public void testWhenAmount1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void testWhenAmount500WithJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void testWhenAmount1000WithJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void testWhenAmountZeroWithJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void testWhenAmount2000WithJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int expected = 0;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void testWhenAmount999WithJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void testWhenAmount1001WithJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
}
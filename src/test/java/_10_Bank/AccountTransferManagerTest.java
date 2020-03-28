package _10_Bank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/** Плохию unit-тесты так как их однократное успешное выполнение
 * не может гарантировать корректность работы синхронизации потоков*/
class AccountTransferManagerTest {

    @Test
    void transferMoney() throws InterruptedException {
        var acc1 = new Account("1111111");
        var acc2 = new Account("2222222");

        //проверяем нормальный кейс
        var th1 = new Thread(() -> AccountTransferManager.transferMoney(acc1, acc2, 100));
        var th2 = new Thread(() -> AccountTransferManager.transferMoney(acc1, acc2, 100));
        th1.start();
        th2.start();

        th2.join();
        th1.join();

        assertEquals(200, acc2.getBalance(), 0.000001d);
        assertEquals(-200, acc1.getBalance(), 0.000001d);
    }

    @Test
    void transferMoney1() throws InterruptedException {
        var acc1 = new Account("1111111");

        //проверяем самого себя
        var th1 = new Thread(() -> AccountTransferManager.transferMoney(acc1, acc1, 100));
        var th2 = new Thread(() -> AccountTransferManager.transferMoney(acc1, acc1, 100));
        th1.start();
        th2.start();

        th2.join();
        th1.join();

        assertEquals(0, acc1.getBalance(), 0.000001d);
    }

    @Test
    void transferMoney3() throws InterruptedException {
        var acc1 = new Account("1111111");
        var acc2 = new Account("2222222");

        //проверяем на класический дедлок
        var th1 = new Thread(() -> AccountTransferManager.transferMoney(acc1, acc2, 100));
        var th2 = new Thread(() -> AccountTransferManager.transferMoney(acc2, acc1, 100));
        th1.setName("1111");
        th2.setName("2222");
        th1.start();
        th2.start();

        th2.join();
        th1.join();

        assertEquals(0, acc2.getBalance(), 0.000001d);
        assertEquals(0, acc1.getBalance(), 0.000001d);
    }
}
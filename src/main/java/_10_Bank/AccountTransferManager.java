package _10_Bank;

public abstract class AccountTransferManager {

        //проблема в том что перевод денег между аккаунтами не атомарен
        //еще есть проблемы с тем что нет проверок возможности выполнения операции, но это оставим за рамками

        //нам нужно каким-то образом повесить блокировку на оба аккаунта
        //при этом если мы берем обычный lock последовательно на 2 объекта
        //то нам нужно убедиться что он берется всегда в одном порядке
        //типичный пример deadlock-а первый поток лочит а,b второй поток лочит b,a
        public static void transferMoney(Account acc1, Account acc2, int sum) {

                //считаем что ИД записей не меняются и уникальны
                var result = acc1.getId().compareTo(acc2.getId());
                var min = result < 0 ? acc1 : acc2;
                var max = result < 0 ? acc2 : acc1;

                //лочим всегда в одном и том же порядке
                synchronized (min) {
                        synchronized (max) {
                                acc1.decrement(sum);
                                acc2.increment(sum);
                        }
                }
        }

        //p.s.  Можно сделать метод как synchronized, но тогда зачем его запускать в многопоточной среде?
}

package ch11.sec06;

public class Account {
    private long balance;

    public Account() {
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(long money) {
        balance += money;
    }

    public void withdraw(int money) throws InsufficienException {
        if (money > balance)
            throw new InsufficienException("잔고 부족: " + (money - balance) + " 모자람");
        balance -= money;
    }
}

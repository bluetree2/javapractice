package ch06.exercise.p20;

public class Account {
//    private Account[] account = new Account[100];

    private String acNum;
    private String name;
    private int money;

    public Account(String number, String name, int balance) {
        this.acNum = number;
        this.name = name;
        this.money = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getAcNum() {
        return acNum;
    }

    public void setAcNum(String acNum) {
        this.acNum = acNum;
    }
//    public Account[] getAccount() {
//        return account;
//    }
//
//    public void setAccount(Account[] account) {
//        this.account = account;
//    }
}

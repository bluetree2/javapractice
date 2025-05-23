package ch11.sec06;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();
        // 예금하기
        account.deposit(100);
        System.out.println("예금액: " + account.getBalance());

        // 출금하기
        try {
            account.withdraw(200);
        } catch (InsufficienException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}

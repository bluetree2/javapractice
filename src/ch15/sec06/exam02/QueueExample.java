package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Queue 컬랙션 생성
        Queue<Message> queue = new LinkedList<>();

        // 메시지 널기
        queue.offer(new Message("sendMail", "홍길동"));
        queue.offer(new Message("sendSMS", "신용권"));
        queue.offer(new Message("sendKaKaotalk", "감자바"));

        // 메시지를 하나씩 꺼내어 처리
        while (!queue.isEmpty()) {
            Message message = queue.poll();
            switch (message.command) {
                case "sendMail":
                    System.out.println(message.to + "님에게 메일을 보냅니다");
                    break;
                case "sendSMS":
                    System.out.println(message.to + "님에게 SMS를 보냅니다");
                    break;
                case "sendKaKaotalk":
                    System.out.println(message.to + "님에게 카톡을 보냅니다");
                    break;
            }
        }
    }
}

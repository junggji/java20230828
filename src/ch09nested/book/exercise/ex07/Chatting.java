package ch09nested.book.exercise.ex07;

public class Chatting {
    class Chat {
        void start() {}
        void sendMessage(String message) {}
    }

    void startChat(String chatId) {
//        String nickName = null;
//        nickName = chatId;
        final String nickName = chatId;     // final / effectively final 이여야 한다. (값 1번만 할당)

        Chat chat = new Chat() {
            @Override
            void start() {
                while (true) {
                    String inputData = "안녕하세요";
                    String message = "[" + nickName + "]" + inputData;
                    sendMessage(message);
                }
            }
        };
        chat.start();
    }
}
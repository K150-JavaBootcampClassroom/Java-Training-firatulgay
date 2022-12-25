package com.secondWeek.sunday.oop.intefacekavrami;

public class SendMessageTest {

    public static void main(String[] args) {

        TurkcellSendMessageImpl turkcellSendMessage = new TurkcellSendMessageImpl();
        VodafoneSendMessageImpl vodafoneSendMessage = new VodafoneSendMessageImpl();
        TurkTelekomSendMessageImpl turkTelekomSendMessage = new TurkTelekomSendMessageImpl();


        SendMessageManager sendMessageManager = new SendMessageManager(turkTelekomSendMessage);
        sendMessageManager.sendMessage();

    }
}

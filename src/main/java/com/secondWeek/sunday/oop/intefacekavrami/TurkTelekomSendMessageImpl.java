package com.secondWeek.sunday.oop.intefacekavrami;

public class TurkTelekomSendMessageImpl implements ISendMessage {
    @Override
    public void sendMessageWithSms() {
        System.out.println("TT Sms mesaj gönderildi");
    }

    @Override
    public void sendMessageWithMail() {
        System.out.println("TT Mail mesaj gönderildi");

    }
}

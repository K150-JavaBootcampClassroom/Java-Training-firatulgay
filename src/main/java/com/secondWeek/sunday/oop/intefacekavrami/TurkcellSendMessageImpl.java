package com.secondWeek.sunday.oop.intefacekavrami;

public class TurkcellSendMessageImpl implements ISendMessage{

    @Override
    public void sendMessageWithSms() {
        System.out.println("Turkcell sms gönderiyor");
    }

    @Override
    public void sendMessageWithMail() {
        System.out.println("Turkcell mail gönderiyor");

    }
}

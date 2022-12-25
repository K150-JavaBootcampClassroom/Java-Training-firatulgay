package com.secondWeek.sunday.oop.intefacekavrami;

public class VodafoneSendMessageImpl implements ISendMessage{

    @Override
    public void sendMessageWithSms() {
        System.out.println("Vodafone sms gönderiyor");

    }

    @Override
    public void sendMessageWithMail() {
        System.out.println("Vodafone mail gönderiyor");

    }
}

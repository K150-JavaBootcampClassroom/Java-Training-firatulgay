package com.thirdWeek.sunday.designpattern.factory;

public class SendSms implements ISendMessage{
    @Override
    public void sendMessage() {
        System.out.println("Send message with SMS");

    }
}

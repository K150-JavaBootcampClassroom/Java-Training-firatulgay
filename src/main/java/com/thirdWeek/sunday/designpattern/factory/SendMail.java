package com.thirdWeek.sunday.designpattern.factory;

public class SendMail implements ISendMessage{

    @Override
    public void sendMessage() {
        System.out.println("Send message with EMAIL");

    }
}

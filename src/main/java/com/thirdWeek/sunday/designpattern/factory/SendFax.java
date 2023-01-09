package com.thirdWeek.sunday.designpattern.factory;

public class SendFax implements ISendMessage{

    @Override
    public void sendMessage() {
        System.out.println("Send message with FAX");

    }
}

package com.thirdWeek.sunday.designpattern.factory;

public class Client {

    public static void main(String[] args) {
        ISendMessage sms = SendMessageFactory.sendMessageFactory("SMS");
        sms.sendMessage();
    }
}

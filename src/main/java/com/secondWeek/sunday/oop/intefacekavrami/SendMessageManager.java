package com.secondWeek.sunday.oop.intefacekavrami;

public class SendMessageManager {

    private ISendMessage iSendMessage;

    public SendMessageManager(ISendMessage iSendMessage) {
        this.iSendMessage = iSendMessage;
    }

    public void sendMessage(){
        iSendMessage.sendMessageWithMail();
        iSendMessage.sendMessageWithSms();
    }

}

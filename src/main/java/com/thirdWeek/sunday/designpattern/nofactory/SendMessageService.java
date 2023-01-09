package com.thirdWeek.sunday.designpattern.nofactory;

public class SendMessageService {

    public void sendMessage(SendFax sendFax){
        sendFax.sendMessage();
    }


    public void sendMessage(SendSms sendSms){
        sendSms.sendMessage();
    }


    public void sendMessage(SendMail sendMail){
        sendMail.sendMessage();
    }

}

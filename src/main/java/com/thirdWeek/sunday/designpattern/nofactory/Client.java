package com.thirdWeek.sunday.designpattern.nofactory;

public class Client {
    public static void main(String[] args) {

        /**
         * Tüm işlemleri Client bilmek zorunda kaldı.
         *
         */
        /**
         * Send message with mail
         */
        SendMail sendMail = new SendMail();
        sendMail.sendMessage();

        /**
         * Send message with SMS
         */
        SendSms sendSms = new SendSms();
        sendSms.sendMessage();

        /**
         * Send message with FAX
         */
        SendFax sendFax = new SendFax();
        sendFax.sendMessage();


        SendMessageService sendMessageService = new SendMessageService();
        sendMessageService.sendMessage(sendSms);

    }


}

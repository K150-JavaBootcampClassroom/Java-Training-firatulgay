package com.thirdWeek.sunday.designpattern.factory;

public class SendMessageFactory {

    public static ISendMessage sendMessageFactory(String messageSendType){

        if("SMS".equals(messageSendType)){
            SendSms sendSms = new SendSms();
            return sendSms;
        }else if("FAX".equals(messageSendType)){
            SendFax sendFax = new SendFax();
            return sendFax;
        }else if("EMAIL".equals(messageSendType)){
            SendMail sendMail = new SendMail();
            return sendMail;
        }

        return null;
    }


}

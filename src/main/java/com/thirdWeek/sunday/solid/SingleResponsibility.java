package com.thirdWeek.sunday.solid;

public class SingleResponsibility {

    SendMailService sendMailService = new SendMailService();

    /**
     * Her method tek bir sorumlulukta olmalıdır.
     * bir methodun uzunluğu scroll edilmeye gerek kalmayacak şekilde olmalıdır.
     */

    class Person{
        String name;
        String surname;
        String email;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

    }


    public void main(String[] args) {
        String name = "Fırat";
        String surname = "Ülgay";
        String email = "firatulgay@gmail.com";
        String text = "Text";
        Person person = new Person();
        person.setEmail(email);
        person.setName(name);
        person.setEmail(email);
        person.setSurname(surname);

        sendMessage(person, text);

    }

    public void sendMessage(Person person, String text){
        Mail mail = new Mail();
        mail.setPerson(person);
        mail.setText(text);

        if (isVip(mail)){
            sendMailService.sendMail(mail);
        }else {

        }
    }

    private boolean isVip(Mail mail) {
        VIPService vipService = new VIPService();
        boolean vip = vipService.vip;
        if(vip){
            String customName = "EngineerX";
            mail.setCustomName(customName);
        }
        return vip;
    }


    class Mail{
        Person person;
        String text;
        String customName;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public Person getPerson() {
            return person;
        }

        public void setPerson(Person person) {
            this.person = person;
        }

        public String getCustomName() {
            return customName;
        }

        public void setCustomName(String customName) {
            this.customName = customName;
        }
    }


    class VIPService{
        boolean vip = false;

    }


    class SendMailService{

        public void sendMail(Mail mail){
            //send mail
        }

    }



}

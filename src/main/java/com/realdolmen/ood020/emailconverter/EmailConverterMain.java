package com.realdolmen.ood020.emailconverter;

public class EmailConverterMain {

    public static void main(String[] args) {

        XMLBuilder xb = new XMLBuilder();
        EmailConverter em = new EmailConverter(xb);

        Email email = new Email("trainer@realdolmen.com","gof@patterns.com","Congratulations","enlightning book!");

        em.convertEmail(email);
        System.out.println(xb.getResult());


    }
}

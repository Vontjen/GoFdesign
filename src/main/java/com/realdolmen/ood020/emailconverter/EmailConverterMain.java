package com.realdolmen.ood020.emailconverter;

public class EmailConverterMain {

    public static void main(String[] args) {

        XMLBuilder xb = new XMLBuilder();
        HTMLBuilder hb = new HTMLBuilder();
        EmailConverter em = new EmailConverter(xb);
        EmailConverter em2 = new EmailConverter(hb);

        Email email = new Email("trainer@realdolmen.com","gof@patterns.com","Congratulations","enlightning book!");

        em.convertEmail(email);
        System.out.println(xb.getResult());
        em2.convertEmail(email);
        System.out.println(hb.getResult());

    }
}

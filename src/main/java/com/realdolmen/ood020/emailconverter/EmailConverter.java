package com.realdolmen.ood020.emailconverter;

public class EmailConverter {

    private ConversionBuilder xb;

    public EmailConverter(ConversionBuilder xb) {
        this.xb = xb;
    }

    public void convertEmail(Email email){




            xb.init(email.getSubject());
            xb.convertSender(email.getSender());
            xb.convertReceiver(email.getReceiver());
            xb.convertSubject(email.getSubject());
            xb.convertBody(email.getBody());
            xb.close();











    }
}

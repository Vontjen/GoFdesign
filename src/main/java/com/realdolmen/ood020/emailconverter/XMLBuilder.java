package com.realdolmen.ood020.emailconverter;

public class XMLBuilder extends ConversionBuilder {




    void init(String subject){
        builder.append("<?xml version=”1.0” encoding=“UTF-8”?>\n" +
                "<message>\n") ;
    }


    @Override
    void convertSender(String sender) {
         builder.append("\t<From>"+sender+"</from>\n");
    }

    @Override
    void convertReceiver(String receiver) {
         builder.append("\t<to>"+receiver+"</to>\n");
    }

    @Override
    void convertSubject(String subject) {
         builder.append("\t<subject>"+subject+"</subject>\n");
    }

    @Override
    void convertBody(String body) {
         builder.append("\t<body>"+body+"</body>\n");
    }

    @Override
    void close() {
         builder.append("</message>");

    }

    // kan in dit geval in abstracte klasse, maar zou NIET werken als het outputformat geen textbestand is
    public String getResult(){
        return builder.toString();
    }


}

package com.realdolmen.ood020.emailconverter;

public class HTMLBuilder extends ConversionBuilder {




    @Override
    void init(String subject) {
        builder.append("<!doctype html>\n<html>\n\t<head>\n\t\t<title>"+subject+"</title>\n\t</head>\n" +
                "\t<body>\n\t\t<table>\n");
    }

    @Override
    void convertSender(String sender) {
         builder.append("\t\t\t<tr><td>From: "+sender+"</td></tr>\n");
    }

    @Override
    void convertReceiver(String receiver) {
        builder.append("\t\t\t<tr><td>To: "+receiver+"</td></tr>\n");
    }

    @Override
    void convertSubject(String subject) {
         builder.append("\t\t\t<tr><td><i>"+subject+"</i></td></tr>\n");
    }

    @Override
    void convertBody(String body) {
         builder.append("\t\t\t<tr><td>"+body+"</td></tr>\n");
    }

    @Override
    void close() {
         builder.append("\t\t</table>\n\t</body>\n</html>");

    }
    // kan in dit geval in abstracte klasse, maar zou NIET werken als het outputformat geen textbestand is
    public String getResult(){
        return builder.toString();
    }
}

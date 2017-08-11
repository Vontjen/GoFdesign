package com.realdolmen.ood020.emailconverter;

public abstract class ConversionBuilder {
    //Stringbuilder voor de HTML/XML code op te bouwen
    protected StringBuilder builder= new StringBuilder("");

    abstract void init(String subject);

    abstract void convertSender(String sender);

    abstract void convertReceiver(String receiver);

    abstract void convertSubject(String subject);

    abstract void convertBody(String body);

    abstract void close();




}

package com.zentity.l10nServer

class Message {

    String code
    String text
    Language language
    Platform platform

    static belongsTo = [messageVersion: MessageVersion]

    static constraints = {
        code blank: false
        text blank: false
        language nullable: false
        platform nullable: false
        messageVersion nullable: false
    }

    static mapping = {
        text sqlType: 'text'
    }
}

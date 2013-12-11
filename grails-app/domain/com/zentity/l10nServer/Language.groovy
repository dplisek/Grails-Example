package com.zentity.l10nServer

class Language {

    String code
    String name

    static constraints = {
        code blank: false
        name blank: false
    }
}

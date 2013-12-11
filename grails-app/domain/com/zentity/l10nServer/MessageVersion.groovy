package com.zentity.l10nServer

class MessageVersion {

    String comment

    static belongsTo = [project: Project]

    static hasMany = [messages: Message,
                        tags: String]

    static constraints = {
        comment nullable: true
        project nullable: false
    }

    static mapping = {
        tags joinTable: [key: 'message_version_id', column: 'tag']
    }
}

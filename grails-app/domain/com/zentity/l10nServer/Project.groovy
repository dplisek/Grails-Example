package com.zentity.l10nServer

import com.zentity.l10nServer.security.ProjectUserAccess

class Project {

    String name
    String description
    Set<Platform> platforms
    List<MessageVersion> messageVersions
    Language defaultLanguage

    static hasMany = [userAccess: ProjectUserAccess,
                        languages: Language,
                        messageVersions: MessageVersion]

    static constraints = {
        name blank: false
        description nullable: true
        defaultLanguage nullable: false
    }

    static mapping = {
        description sqlType: 'text'
        languages joinTable: [key: 'project_id', column: 'language_id']
    }
}

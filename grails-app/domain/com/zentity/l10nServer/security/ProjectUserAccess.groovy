package com.zentity.l10nServer.security

import com.zentity.l10nServer.Project

class ProjectUserAccess {

    User user
    ProjectAccessLevel projectAccessLevel

    static belongsTo = [project: Project]

    static constraints = {
        user nullable: false
        projectAccessLevel nullable: false
        project nullable: false
    }
}

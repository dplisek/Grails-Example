import com.zentity.l10nServer.Role
import com.zentity.l10nServer.User
import com.zentity.l10nServer.UserRole

class BootStrap {

    def init = { servletContext ->
        createAdminUser()
    }

    def createAdminUser() {
        def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true)
        def adminUser = new User(username: 'admin', password: '77d-AJ-Jak2-3JK-2aA')
        adminUser.save(flush: true)
        UserRole.create adminUser, adminRole, true
    }

    def destroy = {
    }
}

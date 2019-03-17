package frontier.ske.service.user

import frontier.ske.service.require
import frontier.ske.serviceManager
import org.spongepowered.api.service.user.UserStorageService

inline val userStorageService: UserStorageService
    get() = serviceManager.require()
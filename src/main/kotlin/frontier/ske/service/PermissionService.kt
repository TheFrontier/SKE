package frontier.ske.service

import frontier.ske.util.unwrap
import frontier.ske.serviceManager
import kotlinx.coroutines.future.await
import org.spongepowered.api.service.context.Context
import org.spongepowered.api.service.permission.PermissionService
import org.spongepowered.api.service.permission.Subject
import org.spongepowered.api.service.permission.SubjectCollection
import org.spongepowered.api.service.permission.SubjectReference

inline val permissionService: PermissionService
    get() = serviceManager.require()

suspend fun PermissionService.load(identifier: String): SubjectCollection =
    this.loadCollection(identifier).await()

operator fun PermissionService.get(identifier: String): SubjectCollection? =
    this.getCollection(identifier).unwrap()

suspend fun PermissionService.has(identifier: String): Boolean =
    this.hasCollection(identifier).await()

suspend fun SubjectCollection.load(identifier: String): Subject =
    this.loadSubject(identifier).await()

suspend fun SubjectCollection.load(identifiers: Set<String>): Map<String, Subject> =
    this.loadSubjects(identifiers).await()

operator fun SubjectCollection.get(identifier: String): Subject? =
    this.getSubject(identifier).unwrap()

suspend fun SubjectCollection.has(identifier: String): Boolean =
    this.hasSubject(identifier).await()

operator fun SubjectCollection.invoke(subjectIdentifier: String): SubjectReference =
    this.newSubjectReference(subjectIdentifier)

operator fun SubjectCollection.minusAssign(identifier: String) {
    this.suggestUnload(identifier)
}

operator fun Subject.contains(permission: String): Boolean =
    this.hasPermission(permission)

operator fun Subject.contains(child: Subject): Boolean =
    child.isChildOf(this.asSubjectReference())

operator fun SubjectReference.contains(child: Subject): Boolean =
    child.isChildOf(this)

fun Subject.unwrapOption(contexts: Set<Context>, key: String): String? =
    this.getOption(contexts, key).unwrap()

fun Subject.unwrapOption(key: String): String? =
    this.getOption(key).unwrap()
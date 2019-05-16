package frontier.ske.profile

import kotlinx.coroutines.future.await
import org.spongepowered.api.profile.GameProfile
import org.spongepowered.api.profile.GameProfileManager
import java.util.*

suspend fun GameProfileManager.fetch(uniqueId: UUID, useCache: Boolean = true): GameProfile =
    this.get(uniqueId, useCache).await()

suspend fun GameProfileManager.fetch(name: String, useCache: Boolean = true): GameProfile =
    this.get(name, useCache).await()

@JvmName("fetchAllById")
suspend fun GameProfileManager.fetchAll(uniqueIds: Iterable<UUID>, useCache: Boolean = true): Collection<GameProfile> =
    this.getAllById(uniqueIds, useCache).await()

@JvmName("fetchAllByName")
suspend fun GameProfileManager.fetchAll(names: Iterable<String>, useCache: Boolean = true): Collection<GameProfile> =
    this.getAllByName(names, useCache).await()

suspend fun GameProfileManager.update(profile: GameProfile, signed: Boolean = false, useCache: Boolean = true): GameProfile =
    this.fill(profile, signed, useCache).await()
package frontier.ske.entity.living.player

import com.flowpowered.math.vector.Vector3d
import frontier.ske.data.value.getOrEmpty
import frontier.ske.java.util.unwrap
import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.entity.living.player.Player
import org.spongepowered.api.statistic.Statistic
import org.spongepowered.api.text.Text
import org.spongepowered.api.util.RespawnLocation
import java.time.Instant
import java.util.*

inline var Player.affectsSpawning: Boolean
    get() = get(Keys.AFFECTS_SPAWNING).orElse(false)
    set(value) {
        offer(Keys.AFFECTS_SPAWNING, value)
    }

inline val Player.firstPlayed: Instant
    get() = firstPlayed().get()

inline val Player.lastPlayed: Instant
    get() = lastPlayed().get()

inline var Player.displayName: Text?
    get() = get(Keys.DISPLAY_NAME).unwrap()
    set(value) {
        if (value == null) {
            remove(Keys.DISPLAY_NAME)
        } else {
            offer(Keys.DISPLAY_NAME, value)
        }
    }

inline var Player.experienceFromStartOfLevel: Int
    get() = get(Keys.EXPERIENCE_FROM_START_OF_LEVEL).orElse(0)
    set(value) {
        offer(Keys.EXPERIENCE_FROM_START_OF_LEVEL, value)
    }

inline var Player.experienceLevel: Int
    get() = get(Keys.EXPERIENCE_LEVEL).orElse(0)
    set(value) {
        offer(Keys.EXPERIENCE_LEVEL, value)
    }

inline var Player.experienceSinceLevel: Int
    get() = get(Keys.EXPERIENCE_SINCE_LEVEL).orElse(0)
    set(value) {
        offer(Keys.EXPERIENCE_SINCE_LEVEL, value)
    }

inline var Player.isElytraFlying: Boolean
    get() = get(Keys.IS_ELYTRA_FLYING).orElse(false)
    set(value) {
        offer(Keys.IS_ELYTRA_FLYING, value)
    }

inline var Player.isSleeping: Boolean
    get() = get(Keys.IS_SLEEPING).orElse(false)
    set(value) {
        offer(Keys.IS_SLEEPING, value)
    }

inline var Player.respawnLocations: Map<UUID, RespawnLocation>
    get() = get(Keys.RESPAWN_LOCATIONS).unwrap().orEmpty()
    set(value) {
        offer(Keys.RESPAWN_LOCATIONS, value)
    }

inline var Player.statistics: Map<Statistic, Long>
    get() = getOrEmpty(Keys.STATISTICS)
    set(value) {
        offer(Keys.STATISTICS, value)
    }

inline var Player.target: Vector3d
    get() = get(Keys.TARGETED_LOCATION).get()
    set(value) {
        offer(Keys.TARGETED_LOCATION, value)
    }

inline var Player.totalExperience: Int
    get() = get(Keys.TOTAL_EXPERIENCE).orElse(0)
    set(value) {
        offer(Keys.TOTAL_EXPERIENCE, value)
    }
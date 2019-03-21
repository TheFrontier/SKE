package frontier.ske.entity.living

import frontier.ske.java.util.unwrap
import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.entity.living.Humanoid
import org.spongepowered.api.entity.living.player.gamemode.GameMode
import org.spongepowered.api.entity.living.player.gamemode.GameModes
import java.util.*

inline var Humanoid.canFly: Boolean
    get() = get(Keys.CAN_FLY).orElse(false)
    set(value) {
        offer(Keys.CAN_FLY, value)
    }

inline var Humanoid.foodLevel: Int
    get() = get(Keys.FOOD_LEVEL).orElse(0)
    set(value) {
        offer(Keys.FOOD_LEVEL, value)
    }

inline var Humanoid.exhaustion: Double
    get() = get(Keys.EXHAUSTION).orElse(0.0)
    set(value) {
        offer(Keys.EXHAUSTION, value)
    }

inline var Humanoid.gameMode: GameMode
    get() = get(Keys.GAME_MODE).orElse(GameModes.NOT_SET)
    set(value) {
        offer(Keys.GAME_MODE, value)
    }

inline var Humanoid.skinUniqueId: UUID?
    get() = get(Keys.SKIN_UNIQUE_ID).unwrap()
    set(value) {
        offer(Keys.SKIN_UNIQUE_ID, value)
    }
package frontier.ske.block.tileentity

import com.flowpowered.math.vector.Vector3i
import org.spongepowered.api.block.tileentity.Structure
import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.data.type.StructureMode

inline var Structure.author: String
    get() = get(Keys.STRUCTURE_AUTHOR).get()
    set(value) {
        offer(Keys.STRUCTURE_AUTHOR, value)
    }

inline var Structure.ignoresEntities: Boolean
    get() = get(Keys.STRUCTURE_IGNORE_ENTITIES).orElse(false)
    set(value) {
        offer(Keys.STRUCTURE_IGNORE_ENTITIES, value)
    }

inline var Structure.integrity: Float
    get() = get(Keys.STRUCTURE_INTEGRITY).orElse(0F)
    set(value) {
        offer(Keys.STRUCTURE_INTEGRITY, value)
    }

inline var Structure.mode: StructureMode
    get() = get(Keys.STRUCTURE_MODE).get()
    set(value) {
        offer(Keys.STRUCTURE_MODE, value)
    }

inline var Structure.position: Vector3i
    get() = get(Keys.STRUCTURE_POSITION).get()
    set(value) {
        offer(Keys.STRUCTURE_POSITION, value)
    }

inline var Structure.isPowered: Boolean
    get() = get(Keys.STRUCTURE_POWERED).orElse(false)
    set(value) {
        offer(Keys.STRUCTURE_POWERED, value)
    }

inline var Structure.seed: Long
    get() = get(Keys.STRUCTURE_SEED).orElse(0)
    set(value) {
        offer(Keys.STRUCTURE_SEED, value)
    }

inline var Structure.showsAir: Boolean
    get() = get(Keys.STRUCTURE_SHOW_AIR).orElse(false)
    set(value) {
        offer(Keys.STRUCTURE_SHOW_AIR, value)
    }

inline var Structure.showsBoundingBox: Boolean
    get() = get(Keys.STRUCTURE_SHOW_BOUNDING_BOX).orElse(false)
    set(value) {
        offer(Keys.STRUCTURE_SHOW_BOUNDING_BOX, value)
    }

inline var Structure.size: Vector3i
    get() = get(Keys.STRUCTURE_SIZE).get()
    set(value) {
        offer(Keys.STRUCTURE_SIZE, value)
    }
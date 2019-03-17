package frontier.ske.block.tileentity

import org.spongepowered.api.block.tileentity.MobSpawner
import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.entity.EntityArchetype
import org.spongepowered.api.entity.EntityType
import org.spongepowered.api.util.weighted.WeightedSerializableObject
import org.spongepowered.api.util.weighted.WeightedTable

inline var MobSpawner.entityType: EntityType
    get() = get(Keys.SPAWNABLE_ENTITY_TYPE).get()
    set(value) {
        offer(Keys.SPAWNABLE_ENTITY_TYPE, value)
    }

inline var MobSpawner.entities: WeightedTable<EntityArchetype>
    get() = get(Keys.SPAWNER_ENTITIES).get()
    set(value) {
        offer(Keys.SPAWNER_ENTITIES, value)
    }

inline var MobSpawner.maxDelay: Short
    get() = get(Keys.SPAWNER_MAXIMUM_DELAY).orElse(0)
    set(value) {
        offer(Keys.SPAWNER_MAXIMUM_DELAY, value)
    }

inline var MobSpawner.maxNearbyEntities: Short
    get() = get(Keys.SPAWNER_MAXIMUM_NEARBY_ENTITIES).orElse(0)
    set(value) {
        offer(Keys.SPAWNER_MAXIMUM_NEARBY_ENTITIES, value)
    }

inline var MobSpawner.minDelay: Short
    get() = get(Keys.SPAWNER_MINIMUM_DELAY).orElse(0)
    set(value) {
        offer(Keys.SPAWNER_MINIMUM_DELAY, value)
    }

inline var MobSpawner.nextEntityToSpawn: WeightedSerializableObject<EntityArchetype>
    get() = get(Keys.SPAWNER_NEXT_ENTITY_TO_SPAWN).get()
    set(value) {
        offer(Keys.SPAWNER_NEXT_ENTITY_TO_SPAWN, value)
    }

inline var MobSpawner.remainingDelay: Short
    get() = get(Keys.SPAWNER_REMAINING_DELAY).orElse(0)
    set(value) {
        offer(Keys.SPAWNER_REMAINING_DELAY, value)
    }

inline var MobSpawner.requiredPlayerRange: Short
    get() = get(Keys.SPAWNER_REQUIRED_PLAYER_RANGE).orElse(0)
    set(value) {
        offer(Keys.SPAWNER_REQUIRED_PLAYER_RANGE, value)
    }

inline var MobSpawner.spawnCount: Short
    get() = get(Keys.SPAWNER_SPAWN_COUNT).orElse(0)
    set(value) {
        offer(Keys.SPAWNER_SPAWN_COUNT, value)
    }

inline var MobSpawner.spawnRange: Short
    get() = get(Keys.SPAWNER_SPAWN_RANGE).orElse(0)
    set(value) {
        offer(Keys.SPAWNER_SPAWN_RANGE, value)
    }
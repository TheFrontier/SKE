package frontier.ske.world

import org.spongepowered.api.world.Chunk
import org.spongepowered.api.world.World
import org.spongepowered.api.world.explosion.Explosion

operator fun World.minusAssign(chunk: Chunk) {
    this.unloadChunk(chunk)
}

operator fun World.plusAssign(explosion: Explosion) {
    this.triggerExplosion(explosion)
}
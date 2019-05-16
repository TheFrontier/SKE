package frontier.ske.effect

import com.flowpowered.math.vector.Vector3d
import com.flowpowered.math.vector.Vector3i
import org.spongepowered.api.block.BlockState
import org.spongepowered.api.effect.Viewer
import org.spongepowered.api.effect.particle.ParticleEffect
import org.spongepowered.api.effect.sound.SoundCategories
import org.spongepowered.api.effect.sound.SoundCategory
import org.spongepowered.api.effect.sound.SoundType
import org.spongepowered.api.effect.sound.record.RecordType
import org.spongepowered.api.text.BookView
import org.spongepowered.api.text.title.Title

operator fun Viewer.set(position: Vector3d, effect: ParticleEffect) {
    this.spawnParticles(effect, position)
}

operator fun Viewer.set(position: Vector3d, radius: Int, effect: ParticleEffect) {
    this.spawnParticles(effect, position, radius)
}

operator fun Viewer.set(
    position: Vector3d, volume: Double,
    category: SoundCategory = SoundCategories.MASTER, sound: SoundType
) {
    this.playSound(sound, category, position, volume)
}

operator fun Viewer.set(
    position: Vector3d, volume: Double, pitch: Double,
    category: SoundCategory = SoundCategories.MASTER, sound: SoundType
) {
    this.playSound(sound, category, position, volume, pitch)
}

operator fun Viewer.set(
    position: Vector3d, volume: Double, pitch: Double, minVolume: Double,
    category: SoundCategory = SoundCategories.MASTER, sound: SoundType
) {
    this.playSound(sound, category, position, volume, pitch, minVolume)
}

operator fun Viewer.minusAssign(sound: SoundType) {
    this.stopSounds(sound)
}

operator fun Viewer.minusAssign(category: SoundCategory) {
    this.stopSounds(category)
}

operator fun Viewer.set(position: Vector3i, record: RecordType) {
    this.playRecord(position, record)
}

operator fun Viewer.minusAssign(position: Vector3i) {
    this.stopRecord(position)
}

operator fun Viewer.plusAssign(title: Title) {
    this.sendTitle(title)
}

operator fun Viewer.plusAssign(book: BookView) {
    this.sendBookView(book)
}

operator fun Viewer.set(position: Vector3i, state: BlockState) {
    this.sendBlockChange(position, state)
}

operator fun Viewer.set(x: Int, y: Int, z: Int, state: BlockState) {
    this.sendBlockChange(x, y, z, state)
}
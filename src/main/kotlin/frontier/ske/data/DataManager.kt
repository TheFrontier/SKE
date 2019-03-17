package frontier.ske.data

import frontier.ske.java.util.unwrap
import org.spongepowered.api.data.*
import org.spongepowered.api.data.manipulator.DataManipulator
import org.spongepowered.api.data.manipulator.DataManipulatorBuilder
import org.spongepowered.api.data.manipulator.ImmutableDataManipulator
import org.spongepowered.api.data.persistence.DataBuilder
import org.spongepowered.api.data.persistence.DataContentUpdater
import org.spongepowered.api.data.persistence.DataTranslator

inline fun <reified T : DataSerializable> DataManager.registerBuilder(builder: DataBuilder<T>) {
    this.registerBuilder(T::class.java, builder)
}

inline fun <reified T : DataSerializable> DataManager.registerContentUpdater(updater: DataContentUpdater) {
    this.registerContentUpdater(T::class.java, updater)
}

inline fun <reified T : DataSerializable> DataManager.getWrappedContentUpdater(
    fromVersion: Int,
    toVersion: Int
): DataContentUpdater? = this.getWrappedContentUpdater(T::class.java, fromVersion, toVersion).unwrap()

inline fun <reified T : DataSerializable> DataManager.getBuilder(): DataBuilder<T>? =
    this.getBuilder(T::class.java).unwrap()

inline fun <reified T : DataSerializable> DataManager.deserialize(view: DataView): T? =
    this.deserialize(T::class.java, view).unwrap()

inline fun <reified T : ImmutableDataHolder<T>, B : ImmutableDataBuilder<T, B>> DataManager.register(builder: B) {
    this.register(T::class.java, builder)
}

inline fun <reified T : ImmutableDataHolder<T>, B : ImmutableDataBuilder<T, B>> DataManager.getImmutableBuilder(): B? =
    this.getImmutableBuilder<T, B>(T::class.java).unwrap()

inline fun <reified T : DataManipulator<T, I>, I : ImmutableDataManipulator<I, T>> DataManager.getManipulatorBuilder(): DataManipulatorBuilder<T, I>? =
    this.getManipulatorBuilder(T::class.java).unwrap()

inline fun <T : DataManipulator<T, I>, reified I : ImmutableDataManipulator<I, T>> DataManager.getImmutableManipulatorBuilder(): DataManipulatorBuilder<T, I>? =
    this.getImmutableManipulatorBuilder(I::class.java).unwrap()

inline fun <reified T> DataManager.registerTranslator(translator: DataTranslator<T>) {
    this.registerTranslator(T::class.java, translator)
}

inline fun <reified T> DataManager.getTranslator(): DataTranslator<T>? =
    this.getTranslator(T::class.java).unwrap()
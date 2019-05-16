package frontier.ske

import frontier.ske.util.unwrap
import org.spongepowered.api.CatalogType
import org.spongepowered.api.GameRegistry
import org.spongepowered.api.block.BlockType
import org.spongepowered.api.data.value.ValueFactory
import org.spongepowered.api.entity.EntityType
import org.spongepowered.api.item.ItemType
import org.spongepowered.api.item.merchant.VillagerRegistry
import org.spongepowered.api.item.recipe.crafting.CraftingRecipeRegistry
import org.spongepowered.api.item.recipe.smelting.SmeltingRecipeRegistry
import org.spongepowered.api.network.status.Favicon
import org.spongepowered.api.registry.CatalogRegistryModule
import org.spongepowered.api.resourcepack.ResourcePack
import org.spongepowered.api.scoreboard.displayslot.DisplaySlot
import org.spongepowered.api.statistic.BlockStatistic
import org.spongepowered.api.statistic.EntityStatistic
import org.spongepowered.api.statistic.ItemStatistic
import org.spongepowered.api.statistic.StatisticType
import org.spongepowered.api.text.format.TextColor
import org.spongepowered.api.text.translation.Translation
import org.spongepowered.api.util.ResettableBuilder
import org.spongepowered.api.util.rotation.Rotation
import org.spongepowered.api.world.extent.ExtentBufferFactory
import java.awt.image.BufferedImage
import java.io.InputStream
import java.net.URL
import java.nio.file.Path
import java.util.*

inline fun <reified T : CatalogType> GameRegistry.getType(id: String): T? =
    this.getType(T::class.java, id).unwrap()

inline fun <reified T : CatalogType> GameRegistry.getAllOf(): Collection<T> =
    this.getAllOf(T::class.java)

inline fun <reified T : CatalogType> GameRegistry.getAllFor(pluginId: String): Collection<T> =
    this.getAllFor(pluginId, T::class.java)

inline fun <reified T : CatalogType> GameRegistry.getAllForMinecraft(): Collection<T> =
    this.getAllForMinecraft(T::class.java)

inline fun <reified T : CatalogType> GameRegistry.getAllForSponge(): Collection<T> =
    this.getAllForSponge(T::class.java)

inline fun <reified T : CatalogType> GameRegistry.register(module: CatalogRegistryModule<T>): GameRegistry =
    this.registerModule(T::class.java, module)

inline fun <reified T> GameRegistry.registerBuilderSupplier(noinline fn: () -> T): GameRegistry =
    this.registerBuilderSupplier(T::class.java, fn)

inline fun <reified T : ResettableBuilder<*, in T>> GameRegistry.createBuilder(): T =
    this.createBuilder(T::class.java)

fun StatisticType.getEntityStatistic(entityType: EntityType): EntityStatistic? =
    gameRegistry.getEntityStatistic(this, entityType).unwrap()

fun StatisticType.getItemStatistic(itemType: ItemType): ItemStatistic? =
    gameRegistry.getItemStatistic(this, itemType).unwrap()

fun StatisticType.getBlockStatistic(blockType: BlockType): BlockStatistic? =
    gameRegistry.getBlockStatistic(this, blockType).unwrap()

fun Int.toRotationFromDegrees(): Rotation? =
    gameRegistry.getRotationFromDegree(this).unwrap()

fun String.loadFavicon(): Favicon =
    gameRegistry.loadFavicon(this)

fun Path.loadFavicon(): Favicon =
    gameRegistry.loadFavicon(this)

fun URL.loadFavicon(): Favicon =
    gameRegistry.loadFavicon(this)

fun InputStream.loadFavicon(): Favicon =
    gameRegistry.loadFavicon(this)

fun BufferedImage.loadFavicon(): Favicon =
    gameRegistry.loadFavicon(this)

inline val craftingRecipeRegistry: CraftingRecipeRegistry get() = gameRegistry.craftingRecipeRegistry

inline val smeltingRecipeRegistry: SmeltingRecipeRegistry get() = gameRegistry.smeltingRecipeRegistry

fun String.toResourcePack(): ResourcePack? =
    gameRegistry.getResourcePackById(this).unwrap()

fun TextColor.toDisplaySlot(): DisplaySlot? =
    gameRegistry.getDisplaySlotForColor(this).unwrap()

inline val extentBufferFactory: ExtentBufferFactory get() = gameRegistry.extentBufferFactory

inline val valueFactory: ValueFactory get() = gameRegistry.valueFactory

inline val villagerRegistry: VillagerRegistry get() = gameRegistry.villagerRegistry

fun String.toLocale(): Locale =
    gameRegistry.getLocale(this)

fun String.toTranslation(): Translation? =
    gameRegistry.getTranslationById(this).unwrap()
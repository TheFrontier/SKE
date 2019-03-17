package frontier.ske.item

import org.spongepowered.api.item.ItemType
import org.spongepowered.api.item.inventory.ItemStack

fun ItemType.toItemStack(quantity: Int = 1): ItemStack = ItemStack.of(this, 1)

inline fun ItemType.toItemStack(quantity: Int = 1, block: SKEItemStackBuilder.() -> Unit): ItemStack =
    SKEItemStackBuilder(ItemStack.builder().itemType(this).quantity(quantity)).apply(block).build()
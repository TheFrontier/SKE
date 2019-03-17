package frontier.ske.item

import org.spongepowered.api.data.key.Key
import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.data.value.BaseValue
import org.spongepowered.api.item.ItemType
import org.spongepowered.api.item.inventory.ItemStack
import org.spongepowered.api.text.Text

class SKEItemStackBuilder(private val delegate: ItemStack.Builder) : ItemStack.Builder by delegate {

    infix fun <V> Key<out BaseValue<V>>.value(value: V) {
        delegate.add(this, value)
    }

    var itemType: ItemType
        get() = currentItem
        set(value) {
            itemType(value)
        }

    var quantity: Int
        get() = error("Cannot get current value of builder.")
        set(value) {
            quantity(value)
        }

    var displayName: Text
        get() = error("Cannot get current value of builder.")
        set(value) {
            Keys.DISPLAY_NAME value value
        }

    var lore: List<Text>
        get() = error("Cannot get current value of builder.")
        set(value) {
            Keys.ITEM_LORE value value
        }
}
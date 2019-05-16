package frontier.ske.item

import org.spongepowered.api.item.enchantment.Enchantment
import org.spongepowered.api.item.enchantment.EnchantmentType

fun EnchantmentType.of(level: Int): Enchantment =
        Enchantment.of(this, level)
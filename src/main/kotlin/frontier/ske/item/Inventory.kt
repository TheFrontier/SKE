package frontier.ske.item

import com.flowpowered.math.vector.Vector2i
import frontier.ske.util.unwrap
import frontier.ske.util.toPredicate
import org.spongepowered.api.data.Property
import org.spongepowered.api.item.ItemType
import org.spongepowered.api.item.inventory.Inventory
import org.spongepowered.api.item.inventory.InventoryProperty
import org.spongepowered.api.item.inventory.ItemStack
import org.spongepowered.api.item.inventory.Slot
import org.spongepowered.api.item.inventory.property.SlotIndex
import org.spongepowered.api.item.inventory.property.SlotPos
import org.spongepowered.api.item.inventory.query.QueryOperation
import org.spongepowered.api.item.inventory.query.QueryOperationTypes
import org.spongepowered.api.item.inventory.transaction.InventoryTransactionResult
import org.spongepowered.api.item.inventory.type.Inventory2D
import org.spongepowered.api.item.inventory.type.OrderedInventory
import org.spongepowered.api.text.translation.Translation
import kotlin.reflect.KClass

inline val Inventory.slots: Iterable<Slot>
    get() = this.slots()

operator fun Inventory.plusAssign(stack: ItemStack) {
    this.offer(stack)
}

operator fun Inventory.plusAssign(type: ItemType) {
    this.offer(type.toItemStack())
}

operator fun <T : Inventory> Inventory.get(clazz: KClass<T>): T =
    this.query(QueryOperationTypes.INVENTORY_TYPE.of(clazz.java))

operator fun Inventory.get(vararg operations: QueryOperation<*>): Inventory =
    this.query(*operations)

operator fun Inventory.get(vararg types: ItemType): Inventory =
    this.query(*types.map { QueryOperationTypes.ITEM_TYPE.of(it) }.toTypedArray())

operator fun Inventory.get(vararg types: ItemStack): Inventory =
    this.query(*types.map { QueryOperationTypes.ITEM_STACK_IGNORE_QUANTITY.of(it) }.toTypedArray())

operator fun Inventory.get(vararg properties: InventoryProperty<*, *>): Inventory =
    this.query(*properties.map { QueryOperationTypes.INVENTORY_PROPERTY.of(it) }.toTypedArray())

operator fun Inventory.get(vararg names: Translation): Inventory =
    this.query(*names.map { QueryOperationTypes.INVENTORY_TRANSLATION.of(it) }.toTypedArray())

operator fun Inventory.get(vararg predicates: (ItemStack) -> Boolean): Inventory =
    this.query(*predicates.map { QueryOperationTypes.ITEM_STACK_CUSTOM.of(it.toPredicate()) }.toTypedArray())

operator fun Inventory.get(index: Int, operator: Property.Operator = Property.Operator.EQUAL): Slot? =
    this[SlotIndex(index, operator)].let { it as? Slot ?: it.slots.firstOrNull() }

operator fun Inventory.get(x: Int, y: Int, operator: Property.Operator = Property.Operator.EQUAL): Slot? =
    this[SlotPos(x, y, operator)].let { it as? Slot ?: it.slots.firstOrNull() }

operator fun Inventory.get(value: Vector2i, operator: Property.Operator = Property.Operator.EQUAL): Slot? =
    this[SlotPos(value, operator)].let { it as? Slot ?: it.slots.firstOrNull() }

operator fun OrderedInventory.get(index: Int, operator: Property.Operator = Property.Operator.EQUAL): Slot? =
    this.getSlot(SlotIndex(index, operator)).unwrap()

operator fun OrderedInventory.set(
    index: Int,
    operator: Property.Operator = Property.Operator.EQUAL,
    stack: ItemStack
): InventoryTransactionResult =
    this.set(SlotIndex(index, operator), stack)

operator fun Inventory2D.get(x: Int, y: Int, operator: Property.Operator = Property.Operator.EQUAL): Slot? =
    this.getSlot(SlotPos(x, y, operator)).unwrap()

operator fun Inventory2D.get(value: Vector2i, operator: Property.Operator = Property.Operator.EQUAL): Slot? =
    this.getSlot(SlotPos(value, operator)).unwrap()

operator fun Inventory2D.set(
    x: Int,
    y: Int,
    operator: Property.Operator = Property.Operator.EQUAL,
    stack: ItemStack
): InventoryTransactionResult =
    this.set(SlotPos(x, y, operator), stack)

operator fun Inventory2D.set(
    value: Vector2i,
    operator: Property.Operator = Property.Operator.EQUAL,
    stack: ItemStack
): InventoryTransactionResult =
    this.set(SlotPos(value, operator), stack)
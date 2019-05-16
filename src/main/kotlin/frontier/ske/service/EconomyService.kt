package frontier.ske.service

import frontier.ske.util.unwrap
import frontier.ske.serviceManager
import org.spongepowered.api.event.cause.Cause
import org.spongepowered.api.service.context.Context
import org.spongepowered.api.service.economy.Currency
import org.spongepowered.api.service.economy.EconomyService
import org.spongepowered.api.service.economy.account.Account
import org.spongepowered.api.service.economy.account.UniqueAccount
import org.spongepowered.api.service.economy.transaction.TransactionResult
import java.math.BigDecimal
import java.util.*

inline val economyService: EconomyService
    get() = serviceManager.require()

operator fun EconomyService.contains(uniqueId: UUID): Boolean =
    this.hasAccount(uniqueId)

operator fun EconomyService.contains(identifier: String): Boolean =
    this.hasAccount(identifier)

operator fun EconomyService.get(uniqueId: UUID): UniqueAccount? =
    this.getOrCreateAccount(uniqueId).unwrap()

operator fun EconomyService.get(identifier: String): Account? =
    this.getOrCreateAccount(identifier).unwrap()

operator fun Account.contains(currency: Currency): Boolean =
    this.hasBalance(currency)

operator fun Account.get(currency: Currency, contexts: Set<Context> = activeContexts): BigDecimal =
    this.getBalance(currency, contexts)

operator fun Account.set(
    currency: Currency, cause: Cause, contexts: Set<Context> = activeContexts, amount: BigDecimal
): TransactionResult =
    this.setBalance(currency, amount, cause, contexts)
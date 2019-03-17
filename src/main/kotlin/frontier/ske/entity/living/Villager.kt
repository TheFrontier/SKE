package frontier.ske.entity.living

import frontier.ske.data.value.getOrEmpty
import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.data.type.Career
import org.spongepowered.api.entity.living.Villager
import org.spongepowered.api.item.merchant.TradeOffer

inline var Villager.career: Career
    get() = get(Keys.CAREER).get()
    set(value) {
        offer(Keys.CAREER, value)
    }

inline var Villager.isPlaying: Boolean
    get() = get(Keys.IS_PLAYING).orElse(false)
    set(value) {
        offer(Keys.IS_PLAYING, value)
    }

inline var Villager.tradeOffers: List<TradeOffer>
    get() = getOrEmpty(Keys.TRADE_OFFERS)
    set(value) {
        offer(Keys.TRADE_OFFERS, value)
    }
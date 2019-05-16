package frontier.ske.service

import org.spongepowered.api.service.pagination.PaginationList
import org.spongepowered.api.text.Text
import org.spongepowered.api.text.channel.MessageReceiver

inline fun pagination(block: PaginationList.Builder.() -> Unit): PaginationList =
    PaginationList.builder().apply(block).build()

inline fun pagination(receiver: MessageReceiver, block: PaginationList.Builder.() -> Unit) =
    PaginationList.builder().apply(block).build().sendTo(receiver)

inline var PaginationList.Builder.title: Text?
    get() = error("Cannot get current value of builder.")
    set(value) {
        title(value)
    }

inline var PaginationList.Builder.contents: Iterable<Text>
    get() = error("Cannot get current value of builder.")
    set(value) {
        contents(value)
    }

inline var PaginationList.Builder.header: Text?
    get() = error("Cannot get current value of builder.")
    set(value) {
        header(value)
    }

inline var PaginationList.Builder.footer: Text?
    get() = error("Cannot get current value of builder.")
    set(value) {
        footer(value)
    }

inline var PaginationList.Builder.padding: Text
    get() = error("Cannot get current value of builder.")
    set(value) {
        padding(value)
    }

inline var PaginationList.Builder.linesPerPage: Int
    get() = error("Cannot get current value of builder.")
    set(value) {
        linesPerPage(value)
    }
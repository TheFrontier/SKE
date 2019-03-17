package frontier.ske.entity

import org.spongepowered.api.entity.ExperienceOrb

inline var ExperienceOrb.experience: Int
    get() = experience().get()
    set(value) {
        experience().set(value)
    }
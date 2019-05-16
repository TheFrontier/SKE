package frontier.ske.scheduler

import frontier.ske.util.unwrap
import org.spongepowered.api.scheduler.Scheduler
import org.spongepowered.api.scheduler.Task
import java.util.*

operator fun Scheduler.get(uniqueId: UUID): Task? =
        this.getTaskById(uniqueId).unwrap()

operator fun Scheduler.get(pattern: String): Set<Task> =
        this.getTasksByName(pattern)

operator fun Scheduler.get(async: Boolean): Set<Task> =
        this.getScheduledTasks(async)

operator fun Scheduler.get(plugin: Any): Set<Task> =
        this.getScheduledTasks(plugin)
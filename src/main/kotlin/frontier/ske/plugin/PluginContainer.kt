package frontier.ske.plugin

import frontier.ske.scheduler
import org.spongepowered.api.plugin.PluginContainer
import org.spongepowered.api.scheduler.SpongeExecutorService
import org.spongepowered.api.scheduler.Task
import java.util.concurrent.TimeUnit

inline val PluginContainer.scheduledTasks: Set<Task>
    get() = scheduler.getScheduledTasks(this.instance.get())

fun PluginContainer.createSyncExecutor(): SpongeExecutorService =
    scheduler.createSyncExecutor(this.instance.get())

fun PluginContainer.createAsyncExecutor(): SpongeExecutorService =
    scheduler.createAsyncExecutor(this.instance.get())

fun PluginContainer.createSyncTask(
    delay: Long = 0,
    interval: Long = 0,
    unit: TimeUnit = TimeUnit.MILLISECONDS,
    block: (Task) -> Unit
): Task =
    Task.builder()
        .delay(delay, unit)
        .interval(interval, unit)
        .execute(block)
        .submit(this.instance.get())

fun PluginContainer.createNamedSyncTask(
    name: String,
    delay: Long = 0,
    interval: Long = 0,
    unit: TimeUnit = TimeUnit.MILLISECONDS,
    block: (Task) -> Unit
): Task =
    Task.builder()
        .name(name)
        .delay(delay, unit)
        .interval(interval, unit)
        .execute(block)
        .submit(this.instance.get())

fun PluginContainer.createAsyncTask(
    delay: Long = 0,
    interval: Long = 0,
    unit: TimeUnit = TimeUnit.MILLISECONDS,
    block: (Task) -> Unit
): Task =
    Task.builder()
        .async()
        .delay(delay, unit)
        .interval(interval, unit)
        .execute(block)
        .submit(this.instance.get())

fun PluginContainer.createNamedAsyncTask(
    name: String,
    delay: Long = 0,
    interval: Long = 0,
    unit: TimeUnit = TimeUnit.MILLISECONDS,
    block: (Task) -> Unit
): Task =
    Task.builder()
        .async()
        .name(name)
        .delay(delay, unit)
        .interval(interval, unit)
        .execute(block)
        .submit(this.instance.get())
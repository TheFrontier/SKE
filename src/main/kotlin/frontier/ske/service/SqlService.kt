package frontier.ske.service

import org.spongepowered.api.service.sql.SqlService
import java.sql.SQLException
import javax.sql.DataSource

@Throws(SQLException::class)
operator fun SqlService.get(jdbcConnection: String): DataSource =
    this.getDataSource(jdbcConnection)

@Throws(SQLException::class)
operator fun SqlService.get(plugin: Any, jdbcConnection: String): DataSource =
    this.getDataSource(plugin, jdbcConnection)
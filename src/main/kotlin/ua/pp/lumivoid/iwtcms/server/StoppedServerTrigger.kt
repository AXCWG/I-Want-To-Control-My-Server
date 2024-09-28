package ua.pp.lumivoid.iwtcms.server

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents
import ua.pp.lumivoid.iwtcms.util.CustomLogger

object StoppedServerTrigger {
    fun register() {
        ServerLifecycleEvents.SERVER_STOPPED.register {
            Server.shutdown()
            CustomLogger.shutdown()
        }
    }
}
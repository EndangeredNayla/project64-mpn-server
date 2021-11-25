package org.emulinker.kaillera.model.event

import org.emulinker.kaillera.model.KailleraGame
import org.emulinker.kaillera.model.KailleraServer

data class GameClosedEvent(override val server: KailleraServer, val game: KailleraGame) :
    ServerEvent {
  override fun toString(): String {
    return "GameClosedEvent"
  }
}

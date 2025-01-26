package net.azisaba.spicyAzisaBan.velocity.events

import net.azisaba.spicyAzisaBan.events.PunishmentEvent
import net.azisaba.spicyAzisaBan.punishment.Punishment

class VelocityPunishmentEvent(punishment: Punishment): PunishmentEvent(punishment){
}
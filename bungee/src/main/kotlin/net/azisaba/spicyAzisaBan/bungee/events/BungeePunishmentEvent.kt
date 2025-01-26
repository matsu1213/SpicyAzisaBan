package net.azisaba.spicyAzisaBan.bungee.events

import net.azisaba.spicyAzisaBan.events.PunishmentEvent
import net.azisaba.spicyAzisaBan.punishment.Punishment
import net.md_5.bungee.api.plugin.Event

class BungeePunishmentEvent(punishment: Punishment): PunishmentEvent(punishment), Event {
}
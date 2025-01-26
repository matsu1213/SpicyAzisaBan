package net.azisaba.spicyAzisaBan.event

import net.azisaba.spicyAzisaBan.punishment.Punishment

interface PunishmentEvent {
    val punishment: Punishment
}
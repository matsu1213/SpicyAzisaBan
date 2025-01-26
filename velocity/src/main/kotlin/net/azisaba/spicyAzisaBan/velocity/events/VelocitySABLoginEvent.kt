package net.azisaba.spicyAzisaBan.velocity.events

import net.azisaba.spicyAzisaBan.events.SABLoginEvent
import net.azisaba.spicyAzisaBan.struct.LoginData

class VelocitySABLoginEvent(loginData: LoginData): SABLoginEvent(loginData) {
}
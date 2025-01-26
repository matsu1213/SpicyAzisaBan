package net.azisaba.spicyAzisaBan.bungee.events

import net.azisaba.spicyAzisaBan.events.SABLoginEvent
import net.azisaba.spicyAzisaBan.struct.LoginData
import net.md_5.bungee.api.plugin.Event

class BungeeSABLoginEvent(loginData: LoginData): SABLoginEvent(loginData), Event {
}
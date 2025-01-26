package net.azisaba.spicyAzisaBan.events

import net.azisaba.spicyAzisaBan.struct.LoginData

interface SABLoginEvent {
    val loginData: LoginData
}

package net.azisaba.spicyAzisaBan.struct

import java.util.UUID

data class LoginData(
    val playerData: PlayerData,
    var oldIp : String?,
    var first: Boolean,
) {
    constructor(uuid: UUID, name: String, ip: String?): this(PlayerData(uuid, name, ip, -1, -1, -1, -1, -1), ip, false)
}
package net.azisaba.spicyAzisaBan.struct

data class LoginData(
    val playerData: PlayerData,
    val oldIp : String,
    val first: Boolean,
    val login: Boolean,
) {

    constructor(uuid: UUID, name: String, ip: String): this(PlayerData(uuid, name, ip, -1, -1, -1, -1), ip, false, false)

}
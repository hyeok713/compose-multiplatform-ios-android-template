package values

import androidx.compose.runtime.Immutable
@Immutable
data class StringResources(
    val hello: String,
    val game_roulette: String,
    val enter_target: String,
    val restart: String,
    val start: String,
    val info_roulette: String,
)

fun stringResourcesEn() = StringResources(
    hello = "hello",
    game_roulette = "Roulette Game",
    enter_target = "Enter target name",
    restart = "RE-START",
    start = "START!",
    info_roulette = "You can manipulate game result.\n \'DOUBLE TAP\' to set target!"
)


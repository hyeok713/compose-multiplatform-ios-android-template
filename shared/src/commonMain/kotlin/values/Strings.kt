package values

import androidx.compose.runtime.Immutable

@Immutable
data class StringResources(
    val hello: String,
)

fun stringResourcesEn() = StringResources(
    hello = "hello",
)


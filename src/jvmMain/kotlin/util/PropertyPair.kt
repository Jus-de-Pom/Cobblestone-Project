package util

data class PropertyPair(val key: Any, val value: Any?)

infix fun Any.pairWith(other: Any?) = PropertyPair(this, other)

fun List<PropertyPair>.getWithKey(key: Any): PropertyPair? {
    this.forEach { if (it.key == key) return it }
    return null
}

package org.henry1479.children

data class Child(
    val id: Int,
    val name: String,
    val visitDays: List<String>,
    val status: Status) {
}
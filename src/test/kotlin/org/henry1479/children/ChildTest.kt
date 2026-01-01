package org.henry1479.children

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class ChildTest {
    val child1 = Child(
        1,
        "Kostya",
        listOf("пн","вт","ср"),
        Status.ABSENCE_FREE
    );
    val child2 = Child(
        1,
        "Kostya",
        listOf("пн","вт","ср"),
        Status.ABSENCE_FREE
    );
    val child3 = Child(
        3,
        "Kostya",
        listOf("пн","вт","ср"),
        Status.ABSENCE_FREE
    );
    @Test
    fun thisChildIsThatChild() {

        assertEquals(child1, child2)
    }

    @Test
    fun thisChildIsNotThatChild() {
        assertNotEquals(child1, child3)
    }


}
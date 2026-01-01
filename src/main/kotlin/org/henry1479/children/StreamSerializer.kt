package org.henry1479.children

import java.io.InputStream
import java.io.OutputStream

interface StreamSerializer<T> {
    fun doWrite(children : List<T>, output: OutputStream)
    fun doRead(input: InputStream): List<T>
}
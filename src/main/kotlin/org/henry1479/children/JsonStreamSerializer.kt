package org.henry1479.children

import org.henry1479.util.JsonParser
import java.io.InputStream
import java.io.InputStreamReader
import java.io.OutputStream
import java.io.OutputStreamWriter

class JsonStreamSerializer : StreamSerializer<Child> {


    override fun doWrite(
        children: List<Child>,
        output: OutputStream
    ) = try {
        JsonParser.write(children, OutputStreamWriter(output, Charsets.UTF_8))
    } finally {
        output.close()
    }

    override fun doRead(
        input: InputStream
    ): List<Child> = try {
        JsonParser.read(InputStreamReader(input))
    } finally {
        input.close()
    }
}

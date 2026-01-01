package org.henry1479.util


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.henry1479.children.Child
import java.io.Reader
import java.io.Writer


class JsonParser {
    companion object {
        val parser: Gson = GsonBuilder().create();
        fun <T> read(reader: Reader, resourceClass: Class<T>): T {
            return parser.fromJson<T>(reader, object : TypeToken<List<Child>>() {}.type)
        }

        fun <T> write(obj: T, writer: Writer) {
            parser.toJson(obj, writer)
        }
    }
}
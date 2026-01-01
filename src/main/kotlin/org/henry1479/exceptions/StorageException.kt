package org.henry1479.exceptions

import java.lang.Exception

open class StorageException(
    override val message: String? = null,
    open val id: Int? = null,
    val error: Exception? = null
): RuntimeException(message,error) {

}
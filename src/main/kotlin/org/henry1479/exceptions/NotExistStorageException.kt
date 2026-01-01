package org.henry1479.exceptions

class NotExistStorageException(override val id: Int?)
    : StorageException("The child with $id not exists in the storage", id)  {
}
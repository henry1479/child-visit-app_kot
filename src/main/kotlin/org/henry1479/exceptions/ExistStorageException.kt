package org.henry1479.exceptions

class ExistStorageException(override val id: Int?)
    : StorageException("The child with $id exists in the storage", id)  {
}
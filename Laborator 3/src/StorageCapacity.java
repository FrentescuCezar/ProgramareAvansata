
public interface StorageCapacity {
    int getStorageCapacity();

    default int conversion(TypeOfCapacity type) {
        int storageCapacity = getStorageCapacity();

        if (type == TypeOfCapacity.MEGABYTE)
            storageCapacity = storageCapacity * 1_000;

        if (type == TypeOfCapacity.KILOBYTE)
            storageCapacity = storageCapacity * 1_000_000;

        if (type == TypeOfCapacity.BYTE)
            storageCapacity = storageCapacity * 1_000_000_000;

        return storageCapacity;

    }
}

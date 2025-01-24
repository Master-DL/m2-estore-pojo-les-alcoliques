package bridge;

import core.StoreImpl;
import estorePojo.exceptions.UnknownItemException;

public interface ProviderBridge {

    double getPrice(Object item) throws UnknownItemException;

    int order(StoreImpl storeImpl, Object item, int qty) throws UnknownItemException;
}

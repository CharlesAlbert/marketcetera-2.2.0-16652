package org.marketcetera.quickfix;

import org.marketcetera.core.CoreException;
import org.marketcetera.util.log.I18NBoundMessage;

/**
 * Throws when the {@link FIXDataDictionary} is not found for
 * the specified version of FIX Protocol
 * @author Toli Kuznets
 * @version $Id: FIXFieldConverterNotAvailable.java 16154 2012-07-14 16:34:05Z colin $
 */
public class FIXFieldConverterNotAvailable extends CoreException {
    public FIXFieldConverterNotAvailable(Throwable nested) {
        super(nested);
    }

    public FIXFieldConverterNotAvailable(I18NBoundMessage message) {
        super(message);
    }

    public FIXFieldConverterNotAvailable(Throwable nested, I18NBoundMessage msg) {
        super(nested, msg);
    }
}

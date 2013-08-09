package org.marketcetera.core;

import org.marketcetera.util.log.I18NBoundMessage;

/**
 * Marker exception for anything that goes wrong during
 * initial app startup
 * @author Toli Kuznets
 * @version $Id: InitializationException.java 16154 2012-07-14 16:34:05Z colin $
 */
@ClassVersion("$Id: InitializationException.java 16154 2012-07-14 16:34:05Z colin $") //$NON-NLS-1$
public class InitializationException extends CoreException {

    public InitializationException(Throwable nested) {
        super(nested);
    }

    public InitializationException(I18NBoundMessage message) {
        super(message);
    }

    public InitializationException(Throwable nested, I18NBoundMessage msg) {
        super(nested, msg);
    }

}

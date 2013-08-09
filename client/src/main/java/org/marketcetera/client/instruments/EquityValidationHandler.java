package org.marketcetera.client.instruments;

import org.marketcetera.util.misc.ClassVersion;
import org.marketcetera.trade.Instrument;
import org.marketcetera.trade.Equity;
import org.marketcetera.client.OrderValidationException;

/* $License$ */
/**
 * Validates equity instruments.
 * <p>
 * No validations are performed for equity instruments.
 *
 * @author anshul@marketcetera.com
 * @version $Id: EquityValidationHandler.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
@ClassVersion("$Id: EquityValidationHandler.java 16154 2012-07-14 16:34:05Z colin $")
public class EquityValidationHandler extends InstrumentValidationHandler<Equity> {
    /**
     * Creates an instance.
     */
    public EquityValidationHandler() {
        super(Equity.class);
    }

    @Override
    public void validate(Instrument instrument) throws OrderValidationException {
        //no validations needed for equity.
    }
}

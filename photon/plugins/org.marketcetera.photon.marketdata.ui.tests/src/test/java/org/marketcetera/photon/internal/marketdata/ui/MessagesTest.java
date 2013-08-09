package org.marketcetera.photon.internal.marketdata.ui;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.marketcetera.util.l10n.MessageComparator;

/* $License$ */

/**
 * 
 *
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: MessagesTest.java 16154 2012-07-14 16:34:05Z colin $
 * @since 1.1.0
 */
public class MessagesTest
{
    @Test
    public void messagesMatch()
        throws Exception
    {
        MessageComparator comparator=new MessageComparator(Messages.class);
        assertTrue(comparator.getDifferences(),comparator.isMatch());
    }
}
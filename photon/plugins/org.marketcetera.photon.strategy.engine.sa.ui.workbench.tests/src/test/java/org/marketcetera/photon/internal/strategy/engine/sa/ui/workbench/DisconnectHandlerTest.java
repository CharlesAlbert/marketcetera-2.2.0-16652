package org.marketcetera.photon.internal.strategy.engine.sa.ui.workbench;

import static org.junit.Assert.assertFalse;

import java.util.Arrays;
import java.util.List;

import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.marketcetera.photon.internal.strategy.engine.sa.ui.workbench.DisconnectHandler;
import org.marketcetera.photon.strategy.engine.model.core.ConnectionState;
import org.marketcetera.photon.test.SWTTestUtil;
import org.marketcetera.photon.test.WorkbenchRunner;

/* $License$ */

/**
 * Tests {@link DisconnectHandler}.
 * 
 * @author <a href="mailto:will@marketcetera.com">Will Horn</a>
 * @version $Id: DisconnectHandlerTest.java 16154 2012-07-14 16:34:05Z colin $
 * @since 2.0.0
 */
@RunWith(WorkbenchRunner.class)
public class DisconnectHandlerTest extends StrategyAgentHandlerTestBase {

    public DisconnectHandlerTest() {
        super("Disconnect", "Disconnecting from");
        mEngine1.setConnectionState(ConnectionState.CONNECTED);
        mEngine2.setConnectionState(ConnectionState.DISCONNECTED);
        mEngine3.setConnectionState(ConnectionState.CONNECTED);
    }

    @Override
    protected List<BlockingEngine> getMultipleAffected() {
        return Arrays.asList(mEngine1, mEngine3);
    }

    @Override
    protected void acceptChange(BlockingEngine engine, Object object)
            throws Exception {
        engine.acceptDisconnect(object);
    }
    
    @Test
    public void testDisabled() throws Exception {
        SWTBotTree tree = mView.getView().bot().tree();
        tree.select(mEngine2.getName());
        assertFalse(SWTTestUtil.getMenuItems(tree).get("Disconnect").isEnabled());
    }
}

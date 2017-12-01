package suits;

import city24.City24FreeRequisites;
import city24.City24Pay;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import p2p.CheckP2Ppage;
import support.RequestSupport;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        City24Pay.class,
        City24FreeRequisites.class,
        CheckP2Ppage.class,
        RequestSupport.class
        }
)
public class SuitKoshik {

}

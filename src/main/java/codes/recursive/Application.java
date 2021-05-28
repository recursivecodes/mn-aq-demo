package codes.recursive;

import io.micronaut.runtime.Micronaut;
import oracle.jms.AQjmsOracleDebug;

public class Application {

    public static void main(String[] args) {
        System.setProperty("oracle.jdbc.fanEnabled", "false");
        /*
        // uncomment to enable Oracle JMC debugging. warning, it's rather verbose!
        AQjmsOracleDebug.setDebug(true);
        AQjmsOracleDebug.setTraceLevel(6);
        */

        // set the max sleep time between the listener checking for new msgs.
        // if not set, this doubles every iteration up to 15 seconds!
        System.setProperty("oracle.jms.maxSleepTime", "5000");
        Micronaut.run(Application.class, args);
    }
}

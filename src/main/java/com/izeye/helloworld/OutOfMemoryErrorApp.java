package com.izeye.helloworld;

import java.util.ArrayList;
import java.util.List;

/**
 * App triggering {@link OutOfMemoryError}.
 * <p>
 * Run as follows:
 * <pre>
 *     java -XX:StartFlightRecording=duration=200s,filename=flight.jfr -cp build/classes/java/main/ com.izeye.helloworld.OutOfMemoryErrorAp
 * </pre>
 *
 * @author Johnny Lim
 */
public class OutOfMemoryErrorApp {

    public static void main(String[] args) {
        List<Object> items = new ArrayList<>(1);
        while (true) {
            items.add(new Object());
        }
    }

}

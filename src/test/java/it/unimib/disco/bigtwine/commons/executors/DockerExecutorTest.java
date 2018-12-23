package it.unimib.disco.bigtwine.commons.executors;

import org.junit.Test;
import static org.junit.Assert.*;

public class DockerExecutorTest {

    @Test
    public void testContainerRun() {
        DockerExecutor executor = new DockerExecutor();
        executor.run();
    }
}

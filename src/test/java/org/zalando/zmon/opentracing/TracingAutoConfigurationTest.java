package org.zalando.zmon.opentracing;
import io.opentracing.NoopTracer;
import io.opentracing.Tracer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class TracingAutoConfigurationTest {

    @Configuration
    @Import(TracingAutoConfiguration.class)
    static class Config { }

    @Autowired
    private Tracer tracer;

    @Test
    public void confirmNoOpTracerByDefault() {
        assertThat(tracer, instanceOf(NoopTracer.class));
    }
}
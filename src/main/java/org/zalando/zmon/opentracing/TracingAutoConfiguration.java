package org.zalando.zmon.opentracing;

import io.opentracing.NoopTracerFactory;
import io.opentracing.Tracer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(TracingProperties.class)
public class TracingAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public Tracer noOpTracer() {
        return NoopTracerFactory.create();
    }
}

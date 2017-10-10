# ZMON OpenTracing

This project enables vendor agnostic support on ZMON's Java/Spring components.


## Features

It uses Spring Auto Configuration making it very easy to wire on Spring Boot applications.
It uses a NoOp Tracer by default and it's easy to extend with other OpenTracing implementations like [Instana](https://www.instana.com/), [LightStep](http://lightstep.com/), [Jaeger](https://uber.github.io/jaeger/), or others.

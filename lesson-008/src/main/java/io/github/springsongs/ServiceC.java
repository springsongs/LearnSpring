package io.github.springsongs;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class ServiceC {
    private ServiceA serviceA;
    private ServiceB serviceB;

    public ServiceC() {
    }


    public ServiceC(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    public ServiceC(ServiceA serviceA, ServiceB serviceB) {
        this.serviceA = serviceA;
        this.serviceB = serviceB;
    }
}

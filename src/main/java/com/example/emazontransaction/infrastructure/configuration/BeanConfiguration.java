package com.example.emazontransaction.infrastructure.configuration;

import com.example.emazontransaction.domain.api.ISupplyServicePort;
import com.example.emazontransaction.domain.spi.ISupplyPersistencePort;
import com.example.emazontransaction.domain.usecase.SupplyUseCase;
import com.example.emazontransaction.infrastructure.out.jpa.adapter.SupplyJpaAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public ISupplyServicePort supplyServicePort(ISupplyPersistencePort supplyPersistencePort) {
        return new SupplyUseCase(supplyPersistencePort);
    }

    @Bean
    public ISupplyPersistencePort supplyPersistencePort(SupplyJpaAdapter supplyJpaAdapter) {
        return supplyJpaAdapter;
    }


}

package com.board.springboot.Jpa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing  // jPA Auditing 활성화
public class JpaConfig {
}

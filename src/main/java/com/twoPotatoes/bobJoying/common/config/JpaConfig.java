package com.twoPotatoes.bobJoying.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing  // 객체가 생성되거나 변경 되었을 때 자동으로 값을 등록할 수 있도록 합니다.
public class JpaConfig {
}

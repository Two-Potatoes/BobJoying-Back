package com.twoPotatoes.bobJoying.common.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

@Getter
// 공통 맵핑 정보가 필요할 때 사용합니다. Timestamped를 상속받는 클래스는 모두 createdAt 필드가 있어야 합니다.
@MappedSuperclass
// Entity에 이벤트가 발생할 때 마다 관련 코드를 실행
@EntityListeners(AuditingEntityListener.class)
public abstract class Timestamped {

    @CreatedDate                         // 생성 일자를 관리하는 필드에 현재 날짜를 주입하는 작업을 수행
    @Column(updatable = false)           // 생성일자에 대한 필드이므로 수정 불가
    private LocalDateTime createdAt;
}

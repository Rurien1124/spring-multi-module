package com.multimodule.domain.entity;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import org.hibernate.annotations.Comment;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.FieldNameConstants;
import lombok.experimental.SuperBuilder;

/** 기본 엔티티 (순번 포함) */
@FieldNameConstants
@Getter
@MappedSuperclass
@SuperBuilder(toBuilder = true)
@FieldDefaults(level = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class BaseEntityWithSequence extends BaseEntity {

  @Comment("순번")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(nullable = false, updatable = false)
  Long seq;
}

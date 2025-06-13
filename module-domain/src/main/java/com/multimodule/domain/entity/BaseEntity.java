package com.multimodule.domain.entity;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import org.hibernate.annotations.Comment;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

/** 기본 엔티티 */
@Getter
@MappedSuperclass
@SuperBuilder( toBuilder = true )
@FieldDefaults( level = AccessLevel.PROTECTED )
@NoArgsConstructor( access = AccessLevel.PROTECTED )
public abstract class BaseEntity {

		@Comment( "생성 시각" )
		@CreationTimestamp
		@Column( columnDefinition = "DATETIME",
						nullable = false,
						updatable = false )
		LocalDateTime createdAt;

		@Comment( "수정 시각" )
		@UpdateTimestamp
		@Column( columnDefinition = "DATETIME", nullable = false )
		LocalDateTime updatedAt;
}

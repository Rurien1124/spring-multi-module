package com.multimodule.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import org.hibernate.annotations.Comment;
import org.hibernate.annotations.DynamicInsert;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.FieldNameConstants;
import lombok.experimental.SuperBuilder;

@FieldNameConstants
@FieldDefaults(level = AccessLevel.PROTECTED)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@Getter
@DynamicInsert
@Entity
@Table(name = "SAMPLE")
@Comment("샘플")
public class Sample extends BaseEntityWithSequence {

  @Comment("데이터")
  @Column(length = 1000, nullable = false)
  String data;

  public static Sample empty() {
    return new NullSample();
  }

  private static class NullSample extends Sample {

    private NullSample() {
      super.seq = 0L;
      this.data = "";
    }
  }
}

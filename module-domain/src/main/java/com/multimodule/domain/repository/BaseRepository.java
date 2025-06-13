package com.multimodule.domain.repository;

import com.multimodule.domain.entity.QSample;
import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class BaseRepository {

		private final JPAQueryFactory queryFactory;

		protected static final QSample Q_SAMPLE = QSample.sample;
}

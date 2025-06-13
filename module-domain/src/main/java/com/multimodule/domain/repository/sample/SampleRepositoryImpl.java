package com.multimodule.domain.repository.sample;

import com.multimodule.domain.repository.BaseRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;

public class SampleRepositoryImpl extends BaseRepository implements SampleRepositoryCustom {

		public SampleRepositoryImpl( JPAQueryFactory queryFactory ) {
				super( queryFactory );
		}

}

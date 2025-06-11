package com.multimodule.admin.common.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/** 매핑 경로 정의 */
@NoArgsConstructor( access = AccessLevel.PRIVATE )
public final class Paths {

		/** API 매핑 경로 정의 */
		@NoArgsConstructor( access = AccessLevel.PRIVATE )
		public static final class API {

				private static final String API_BASE_PATH = "/api";

				private static final String API_V1 = API_BASE_PATH + "/v1" ;

				public static final String SAMPLE = API_V1 + "/sample";
		}

		/** 페이지 매핑 경로 정의 */
		@NoArgsConstructor( access = AccessLevel.PRIVATE )
		public static final class Pages {

				public static final String SAMPLE = "/sample";
		}
}

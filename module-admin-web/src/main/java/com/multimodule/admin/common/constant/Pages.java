package com.multimodule.admin.common.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/** 웹 페이지 경로 정의 */
@NoArgsConstructor(access = AccessLevel.PRIVATE )
public final class Pages {

		private static final String PAGES_PATH = "pages";

		private static final String ERROR_PATH = "error";

		public static final String SAMPLE = PAGES_PATH + "/sample";

		public static final String INTERNAL_SERVER_ERROR = ERROR_PATH + "/500";

		public static final String NOT_FOUND = ERROR_PATH + "/404";
}

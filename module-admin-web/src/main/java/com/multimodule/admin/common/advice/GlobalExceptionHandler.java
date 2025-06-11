package com.multimodule.admin.common.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.extern.slf4j.Slf4j;

/** 페이지용 예외 핸들러 */
@Slf4j
@ControllerAdvice( basePackages = { "com.multimodule.admin.controller.page" } )
public class GlobalExceptionHandler {

		@ResponseStatus( HttpStatus.INTERNAL_SERVER_ERROR )
		@ExceptionHandler( Exception.class )
		public String handleUnexcpectedException( Exception e ) {
				log.error( "처리되지 않은 예외가 발생하였습니다.", e );

				// TODO: 5xx 오류 페이지 응답 추가
				return "internal_server_error";
		}
}

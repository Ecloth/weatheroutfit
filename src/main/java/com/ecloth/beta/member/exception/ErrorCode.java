package com.ecloth.beta.member.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    NOT_FOUND_USER(HttpStatus.BAD_REQUEST,"가입된 회원이 없습니다."),
    ALREADY_USE_EMAIL(HttpStatus.BAD_REQUEST,"중복된 이메일 회원이 있습니다."),
    ALREADY_USE_NICKNAME(HttpStatus.BAD_REQUEST,"이미 사용중인 닉네임입 니다."),
    INVALID_AUTH_CODE(HttpStatus.BAD_REQUEST,"유효하지 않은 인증 코드입니다.");

    private final HttpStatus httpStatus;
    private final String detail;
}

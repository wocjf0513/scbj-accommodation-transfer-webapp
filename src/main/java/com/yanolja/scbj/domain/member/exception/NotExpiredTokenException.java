package com.yanolja.scbj.domain.member.exception;

import com.yanolja.scbj.global.exception.ApplicationException;
import com.yanolja.scbj.global.exception.ErrorCode;

public class NotExpiredTokenException extends ApplicationException {

    public NotExpiredTokenException(ErrorCode errorCode) {
        super(errorCode);
    }
}

package com.yupi.maker.meta;

/**
 * @author Ma Chao
 * @version 1.0
 * @date 2024-12-04 21:06
 */
public class MetaException extends RuntimeException{
    public MetaException(String message) {
        super(message);
    }
    public MetaException(String message, Throwable cause) {
        super(message, cause);
    }
}

package me.nasif.oa.response;

public class BaseResponse<T> {

    private final Header header;
    private T data;
    
    BaseResponse(Header header, T data) {
        this.header = header;
        this.data = data;
    }

    BaseResponse(Header header) {
        this.header = header;
    }

    public Header getHeader() {
        return header;
    }

    public T getData() {
        return data;
    }

  

}

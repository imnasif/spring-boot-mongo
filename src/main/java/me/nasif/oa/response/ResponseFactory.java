package me.nasif.oa.response;

public class ResponseFactory<T> {

    public BaseResponse<T> getResponse(int statusCode, String message, T data) {
        Header header = new Header(statusCode, message);
        return new BaseResponse<>(header, data);
    }
    
     public BaseResponse<T> getResponse(int statusCode, String message) {
        Header header = new Header(statusCode, message);
        return new BaseResponse<>(header);
    }
}

package me.nasif.oa.response;

// DO NOT USE 100,101,200-206,300-307,400-417,500-505
// http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html
// Success = 800
// No Results = 6XX
// Error 50X  (>505)

public enum ResponseStatusCodes {
    InvalidParameter(506),
    SystemError(507),
    Success(800),
    NotFound(600);

    private final int applicationStatusCode;

    ResponseStatusCodes(final int statusCode) {
        this.applicationStatusCode = statusCode;
    }
    
    public int getValue(){
        return this.applicationStatusCode;
    }
}

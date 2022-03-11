package com.example.unitconversionapi.dto;

public class Response {

    private float result;
    private float fromValue;
    private String fromType;
    private String toType;

    public Response(Request request, float result){
        this.result = result;
        this.fromValue = request.getFromValue();
        this.fromType = request.getFromType();
        this.toType = request.getToType();
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }

    public float getFromValue() {
        return fromValue;
    }

    public void setFromValue(float fromValue) {
        this.fromValue = fromValue;
    }

    public String getFromType() {
        return fromType;
    }

    public void setFromType(String fromType) {
        this.fromType = fromType;
    }

    public String getToType() {
        return toType;
    }

    public void setToType(String toType) {
        this.toType = toType;
    }

    @Override
    public String toString() {
        return "Response{" +
                "result=" + result +
                '}';
    }
}

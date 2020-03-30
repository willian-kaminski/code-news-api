package br.com.kaminski.codenews.configure.validation;

public class ErroFormDto {

    private String field;
    private String message;

    public ErroFormDto(String field, String message) {
        this.field = field;
        this.message = message;
    }

    public String getField() {
        return field;
    }

    public String getMessage() {
        return message;
    }

}

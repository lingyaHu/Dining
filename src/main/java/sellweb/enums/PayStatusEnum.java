package sellweb.enums;

import lombok.Getter;

@Getter
public enum PayStatusEnum implements CodeEnum{

    WAIT(0, "Unpaid"),
    SUCCESS(1, "Paid")
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

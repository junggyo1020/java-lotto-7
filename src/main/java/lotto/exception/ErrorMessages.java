package lotto.exception;

public enum ErrorMessages {
    EMPTY_INPUT("입력값이 공백입니다.")
    ,NOT_NUMBER("입력값이 숫자가 아닙니다.")
    ,NOT_INT("입력값이 정수가 아닙니다.")
    ,NOT_POSITIVE_INT("입력값이 양의 정수가 아닙니다")
    ,OUT_OF_RANGE("숫자가 로또 번호 범위인 1이상 45이하에 존재하지 않습니다.")
    ,NUMBER_DUPLICATION("보너스 숫자 %d가 이미 로또당첨번호에 포함되어 있습니다")
    ,NOT_DIVIDED_BY_LOTTO_PRICE("입력 금액이 로또 가격으로 나누어 떨어지지 않습니다")
    ,BEYOND_LIMIT("입력 금액이 1인 구매 가능 금액(%d)을 초과하였습니다")
    ,NOT_SIX_NUMBERS("로또 번호는 총 여섯 개여야 합니다.")
    ,;

    private final String message;

    ErrorMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

package project.ccard;

import project.framework.FormModel;

public class CCardFormModel extends FormModel {

    private int ccNumber;
    private String expDate;
    private CCAccountType ccAccountType;

    public CCAccountType getCcAccountType() {
        return ccAccountType;
    }

    public void setCcAccountType(CCAccountType ccAccountType) {
        this.ccAccountType = ccAccountType;
    }

    public int getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(int ccNumber) {
        this.ccNumber = ccNumber;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

}

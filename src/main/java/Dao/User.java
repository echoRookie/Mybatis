package Dao;

public class User {
    private String CONTAINER_CODE;
    private String BARCODE;

    public String getCONTAINER_CODE() {
        return CONTAINER_CODE;
    }

    public void setCONTAINER_CODE(String CONTAINER_CODE) {
        this.CONTAINER_CODE = CONTAINER_CODE;
    }

    public String getBARCODE() {
        return BARCODE;
    }

    public void setBARCODE(String BARCODE) {
        this.BARCODE = BARCODE;
    }

    public String getMITEM_CODE() {
        return MITEM_CODE;
    }

    public void setMITEM_CODE(String MITEM_CODE) {
        this.MITEM_CODE = MITEM_CODE;
    }

    private String MITEM_CODE;
}

package com.example.lieberson.projetoretrofit2test.model;

public class RespostaServidor {

    private String result;
    private String from_value;
    private String to_type;
    private String from_type;
    private boolean valid;

    public RespostaServidor() {
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getFrom_value() {
        return from_value;
    }

    public void setFrom_value(String from_value) {
        this.from_value = from_value;
    }

    public String getTo_type() {
        return to_type;
    }

    public void setTo_type(String to_type) {
        this.to_type = to_type;
    }

    public String getFrom_type() {
        return from_type;
    }

    public void setFrom_type(String from_type) {
        this.from_type = from_type;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
}

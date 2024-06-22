package org.example.model;

public class Form {
    private String language;
    private double size;
    private boolean spamFiller = false;
    private String signature;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
       this.language = language;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isSpamFiller() {
        return spamFiller;
    }

    public void setSpamFiller(boolean spamFiller) {
        this.spamFiller = spamFiller;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Form() {
    }

    public Form(String language, double size, boolean spamFiller, String signature) {
       this.language = language;
        this.size = size;
        this.spamFiller = spamFiller;
        this.signature = signature;
    }
}

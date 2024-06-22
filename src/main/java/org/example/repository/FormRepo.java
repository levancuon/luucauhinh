package org.example.repository;

import org.example.model.Form;


public class FormRepo implements IFormRepo{

    private  Form formm = new Form("Vietnamese",25,false,"cc");

    public Form getDataForm(){
        return formm;
    }
    @Override
    public void update(Form form) {
        formm.setLanguage(form.getLanguage());
        formm.setSize(form.getSize());
        formm.setSpamFiller(form.isSpamFiller());
        formm.setSignature(form.getSignature());
    }

}

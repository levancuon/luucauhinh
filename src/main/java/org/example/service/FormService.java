package org.example.service;


import org.example.model.Form;
import org.example.repository.FormRepo;
import org.springframework.stereotype.Service;

@Service
public class FormService implements IFormService{
    private FormRepo formRepo = new FormRepo();

    @Override
    public void update(Form form) {
        formRepo.update(form);
    }

    @Override
    public Form getDataForm() {
        return formRepo.getDataForm();
    }
}

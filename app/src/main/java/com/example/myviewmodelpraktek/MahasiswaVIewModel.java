package com.example.myviewmodelpraktek;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MahasiswaVIewModel extends ViewModel {
    private MutableLiveData<String> name;

    public MutableLiveData<String> getName() {
        if(name == null){
            name = new MutableLiveData<>();
        }
        return name;
    }

    public void setName(String name) {
        this.name.postValue(name);
    }
}

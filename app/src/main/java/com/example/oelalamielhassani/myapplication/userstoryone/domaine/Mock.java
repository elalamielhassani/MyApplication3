package com.example.oelalamielhassani.myapplication.userstoryone.domaine;

import com.example.oelalamielhassani.myapplication.userstoryone.domaine.interfaces.IMock;
import com.example.oelalamielhassani.myapplication.userstoryone.interfaces.IPresenter;
import com.example.oelalamielhassani.myapplication.userstoryone.presenters.listeners.IPresenterListeners;
import com.example.oelalamielhassani.myapplication.userstoryone.utils.ConstantesOne;
import com.example.oelalamielhassani.myapplication.userstoryone.utils.ConstantesTwo;

/**
 * Created by oelalamielhassani on 23/02/2018.
 */

public class Mock implements IMock {
    public Mock(){
    }

    @Override
    public void getHello(int type) {
        String message = "";
        switch (type){
            case 1 :
                message = ConstantesOne.HELLO_FROM_CONSTANTS_ONE;
                break;
            case 2 :
                message = ConstantesTwo.HELLO_FROM_CONSTANTS_TWO;
                break;
        }
    }
}

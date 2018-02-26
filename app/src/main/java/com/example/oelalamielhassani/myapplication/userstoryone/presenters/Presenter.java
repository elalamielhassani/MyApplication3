package com.example.oelalamielhassani.myapplication.userstoryone.presenters;

import com.example.oelalamielhassani.myapplication.userstoryone.domaine.Mock;
import com.example.oelalamielhassani.myapplication.userstoryone.domaine.interfaces.IMock;
import com.example.oelalamielhassani.myapplication.userstoryone.ui.activites.listeners.IActivityView;
import com.example.oelalamielhassani.myapplication.userstoryone.interfaces.IPresenter;
import com.example.oelalamielhassani.myapplication.userstoryone.presenters.listeners.IPresenterListeners;

/**
 * Created by oelalamielhassani on 23/02/2018.
 */

public class Presenter implements IPresenter, IPresenterListeners {
    private IActivityView mActivity;
    private IMock mMock;
    private final int HELLOFROMCONSTANTESONE = 1;
    private final int HELLOFROMCONSTANTESTWO = 2;

    public Presenter(IActivityView view){
        this.mActivity= view;
        onResume();
    }
    @Override
    public void onResume() {
        loadInfos();
    }

    @Override
    public void onPause() {
        //Unregiter  event ...
    }

    void loadInfos() {
        if(mMock == null) {
            mMock = new Mock();
        }
    }

    @Override
    public void buttonHelloFromConstantesOneClicked() {
        mMock.getHello(HELLOFROMCONSTANTESONE);
    }

    @Override
    public void buttonHelloFromConstantesTwoClicked() {
        mMock.getHello(HELLOFROMCONSTANTESTWO);
    }

    public void onMessageFromMockReceved(String message) {
        String msg =         mMock.getHello(HELLOFROMCONSTANTESONE);

        onMessageFromMockReceved(message);

        mActivity.onMessageFromPresenterReceved(message);
    }
}

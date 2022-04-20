package com.salah.reactiveprogramming.RxJava;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCreate;

public class Example3Just {
    public static void main(String[] args) {
        Observable<Integer> myObservable = Observable.just(10, 21, 34);

        Observer<Integer> myObserver = new Observer<>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                System.out.println("Subscribed");
            }

            @Override
            public void onNext(@NonNull Integer integer) {
                System.out.println("onNext: " + integer);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                System.out.println("onError: ");
                e.printStackTrace();
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        };

        myObservable.subscribe(myObserver);
    }
}

package com.salah.reactiveprogramming.RxJava;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCreate;

public class Example1 {
    public static void main(String[] args) {
        Observable<Integer> myObservable = Observable.create(
                e -> {
                    e.onNext(10);
                    e.onNext(21);
                    e.onNext(34);
                }
        );

        myObservable.subscribe(System.out::println);
    }
}

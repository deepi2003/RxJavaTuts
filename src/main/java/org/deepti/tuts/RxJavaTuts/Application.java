package org.deepti.tuts.RxJavaTuts;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.ReplaySubject;

public class Application {

    public static void main(String[] args) {
        ReplaySubject<Integer> subject = ReplaySubject.create();
        subject.onNext(1);
        subject.subscribe(System.out::println);

        subject.onNext(2);
        subject.onNext(3);
        subject.subscribe( i ->System.out.println( i+10));
        subject.onNext(4);

    }
}

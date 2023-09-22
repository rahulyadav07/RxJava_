

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.ObservableOnSubscribe
import java.lang.Exception


val list = listOf(1,2,3,4,5,6,7,8,9, 10)


fun createOperator() :Observable<Int> {
    return Observable.create(ObservableOnSubscribe {
        try {
            for (i in list){
                it.onNext(i)
            }
            it.onComplete()
        }
        catch (e: Exception){
            it.onError(e)
        }
    })
}


fun deferObservable() :Observable<Int> {
    return Observable.defer {
        Observable.just(1,3,4,5,6,7,)
    }
}

// empty an Observable that emits no items but terminates normally
fun emptyObservable() :Observable<Int> {
    return Observable.empty()
}
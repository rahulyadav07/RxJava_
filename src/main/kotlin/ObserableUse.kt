

import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable


fun deferObservableUse(){
    deferObservable().subscribe(object :Observer<Int>{
        override fun onSubscribe(d: Disposable) {
         println("defer On Subscribe called")
        }

        override fun onError(e: Throwable) {
            println("defer OnError called $e")
        }

        override fun onComplete() {
            println("defer onComplete called ")
        }

        override fun onNext(value: Int) {
            println("defer onNext called $value")
        }

    })
}

fun emptyObservableUse() {
    emptyObservable().subscribe(object :Observer<Int>{
        override fun onSubscribe(d: Disposable) {
            println("defer On Subscribe called")
        }

        override fun onError(e: Throwable) {
            println("defer OnError called $e")
        }

        override fun onComplete() {
            println("defer onComplete called ")
        }

        override fun onNext(value: Int) {
            println("defer onNext called $value")
        }

    })
}
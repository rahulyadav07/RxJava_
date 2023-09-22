package rxjava

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.ObservableOnSubscribe
import java.lang.Exception

val numberList = mutableListOf(1,2,3,4,5,6,7,8,9,10,11)

// using create Operator :- ye create operator custom use krte hai like tumhe onnext and on error and complete ko apne hisab se krna hai tb





//  ye filer type oprator ke liye banaya hai . for aaye hue data ko filter kr skta hai

fun filterOperatorobser() : Observable<Int>{
 return Observable.fromIterable(numberList)

}
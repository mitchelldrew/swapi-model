package ro.kofe.swapi.model

data class Page<T>(val count:Int, val next:String, val previous:String, val results:List<T>)
package edu.knoldus

class Searching {

  def binarySearch(array: Array[Int], elem: Int): Boolean = {

    def search(start:Int,end:Int): AnyVal ={
      if(end >= start) {
        val middle = (start + end) / 2
        if (array(middle) > elem) search(start, middle - 1)
        else if (array(middle) < elem) search(middle + 1, end)
        if (array(middle) == elem) true
      }
    }

    search(0,array.length -1)



    false
  }

  def linearSearch(array: Array[Int], elem: Int): Boolean = {
    for(m <- array)
      if(m != elem) false
    true
  }
}

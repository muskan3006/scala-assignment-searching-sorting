package edu.knoldus

class Sorting {

  def insertionSort(array: Array[Int]): Array[Int] = {

    array
  }

  def selectionSort(array: Array[Int]): Array[Int] = {

    array
  }

  def bubbleSort(array: Array[Int]): Array[Int] = {
    for(counter1 <-1 until array.length){
      for(counter2 <- 0 until counter1){
        if (array(counter2) < array(counter2 + 1)){
          val temp=array(counter2 + 1)
          array(counter2 + 1) = array(counter2)
          array(counter2) = temp
        }

      }
    }

    array.reverse
  }

}


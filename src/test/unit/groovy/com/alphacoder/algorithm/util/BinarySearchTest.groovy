package com.alphacoder.algorithm.util

import com.alphacoder.alogorithm.util.BinarySearch
import spock.lang.Specification

class BinarySearchTest extends Specification{

    def 'Test BinarySearch | Element exists'(){
        given:
        def arr= new int[]{1,2,3,4,5,6,7,8}

        when:
        def result= BinarySearch.binarySearch(arr, 6)

        then:
        result==5

    }

    def 'Test BinarySearch | Element does not exists'(){
        given:
        def arr= new int[]{1,2,3,4,5,6,7,8}

        when:
        def result= BinarySearch.binarySearch(arr, 0)

        then:
        result==-1

    }

}

package com.group.libraryapp.calculator

fun main() {
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest()
    calculatorTest.minusTest()
    calculatorTest.multiplyTest()
}


class CalculatorTest {


    fun addTest() {
        //given
        val calculator = Calculator(5)

        //when
        calculator.add(3)



        //then
        //Calculator class를 data class로 했을때 테스트
//        val expectedCalculator = Calculator(8)
//        if (calculator != expectedCalculator){
//            throw IllegalArgumentException()
//        }

        //number 프로퍼티가 public으로 되어 있을때, 단 public으로 열면 setter도 접근이 가능해짐
        //팀원들끼리 Setter를 사용하지 않는다는 약속하에 public으로 열고 코드를 간결하게 쓰는걸 추천!
        if (calculator.number != 8){
            throw  IllegalArgumentException()
        }

        //number 프로퍼티를 _number로 바꾸고 아래 CustomGetter를 만들어 get으로 가져온다
//        if (calculator.number != 8) {
//            throw IllegalArgumentException()

        }


    fun minusTest(){
        //given
        val calculator = Calculator(5)

        //when
        calculator.minus(3)

        //then
        if (calculator.number != 2){
            throw  IllegalArgumentException()
        }

    }

    fun multiplyTest(){
        //given
        val calculator = Calculator(5)

        //when
        calculator.multiply(3)

        //then
        if (calculator.number != 15){
            throw  IllegalArgumentException()
        }

    }



    }
class ArmstrongNumber {

    static isArmstrongNumber(number) {
        def strNumber = number.toString()
        def length = strNumber.length()
        def sum = 0;
        for (ch in strNumber) {
            sum += Integer.parseInt(ch)**length;
        }
        sum == number
    }
}
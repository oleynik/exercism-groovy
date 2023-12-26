class DifferenceOfSquares {

    def number

    DifferenceOfSquares(num) {
        this.number = num
    }

    def squareOfSum() {
        def sum = 0
        for (i in 1..number) {
            sum += i
        }
        sum**2
    }

    def sumOfSquares() {
        def sum = 0
        for (i in 0..number) {
            sum += i**2
        }
        sum
    }

    def difference() {
        squareOfSum() - sumOfSquares()
    }
}

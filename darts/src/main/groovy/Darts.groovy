class Darts {

    static int score(x, y) {
        def r = Math.sqrt(x**2 + y**2)
        if (r <= 1) {
            10
        } else if (r <= 5) {
            5
        } else if (r <= 10) {
            1
        } else {
            0
        }
    }
}